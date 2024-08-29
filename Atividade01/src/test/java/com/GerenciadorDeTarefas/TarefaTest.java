package com.GerenciadorDeTarefas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test
    public void testValorestIniciais() {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "2024-09-01");

        assertEquals("Estudar Java", tarefa1.getNome());
        assertEquals("2024-09-01", tarefa1.getPrazo());
        assertFalse(tarefa1.isConcluida());
    }

    @Test
    public void testConcluirTarefa() {
        Tarefa tarefa2 = new Tarefa("Estudar Java", "2024-09-01");
        tarefa2.concluirTarefa();

        assertTrue(tarefa2.isConcluida());
    }

    @Test
    public void testAlteraPrazo() {
        Tarefa tarefa3 = new Tarefa("Estudar Java", "2024-09-01");
        tarefa3.alteraPrazo("2024-09-10");

        assertEquals("2024-09-10", tarefa3.getPrazo());
    }
}