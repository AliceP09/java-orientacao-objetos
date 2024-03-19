import br.com.alura.defasio.modelo.Produto;
import br.com.alura.defasio.modelo.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Produto produto1 = new Produto("OMO", 5.74, 10);
        Produto produto2 = new Produto("Biscoito Oreo", 2.25, 9);
        Produto produto3 = new Produto("Whey Protein", 98.05, 2);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: "+ listaProdutos.size());
        System.out.println(listaProdutos.get(2).getNome());

        System.out.println(listaProdutos);

        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 4.78, 10, "05/05/2024");
        System.out.println(leite);
    }

}
