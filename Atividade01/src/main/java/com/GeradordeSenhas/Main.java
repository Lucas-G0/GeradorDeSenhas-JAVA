package com.GeradordeSenhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GERADOR DE SENHAS\n\n");

        System.out.println("Informe a quantidade de caracteres: ");
        int qtd = sc.nextInt();

        System.out.println("\nVocê deseja que contenha letras maiúsculas?\n1- Sim\n2- Não");
        boolean maiusculas = sc.nextInt() == 1 ? true : false;

        System.out.println("\n\nVocê deseja que contenha letras minúsculas?\n1- Sim\n2- Não");
        boolean min = sc.nextInt() == 1 ? true : false;

        System.out.println("\n\nVocê deseja que contenha números?\n1- Sim\n2- Não");
        boolean num = sc.nextInt() == 1 ? true : false;

        System.out.println("\n\nVocê deseja que contenha símbolos?\n1- Sim\n2- Não");
        boolean simb = sc.nextInt() == 1 ? true : false;

        GeradorDeSenhas gerador = new GeradorDeSenhas(qtd, maiusculas, min, num, simb);
        String senha = gerador.gerarSenha();

        System.out.println("\nSENHA CRIADA COM SUCESSO!\n\n");
        System.out.println("Senha: " + senha);
    }
}