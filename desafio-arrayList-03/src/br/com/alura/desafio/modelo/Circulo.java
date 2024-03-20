package br.com.alura.desafio.modelo;

public class Circulo implements Forma{

    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
