package org.example;

import java.util.Scanner;

public class ParImpar {

    /*
    * Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e
    * exiba uma mensagem correspondente.
    */

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado % 2 == 0){
            System.out.println("O número " + numeroDigitado + " é par");
        } else {
            System.out.println("O número" + numeroDigitado + " é ímpar");
        }
    }
}
