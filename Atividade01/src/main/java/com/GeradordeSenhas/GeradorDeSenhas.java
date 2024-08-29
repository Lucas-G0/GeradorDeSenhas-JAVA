package com.GeradordeSenhas;

import java.util.HashMap;
import java.util.Random;

public class GeradorDeSenhas {
    private long caracteres;
    private boolean minusculas;
    private boolean maiusculas;
    private boolean numeros;
    private boolean simbolos;
    private String senha;

    public GeradorDeSenhas(long caracteres, boolean maiusculas, boolean minusculas, boolean numeros, boolean simbolos) {
        this.caracteres = caracteres;
        this.maiusculas = maiusculas;
        this.minusculas = minusculas;
        this.numeros = numeros;
        this.simbolos = simbolos;
    }

    public boolean isValid(){
        if (!this.simbolos && !this.maiusculas && !this.minusculas && !this.numeros) {
            return false;
        } else {
            return true;
        }
    }

    public void gerarSenha() {
        if (this.isValid()){
            final Random gerador = new Random();

            HashMap<String, String> opcoes = new HashMap<String, String>();

            if (this.simbolos) {
                opcoes.put("simbolos", "!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/");
            }

            if (this.minusculas) {
                opcoes.put("minusculas", "abcdefghitjklmnopqrstuvwxyz");
            }

            if (this.numeros) {
                opcoes.put("numeros", "0123456789");
            }

            if (this.maiusculas) {
                opcoes.put("maiusculas", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            }

            String opcoesStr = "";
            String senha = "";

            for (String opKey : opcoes.keySet()) {
                opcoesStr += opcoes.get(opKey);
            }

            for (int i = 0; i < caracteres; i++) {
                senha += opcoesStr.charAt(gerador.nextInt(opcoesStr.length()));
            }

            this.senha = senha;
        } else {
            System.out.println("Você deve escolher pelo menos uma categoria para a senha!");
        }
    }

    public String getSenha() {
        return senha;
    }
}
