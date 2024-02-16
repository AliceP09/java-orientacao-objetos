package org.example;

import java.util.Scanner;

public class NumeroPositivoNegativo {

    /*
     * Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
     * caso contrário, exiba "Número negativo".
     */
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}