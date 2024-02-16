package org.example;

import java.util.Scanner;

public class CalculoArea {
    /*
    * Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    * Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    */

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                Escolha uma das opções seguintes:
                
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """);
        int opcaoEscolhida = leitura.nextInt();

        if (opcaoEscolhida == 1){
            System.out.println("""
                    Calcular área do quadrado
                    
                    Digite o valor da medida do quadrado
                    """);
            int medidaQuadrado = leitura.nextInt();
            System.out.println("O cálculo da área do quadrado é " + medidaQuadrado * medidaQuadrado);
        } else {
            System.out.println("""
                    Calcular área do círculo
                    
                    Digite o valor do raio do círculo
                    """);
            int raioCirculo = leitura.nextInt();
            double valorPi = 3.14;
            System.out.println("O cálculo da área do círculo é " + valorPi * (raioCirculo * raioCirculo));
        }
    }
}
