package br.edu.utfpr.model;

public abstract class Televisao {

    private String modelo;
    private Integer polegadas;
    private Integer canalAtual;
    private Integer volumeAtual;
    private Boolean ligada;

    protected String tipoTomada;

    public Televisao(String modelo, Integer polegadas) {
        this.modelo = modelo;
        this.polegadas = polegadas;
        this.canalAtual = 0;
        this.volumeAtual = 10;
        this.ligada = false;
    }

    public Integer getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(Integer canalAtual) {
        this.canalAtual = canalAtual;
    }

    public Integer getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(Integer volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Integer getPolegadas() {
        return polegadas;
    }

    public Boolean getLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public abstract void ligar();

    public abstract void desligar();
}
