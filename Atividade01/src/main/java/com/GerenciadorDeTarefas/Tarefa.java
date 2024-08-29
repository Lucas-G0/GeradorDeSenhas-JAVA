package com.GerenciadorDeTarefas;


public class Tarefa {
    private String nome;
    private String prazo;
    private boolean status = false;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
    }

    public void criarTarefa(String nome, String prazo){
        this.nome = nome;
        this.prazo = prazo;
    }

    public void concluirTarefa(){
        this.status = true;
    }

    public void alteraPrazo(String novoPrazo){
        this.prazo = novoPrazo;
    }

    public boolean isConcluida(){
        return this.status;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }
}
