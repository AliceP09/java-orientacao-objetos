import br.com.desafio.modelo.Pessoa;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){

        Pessoa alice = new Pessoa();
        alice.setNome("Alice Souza");
        alice.setIdade(23);

        Pessoa claudio = new Pessoa();
        claudio.setNome("Claudio Rodrigues");
        claudio.setIdade(36);

        Pessoa luana = new Pessoa();
        luana.setNome("Luana Dos Santos");
        luana.setIdade(58);

        Pessoa antonio = new Pessoa();
        antonio.setNome("Antonio Nunes");
        antonio.setIdade(18);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(alice);
        listaDePessoas.add(claudio);
        listaDePessoas.add(luana);
        listaDePessoas.add(antonio);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);
    }
}
