package venda;

public class Servico implements Vendavel{

    private String tipoServico;

    private double precoHora;

    private double quantidadeHora;

    private double valorFinal;

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(double quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    @Override
    public double calcularPrecoFinal() {
        valorFinal = precoHora * quantidadeHora;
        return valorFinal;
    }

    @Override
    public double aplicarDescontos() {
        return valorFinal - (valorFinal * (0.24));
    }
}
