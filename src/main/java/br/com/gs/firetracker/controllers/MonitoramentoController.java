package br.com.gs.firetracker.controllers;

import br.com.gs.firetracker.interfaces.Monitoramento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/monitoramento")
public class MonitoramentoController {

    @Autowired
    private Monitoramento monitoramento;

    @PostMapping("/monitorar")
    public ResponseEntity<Void> checarChamados() {
        monitoramento.checarChamados();
        return ResponseEntity.ok().build();
    }
}
