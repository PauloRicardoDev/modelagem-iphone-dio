package io.github.pauloricardodev;

public class AparelhoTelefonico {
    // Atributos
    private boolean chamadaAtiva;

    // Construtor
    public AparelhoTelefonico() {
        this.chamadaAtiva = false;
    }

    // Métodos
    public void ligar(String numero) {
        chamadaAtiva = true;
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        if (chamadaAtiva) {
            System.out.println("Chamada atendida.");
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

}

