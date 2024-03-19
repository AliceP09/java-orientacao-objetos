package br.com.alura.defasio.modelo;

public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Produto perecível: " + super.getNome() + " Preco: " + this.getPreco() + " Quantidade: " +
                this.getQuantidade() + " Data validade: " + this.getDataValidade();
    }
}
