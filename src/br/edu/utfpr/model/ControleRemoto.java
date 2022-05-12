package br.edu.utfpr.model;

public interface ControleRemoto {
    public void trocarCanal(Integer numCanal);
    void aumentarVolume();
    void baixarVolume();
    void ligarPeloControle();
    void desligarPeloControle();
}
