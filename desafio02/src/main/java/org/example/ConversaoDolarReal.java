package org.example;

public class ConversaoDolarReal {
    /* Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
     Considere que o valor de 1 dólar é equivalente a 4.94 reais.
     Realize a conversão do valor em dólares para reais e imprima o resultado formatado. */

    public static void main(String args[]){
        double valorEmDolares = 4.94;
        double valorEmReal = 100;

        double valorConversao = valorEmReal * valorEmDolares;

        System.out.println("O valor em dólar convertido em reais é de: " + String.format("%.2f", valorConversao));

    }
}
