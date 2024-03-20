package br.com.alura.desafio;

import br.com.alura.desafio.modelo.*;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Alura");
        lista.add("Java");
        lista.add("Alice");

//        Três formas de percorrer uma lista
//        for (String itemLista: lista) {
//            System.out.println(itemLista);
//        }
//
//        lista.forEach(listaPalavras -> System.out.println(listaPalavras));

        lista.forEach(System.out::println);

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("Objeto não é um Cachorro.");
        }

        Produto bonafonte = new Produto("Água Bonafonte", 3.25);
        Produto arroz = new Produto("Arroz Tio João", 25.50);
        Produto sorvete = new Produto("Sorvete Jundiá", 11.40);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(bonafonte);
        listaProdutos.add(arroz);
        listaProdutos.add(sorvete);

        double somaItens = 0;
        for (Produto itemLista: listaProdutos) {
            somaItens += itemLista.getPreco();
        }

        double precoMedio = somaItens/ listaProdutos.size();
        System.out.println("Preço médio dos itens da lista: " + precoMedio);

        Circulo circulo = new Circulo();
        circulo.setRaio(8);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(6);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        listaFormas.forEach(f -> System.out.println(f.calcularArea()));
        
        ContaBancaria conta01 = new ContaBancaria(1234, 2000);
        ContaBancaria conta02 = new ContaBancaria(4321, 1537.75);
        ContaBancaria conta03 = new ContaBancaria(6588, 52416.85);
        
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta01);
        listaContas.add(conta02);
        listaContas.add(conta03);

        double saldoMaior = 0;
        int numeroConta = 0;
        for (ContaBancaria itens: listaContas) {
            if (saldoMaior < itens.getSaldo()){
                saldoMaior = itens.getSaldo();
                numeroConta = itens.getNumero();
            }
        }

        System.out.println("Conta com maior saldo é: " + numeroConta + " com saldo de: " + saldoMaior);
    }
}
