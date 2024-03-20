package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDaAlice = new Filme("Dogville", 2003);
        filmeDaAlice.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDaAlice;

        System.out.println(filmeDaAlice.getNome());
        f1.setNome("Outro filme 2");
        System.out.println(filmeDaAlice.getNome());
        System.out.println(f1.getNome());

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaAlice);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

//        A primeira forma veio a partir do java 8, com um método para iterar a lista usando expressão lambda.
//        lista.forEach(listas -> System.out.println(listas));
//
//       A segunda forma é possível simplificar ainda mais, e é chamada de Method Reference usando '::'
//                        para referênciar o método printLn.
//        lista.forEach(System.out::println);
//
//        Esse laço permite que se percorra todos os elementos de uma lista, sem a necessidade de se preocupar com
//         índices ou o tamanho dela, tornando o código mais simples e legível
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("The Matrix", 1999);
        Filme filme3 = filme1;

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
