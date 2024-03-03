package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {

    public static void main(String args[]){
        Musica beatles = new Musica("Black Bird", "John Lennon e Paul McCartney", 3);

        for (int i = 0; i < 2351; i++){
            beatles.reproduzir();
            if ( i < 1500){
                beatles.curtir();
            }
        }

        beatles.detalhes();

        System.out.println("\n-------------------------------------------------");

        Musica nirvana = new Musica("Come As You Are", "Kurt Cobain", 4);

        for (int i = 0; i < 1240; i++){
            nirvana.reproduzir();
            if ( i < 685){
                nirvana.curtir();
            }
        }

        nirvana.detalhes();

        System.out.println("\n-------------------------------------------------");

        Podcast podePah = new Podcast("Menina veneno", 320, "Igão e Mitico");

        for (int i = 0; i < 2300; i++){
            podePah.reproduzir();
            if ( i < 1473){
                podePah.curtir();
            }
        }

        podePah.detalhes();

        System.out.println("\n-------------------------------------------------");
    }
}
