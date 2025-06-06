package br.com.gs.firetracker.scheduler;

import br.com.gs.firetracker.interfaces.GerenciarEquipe;
import br.com.gs.firetracker.interfaces.Monitoramento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MonitoramentoScheduler {

    @Autowired
    private Monitoramento monitoramento;

    @Autowired
    private GerenciarEquipe gerenciarEquipe;

    @Scheduled(fixedRate = 10000) // a cada 10 segundos
    public void verificarChamadosPeriodicamente() {
        monitoramento.checarChamados();
        System.out.println("Chamados verificados automaticamente");

        gerenciarEquipe.checarChamados();
        System.out.println("Chamados verificados automaticamente");
    }
}