//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para
//        definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
//        Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para
//        definir preços e mostrar informações.
public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }


    public double getPrecoAno2() {
        return precoAno2;
    }


    public double getPrecoAno3() {
        return precoAno3;
    }


    public void incluiPrecoMedio(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculaMenorPreco(){
        return Math.min(Math.min(precoAno1, precoAno2), precoAno3);
    }

    public double calculaMaiorPreco(){
        return Math.max(Math.min(precoAno1, precoAno2), precoAno3);
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calculaMenorPreco());
        System.out.println("Maior Preço: " + calculaMaiorPreco());
    }
}
