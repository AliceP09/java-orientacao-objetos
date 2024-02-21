package conversor;

//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
//        para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
public class ConversorMoeda implements ConversaoFinanceira{

    private double valorDolar;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacao = 4.80;
        return valorDolar * cotacao;
    }
}
