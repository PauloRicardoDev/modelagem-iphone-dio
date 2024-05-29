package io.github.pauloricardodev;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    // Atributos
    private List<String> abas;
    private String paginaAtual;

    // Construtor
    public NavegadorInternet() {
        this.abas = new ArrayList<>();
        this.paginaAtual = "";
    }

    // Métodos
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        abas.add("Nova aba");
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

}

