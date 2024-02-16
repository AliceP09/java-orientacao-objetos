package org.example;

import java.text.Format;

public class ValorProduto {
    /* Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
     Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem. */

    public static void main(String args[]){
        double precoProduto = 274.80;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor total do produto: " + precoProduto + " x quantidade: " + quantidade + " é de: " + String.format("%.2f", valorTotal));
    }
}
