package org.example;

import java.util.Scanner;

public class Comparacao {

    /*
    * Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
    * iguais, diferentes, o primeiro é maior ou o segundo é maior.
    */

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        int primeiroNumero = leitura.nextInt();

        System.out.println("Digite segundo número: ");
        int segundaNumero = leitura.nextInt();

        if (primeiroNumero != segundaNumero){
            if (primeiroNumero > segundaNumero){
                System.out.println("Os dois números são diferentes e o primeiro é maior que o segundo.");
            } else {
                System.out.println("Os dois números são diferentes e o primeiro é menor que o segundo.");
            }
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
