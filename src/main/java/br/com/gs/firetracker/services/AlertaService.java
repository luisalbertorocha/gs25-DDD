package br.com.gs.firetracker.services;

import br.com.gs.firetracker.entities.Alerta;
import br.com.gs.firetracker.repositories.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository alertaRepository;

    public List<Alerta> listarTodosChamados() {
        return alertaRepository.findAll();
    }

    public Alerta criarAlerta(Alerta alerta) {
        if (alerta != null) {
            if (alerta.getMensagem() == null || alerta.getMensagem().isBlank()) {
                alerta.setMensagem("Alerta de foco de incendio registrado na região: " + alerta.getLocal());
            }
        }
        return alertaRepository.save(alerta);
    }
}

