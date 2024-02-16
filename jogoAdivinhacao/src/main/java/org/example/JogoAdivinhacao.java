package org.example;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao jogo de adivinhação!");
        int numeroAleatorio = new Random().nextInt(100);
        int contador = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 100. Você tem 5 tentaivas!");

        while (contador < 5) {
            int chute = leitura.nextInt();
            contador++;

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns você acerto! O número digito foi " + chute +
                        " e o número aleatório gerado " + "foi " + numeroAleatorio);
                break;
            } else if (chute < numeroAleatorio) {
                System.out.println("O seu chute é menor que o número aleatório. Tente novamente!");
            } else {
                System.out.println("O seu chute é maior que o número aleatório. Tente novamente!");
            }
        }

        if (contador == 5){
            System.out.println("Você usou todas as suas tentativas. O número aleatório é " + numeroAleatorio);
        }
    }
}