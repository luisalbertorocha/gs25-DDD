package br.com.gs.firetracker.services;

import br.com.gs.firetracker.entities.Chamado;
import br.com.gs.firetracker.entities.Equipe;
import br.com.gs.firetracker.interfaces.GerenciarEquipe;
import br.com.gs.firetracker.repositories.ChamadoRepository;
import br.com.gs.firetracker.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GerenciarEquipeService implements GerenciarEquipe {

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public void checarChamados() {
        // Etapa 1: designar equipes disponíveis a chamados "Aberto"
        List<Chamado> chamadosAbertos = chamadoRepository.findByStatus("Aberto");
        List<Equipe> equipesDisponiveis = equipeRepository.findByDisponivelTrue();

        int limite = Math.min(chamadosAbertos.size(), equipesDisponiveis.size());

        for (int i = 0; i < limite; i++) {
            Chamado chamado = chamadosAbertos.get(i);
            Equipe equipe = equipesDisponiveis.get(i);

            chamado.setStatus("Em andamento");
            chamado.setProcessado(true);
            chamado.setIdEquipe(equipe.getId());

            equipe.setDisponivel(false);

            chamadoRepository.save(chamado);
            equipeRepository.save(equipe);
        }

        gerenciarEquipes();
    }

    @Override
    public void gerenciarEquipes() {
        // Finalizar chamados "Em andamento" com mais de 1 hora
        List<Chamado> chamadosEmAndamento = chamadoRepository.findByStatus("Em andamento");
        Date agora = new Date();

        for (Chamado chamado : chamadosEmAndamento) {
            if (chamado.getDataCriacao() != null) {
                long diff = agora.getTime() - chamado.getDataCriacao().getTime();
                if (diff >= 3600000) { // 1 hora
                    chamado.setStatus("Finalizado");
                    chamadoRepository.save(chamado);

                    Equipe equipe = equipeRepository.findById(chamado.getIdEquipe()).orElse(null);
                    if (equipe != null) {
                        equipe.setDisponivel(true);
                        equipeRepository.save(equipe);
                    }
                }
            }
        }
    }
}
