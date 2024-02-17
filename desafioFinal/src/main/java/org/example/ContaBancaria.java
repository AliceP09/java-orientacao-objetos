package org.example;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nomeCliente = "Alice Pereira de Souza";
        String tipoConta = "Corrente";
        double saldo = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("\nNome do Cliente: " + nomeCliente);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo incial: " + saldo);
        System.out.println("\n**************************************************");

        String menu = """
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.println(menu);
        int opcaoDesejada = leitura.nextInt();

        while (opcaoDesejada != 4) {

            switch (opcaoDesejada){
                case 1:
                    System.out.println("O saldo atual é R$ " + String.format("%.2f", saldo));
                    break;

                case 2:
                    System.out.println("Digite o valor a receber: ");
                    double valorReceber = leitura.nextDouble();

                    if (valorReceber <= 0){
                        System.out.println("Não é possível receber um valor igual ou menor que zero.");
                        break;
                    } else {
                        saldo += valorReceber;
                        System.out.println("Saldo Atualizado R$ " + String.format("%.2f", saldo));
                        break;
                    }

                case 3:
                    System.out.println("Digite o valor a transferir: ");
                    double valorTransferencia = leitura.nextDouble();

                    if (valorTransferencia > saldo){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        break;
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Saldo Atualizado R$ " + String.format("%.2f", saldo));
                        break;
                    }

                default:
                    System.out.println(menu);
            }

            System.out.println(menu);
            opcaoDesejada = leitura.nextInt();
        }

        System.out.println("Acesso a conta finalizado com sucesso!");

    }
}