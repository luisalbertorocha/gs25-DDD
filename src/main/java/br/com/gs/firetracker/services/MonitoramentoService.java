package br.com.gs.firetracker.services;

import br.com.gs.firetracker.entities.Chamado;
import br.com.gs.firetracker.entities.Alerta;
import br.com.gs.firetracker.interfaces.Monitoramento;
import br.com.gs.firetracker.repositories.ChamadoRepository;
import br.com.gs.firetracker.repositories.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MonitoramentoService implements Monitoramento {

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private AlertaRepository alertaRepository;

    private final Set<Integer> chamadosProcessados = new HashSet<>();

    @Override
    public void checarChamados() {
        List<Chamado> chamados = chamadoRepository.findByProcessadoFalse();

        for (Chamado chamado : chamados) {
            processarChamado(chamado);
            chamado.setProcessado(true);
            chamadoRepository.save(chamado);
        }
    }

    @Override
    public void processarChamado(Chamado chamado) {
        Alerta alerta = new Alerta();
        alerta.setLocal(chamado.getLocal());
        alerta.setMensagem("Foco de incendio detectado em: " + chamado.getLocal());
        alertaRepository.save(alerta);
    }
}
