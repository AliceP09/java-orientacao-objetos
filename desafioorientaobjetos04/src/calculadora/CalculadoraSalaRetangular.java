package calculadora;

//Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea()
//        e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura
//        e largura como parâmetros.
public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(double valorLargura, double valorAltura) {
        return valorAltura * valorLargura;
    }

    @Override
    public double calcularPerimetro(double valorLargura, double valorAltura) {
        return 2 * (valorLargura + valorAltura);
    }

}
