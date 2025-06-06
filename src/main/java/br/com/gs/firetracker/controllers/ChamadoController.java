package br.com.gs.firetracker.controllers;

import br.com.gs.firetracker.entities.Chamado;
import br.com.gs.firetracker.services.ChamadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/chamados")
public class ChamadoController {

    @Autowired
    private ChamadoService chamadoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Chamado> listarTodosChamados() {
        return chamadoService.listarTodosChamados();
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Chamado criarChamado(@RequestBody @Valid Chamado chamado) {
        return chamadoService.criarChamado(chamado);
    }
}
