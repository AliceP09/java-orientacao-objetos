package br.com.alura.modelo;

public class Titulo implements Comparable<Titulo> {
    private String Titulo;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getTitulo().compareTo(o.getTitulo());
    }

    @Override
    public String toString() {
        return this.getTitulo();
    }
}
