package io.github.pauloricardodev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Iphone dispositivo = new Iphone();

        // Testando funcionalidades do reprodutor musical
        dispositivo.selecionarMusica("Bohemian Rhapsody - Queen");
        dispositivo.tocarMusica();
        dispositivo.pausarMusica();

        // Testando funcionalidades do aparelho telefônico
        dispositivo.ligarPara("987-654-3210");
        dispositivo.atenderChamada();
        dispositivo.iniciarCorreioVoz();

        // Testando funcionalidades do navegador de internet
        dispositivo.exibirPagina("https://www.google.com");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }
}