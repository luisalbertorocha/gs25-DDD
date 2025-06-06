package br.com.gs.firetracker.interfaces;

import br.com.gs.firetracker.entities.Chamado;

public interface Monitoramento {
    void checarChamados();
    void processarChamado(Chamado chamado);
}