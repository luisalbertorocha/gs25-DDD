package br.com.gs.firetracker.repositories;

import br.com.gs.firetracker.entities.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

    public List<Chamado> findAll();
}

