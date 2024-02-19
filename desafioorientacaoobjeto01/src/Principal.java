public class Principal {

    public static void main(String args[]){
        Pessoa pessoa = new Pessoa();
        pessoa.exibeMensagem();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.retornaDobro(10));

        Musica musica = new Musica();
        musica.titulo = "Amar é tudo";
        musica.artista = "Djavan";
        musica.anoLancamento = 1998;

        musica.exibeFichaTecnica();
        musica.avalia(10);
        musica.avalia(8);
        musica.avalia(9);

        System.out.println("Média de avaliações é de " + musica.mediaAvaliacoes());

        Carro carro = new Carro();
        carro.modelo = "A3 Sportback";
        carro.ano = 2018;
        carro.cor = "Branco";

        carro.exibeFichaTecnica();
        System.out.println("A idade do carro é de " + carro.calculaIdadeCarro() + " anos");

        Aluno aluno = new Aluno();
        aluno.nome = "Alice Pereira de Souza";
        aluno.idade = 23;

        aluno.exibeDados();
    }
}
