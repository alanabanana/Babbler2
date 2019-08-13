package com.example.ifpr.tccdaalana;

import java.util.ArrayList;

public class Relatorio {
    private String apelidoDependente;
    private ArrayList<Acao> acoes;

    public String getApelidoDependente() {
        return apelidoDependente;
    }

    public void setApelidoDependente(String apelidoDependente) {
        this.apelidoDependente = apelidoDependente;
    }

    public ArrayList<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(ArrayList<Acao> acoes) {
        this.acoes = acoes;
    }
}
