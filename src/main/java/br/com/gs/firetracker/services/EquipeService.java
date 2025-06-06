package br.com.gs.firetracker.services;

import br.com.gs.firetracker.entities.Equipe;
import br.com.gs.firetracker.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRepository;

    public List<Equipe> listarTodasEquipes() {
        return equipeRepository.findAll();
    }

    public Equipe criarEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}

