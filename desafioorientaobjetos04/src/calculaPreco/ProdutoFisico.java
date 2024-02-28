package calculaPreco;

public class ProdutoFisico extends Produto implements Calculavel{

    @Override
    public double calcularPrecoFinal() {
        return preco - 2.0;
    }
}
