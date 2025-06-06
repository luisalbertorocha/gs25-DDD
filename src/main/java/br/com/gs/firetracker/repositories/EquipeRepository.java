package br.com.gs.firetracker.repositories;

import br.com.gs.firetracker.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

    public List<Equipe> findAll();

    List<Equipe> findByDisponivelTrue();
}

