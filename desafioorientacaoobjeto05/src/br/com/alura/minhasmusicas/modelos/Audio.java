package br.com.alura.minhasmusicas.modelos;

import javax.sound.midi.Soundbank;

public class Audio {

    private String titulo;
    private int duracaoMinutos;
    private int totalReproducoes;
    private int curtidas;
    private String classificacao;

    public Audio(String titulo, int duracao){
        this.titulo = titulo;
        this.duracaoMinutos = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.curtidas += 1;
    }

    public void reproduzir(){
        this.totalReproducoes += 1;
    }

    public void detalhes(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração em minutos: " + getDuracaoMinutos());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Reproduções: " + getTotalReproducoes());
        System.out.println("Classificação: " + getClassificacao());
    }


}
