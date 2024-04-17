package br.com.alura.modelo.principal;

import br.com.alura.modelo.CartaoCredito;
import br.com.alura.modelo.Compra;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem-vindo!");
        System.out.println("Digite o limite de seu cartão de crédito: ");
        double limite = leitura.nextDouble();

        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        System.out.println("Digite 0 para sair ou 1 para continuar: ");
        int finalizar = leitura.nextInt();

        while (finalizar == 1){
            System.out.println("Digite produto que deseja comprar: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);

            if (cartaoCredito.lancaCompra(compra)){
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                finalizar = leitura.nextInt();
            } else {
                System.out.println("\nSua compra foi negada por falta de limite no cartão!");
                Collections.sort(cartaoCredito.getCompras());
                for (Compra c: cartaoCredito.getCompras()){
                    System.out.println(c.getDescricao() + " - " + c.getValor());
                }
                System.out.println("\nSaldo do Cartão: " + cartaoCredito.getSaldo());

                System.out.println("\nDigite 0 para sair ou 1 para continuar: ");
                finalizar = leitura.nextInt();
            }
        }

        System.out.println("Sistema finalizado com sucesso!");
    }
}
