package br.edu.utfpr.model;


public class TelevisaoNova extends Televisao implements ControleRemoto {

    public TelevisaoNova(String modelo, Integer polegadas) {
        super(modelo, polegadas);
    }

    @Override
    public void trocarCanal(Integer numCanal) {
        setCanalAtual(numCanal);
    }

    @Override
    public void aumentarVolume() {

    }

    @Override
    public void baixarVolume() {

    }

    @Override
    public void ligarPeloControle() {
        desligar();
    }

    @Override
    public void desligarPeloControle() {
        ligar();
    }

    @Override
    public void ligar() {
        setLigada(true);
        System.out.println("Seja bem vindo");
    }

    @Override
    public void desligar() {
        System.out.println("Bye");
        setLigada(false);
    }
}
