package org.example;

public class CalculaDesconto {
    /*
        Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
    representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e
    atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
    aplique-o ao preço original e imprima o novo preço com desconto. */

    public static void main(String args[]){
        double precoOriginal = 23.60;
        double percentualDesconto = 25;

        double valorDesconto = precoOriginal * (percentualDesconto/100);

        double resultadoDesconto = precoOriginal - valorDesconto;

        System.out.println("O valor final do produto com desconto é de " + String.format("%.2f", resultadoDesconto));
    }
}
