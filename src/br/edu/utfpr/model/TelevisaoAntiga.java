package br.edu.utfpr.model;

public class TelevisaoAntiga  extends Televisao {

    public TelevisaoAntiga(String modelo, Integer polegadas) {
        super(modelo, polegadas);
    }

    @Override
    public void ligar() {
        setLigada(true);
    }

    @Override
    public void desligar() {
        setLigada(false);
    }
}