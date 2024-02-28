package calculaPreco;

public class Livro extends Produto implements Calculavel{


    @Override
    public double calcularPrecoFinal() {
        return preco * 1.7;
    }
}
