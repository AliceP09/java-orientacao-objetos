//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir
//        a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo + "\nArtista: " + artista + "\nAno de Lançamento: " + anoLancamento);
    }

    void avalia(int nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }
}
