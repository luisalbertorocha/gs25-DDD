package br.com.gs.firetracker.services;

import br.com.gs.firetracker.entities.Chamado;
import br.com.gs.firetracker.repositories.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository chamadoRepository;

    public List<Chamado> listarTodosChamados() {
        return chamadoRepository.findAll();
    }

    public Chamado criarChamado(Chamado chamado) {
        return chamadoRepository.save(chamado);
    }
}

