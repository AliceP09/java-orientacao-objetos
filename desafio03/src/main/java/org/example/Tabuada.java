package org.example;

import java.util.Scanner;

public class Tabuada {
    /*
    * Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
    */

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                Criando uma tabuada
                
                Digite um número de 1 a 10:
                """);
        int numeroDigitado = leitura.nextInt();

        for (int i = 0; i<= 10; i++){
            System.out.println(numeroDigitado + " x " + i + " = " + numeroDigitado * i);
        }
    }
}
