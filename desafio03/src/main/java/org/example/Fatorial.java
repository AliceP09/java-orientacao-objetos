package org.example;

import java.util.Scanner;

public class Fatorial {
    /*
    * Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
    */

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para o cálculo de fatorial");
        int numeroDigitado = leitura.nextInt();
        int totalFatorial = 0;

        for (int i = 0; i <= numeroDigitado; i++){
            if (i == 0 ){
                totalFatorial = 1;
            } else {
                totalFatorial = (totalFatorial * i);
            }

            System.out.println("!" + i + " = " + totalFatorial);
        }
    }
}
