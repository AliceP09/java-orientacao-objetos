import conversor.ConversorMoeda;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println("O valor do dólar em reais é: " + conversorMoeda.converterDolarParaReal(100));
    }
}
