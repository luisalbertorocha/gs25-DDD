package br.com.gs.firetracker.controllers;

import br.com.gs.firetracker.entities.Alerta;
import br.com.gs.firetracker.services.AlertaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/alerta")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Alerta> getAllChamados() {
        return alertaService.listarTodosChamados();
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Alerta criarAlerta(@RequestBody @Valid Alerta alerta) {
        return alertaService.criarAlerta(alerta);
    }
}
