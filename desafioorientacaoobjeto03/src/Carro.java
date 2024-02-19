//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para
//        definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
//        Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para
//        definir preços e mostrar informações.
public class Carro {

    private String modelo;
    private double precoMedio;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void calculaPreco(){

    }
}
