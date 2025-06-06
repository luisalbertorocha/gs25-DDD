package br.com.gs.firetracker.controllers;

import br.com.gs.firetracker.entities.Equipe;
import br.com.gs.firetracker.interfaces.Monitoramento;
import br.com.gs.firetracker.services.EquipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/equipe")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Equipe> getAllEquipes() {
        return equipeService.listarTodasEquipes();
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Equipe criarEquipe(@RequestBody @Valid Equipe equipe) {
        return equipeService.criarEquipe(equipe);
    }
}
