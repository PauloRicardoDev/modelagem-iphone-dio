package io.github.pauloricardodev;

public class ReprodutorMusical {

    // Atributos
    private String musicaAtual;
    private boolean isPlaying;

    // Construtor
    public ReprodutorMusical() {
        this.musicaAtual = "";
        this.isPlaying = false;
    }

    // Métodos
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            isPlaying = true;
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void pausar() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

}

