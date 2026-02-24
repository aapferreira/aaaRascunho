package com.mycompany.aaarascunho;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String... args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }

        usuarios.forEach(u -> System.out.println(u.getNome()));

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
            System.out.println(u.isModerador());
        }

        usuarios.forEach(u -> {
            System.out.println(u.getNome());
            System.out.println(u.isModerador());
        });

        usuarios.forEach(u -> u.tornaModerador());

        usuarios.forEach(u -> {
            System.out.println(u.getNome());
            System.out.println(u.isModerador());
        });

    }

}

class Usuario {

    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.pontos = pontos;
        this.nome = nome;
        this.moderador = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
}
