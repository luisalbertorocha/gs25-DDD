package br.com.gs.firetracker.controllers;

import br.com.gs.firetracker.entities.Chamado;
import br.com.gs.firetracker.services.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    @Autowired
    private ChamadoService chamadoService;

    @GetMapping
    public List<Chamado> getAllChamados() {
        return chamadoService.listarTodosChamados();
    }
}
