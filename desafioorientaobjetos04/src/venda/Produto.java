package venda;

public class Produto implements Vendavel{

    private double precoUnitario;

    private int quantidade;

    private double valorFinal;

    private String nome;

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    @Override
    public double calcularPrecoFinal() {
        valorFinal = precoUnitario * quantidade;
        return valorFinal;
    }

    @Override
    public double aplicarDescontos() {
        return valorFinal - (valorFinal * 0.35);
    }
}
