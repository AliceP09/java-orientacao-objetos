package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{

    private String host;

    public Podcast(String titulo, int duracao, String host) {
        super(titulo, duracao);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Host: " + getHost());
    }

    @Override
    public String getClassificacao() {
        if (getTotalReproducoes() > 500){
            return "Em alta";
        } else {
            return "Top";
        }
    }
}
