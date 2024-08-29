package com.PontuacaoDeJogo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PontuacaoTest {

    @Test
    public void testAdicionarPontos() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.adicionarPontos(10);

        assertEquals(10, pontuacao.getPontuacao());
    }

    @Test
    public void testRemoverPontos() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.adicionarPontos(10);
        pontuacao.removerPontos(5);

        assertEquals(5, pontuacao.getPontuacao());
    }

    @Test
    public void testPontuacaoNegativa() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.adicionarPontos(10);
        pontuacao.removerPontos(15); //remover mais que o disponível

        assertEquals(10, pontuacao.getPontuacao()); //pontuação nao deve ser alterada
    }
}