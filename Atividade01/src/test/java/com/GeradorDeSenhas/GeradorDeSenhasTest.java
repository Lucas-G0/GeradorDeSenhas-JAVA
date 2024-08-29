package com.GeradorDeSenhas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeradorDeSenhasTest {

        @Test
        public void testGerarSenhaComApenasLetrasMinusculas() {
            GeradorDeSenhas geradorDeSenhas = new GeradorDeSenhas(10, false ,true ,false, false);
            geradorDeSenhas.gerarSenha();
            String senha = geradorDeSenhas.getSenha();

            assertEquals(10, senha.length());
            assertTrue(senha.matches("[a-z]+"));
        }

        @Test
        public void testGerarSenhaComLetrasMaiusculasEMinusculas() {
            GeradorDeSenhas geradorDeSenhas = new GeradorDeSenhas(12, true ,true ,false, false);
            geradorDeSenhas.gerarSenha();
            String senha = geradorDeSenhas.getSenha();

            assertEquals(12, senha.length());
            assertTrue(senha.matches("[a-zA-Z]+"));
        }

        @Test
        public void testGerarSenhaComNumerosESimbolos() {
            GeradorDeSenhas geradorDeSenhas = new GeradorDeSenhas(15, false ,false ,true, true);
            geradorDeSenhas.gerarSenha();
            String senha = geradorDeSenhas.getSenha();
            char backslash = (char)92;
            String option = "[0-9!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/" + backslash + "\\]+";
            assertEquals(15, senha.length());
            assertTrue(senha.matches(option));
        }

        @Test
        public void testGerarSenhaComTodosOsCaracteres() {
            GeradorDeSenhas geradorDeSenhas = new GeradorDeSenhas(20, true ,true ,true, true);
            geradorDeSenhas.gerarSenha();
            String senha = geradorDeSenhas.getSenha();
            char backslash = (char)92;
            String option = "[A-Za-z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/" + backslash + "\\]+";
            assertEquals(20, senha.length());
            assertTrue(senha.matches(option));
        }

        @Test
        public void testGerarSenhaComTamanhoZero() {
            GeradorDeSenhas geradorDeSenhas = new GeradorDeSenhas(0, true ,true ,true, true);
            geradorDeSenhas.gerarSenha();
            String senha = geradorDeSenhas.getSenha();

            assertEquals(0, senha.length());
        }
}