package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String compositor;

    public Musica(String titulo, String autor, int duracao) {
        super(titulo, duracao);
        this.compositor = autor;
    }

    public String getCompositor() {
        return compositor;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Compositor: " + getCompositor());
    }

    @Override
    public String getClassificacao() {
        if (getTotalReproducoes() > 1000){
            return "Em alta";
        } else {
             return "Top";
        }

    }

}
