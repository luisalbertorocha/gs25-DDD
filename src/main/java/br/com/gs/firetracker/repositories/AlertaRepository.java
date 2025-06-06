package br.com.gs.firetracker.repositories;

import br.com.gs.firetracker.entities.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertaRepository extends JpaRepository<Alerta, Integer> {

    public List<Alerta> findAll();
}
