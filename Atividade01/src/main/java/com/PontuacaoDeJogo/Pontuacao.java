package com.PontuacaoDeJogo;

public class Pontuacao {
    private int pontos;

    public void adicionarPontos(int pontos){
        this.pontos += pontos;
    }

    public void removerPontos(int pontos){
        if (this.pontos < pontos){
            System.out.println("Pontos não podem ser negativos!");
        } else {
            this.pontos -= pontos;
        }
    }

    public int getPontuacao(){
        return this.pontos;
    }
}
