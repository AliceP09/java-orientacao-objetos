package br.com.alura.desafio.modelo;

public class Quadrado implements Forma{

    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
