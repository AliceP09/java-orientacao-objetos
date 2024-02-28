import calculaPreco.Livro;
import calculaPreco.ProdutoFisico;
import calculadora.CalculadoraSalaRetangular;
import conversor.ConversorMoeda;
import tabuada.TabuadaMultiplicacao;
import temperatura.ConversorTemperaturaPadrao;
import venda.Produto;
import venda.Servico;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println("O valor do dólar em reais é: " + conversorMoeda.converterDolarParaReal(100));

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        System.out.println("\nO valor da area de uma sala retangular com base de 12cm e altura de 5cm é: " +
                calculadoraSalaRetangular.calcularArea(12, 5));

        System.out.println("\nO valor do perímetro de uma sala retangular com base de 11cm e altura de 7cm é: " +
                calculadoraSalaRetangular.calcularPerimetro(11, 7));

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();

        System.out.println("\n");
        tabuadaMultiplicacao.mostrarTabuada(10);
        System.out.println("\n");
        tabuadaMultiplicacao.mostrarTabuada(6);

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        System.out.println("\nConversor de celsius para Fahrenheit: " +
                String.format("%.1f", conversorTemperaturaPadrao.celsiusParaFahrenheit(37)));
        System.out.println("\nConversor de fahrenheit para celsius: " +
                String.format("%.1f",conversorTemperaturaPadrao.fahrenheitParaCelsius(98.6)));

        Livro livro = new Livro();

        livro.setNome("A última pétala");
        livro.setPreco(20);
        System.out.println("\nLivro: " + livro.getNome() + ", Preco: " + livro.getPreco() +
                ", Preco Final (Com descontos e taxas): " + String.format("%.2f", livro.calcularPrecoFinal()));

        ProdutoFisico produtoFisico = new ProdutoFisico();

        produtoFisico.setNome("Biscoito Oreo");
        produtoFisico.setPreco(2.84);
        System.out.println("\nProduto: " + produtoFisico.getNome() + ", Preco: " + produtoFisico.getPreco() +
                ", Preco Final(Com descontos e taxas): " + String.format("%.2f",produtoFisico.calcularPrecoFinal()));

        Produto produto = new Produto();
        produto.setNome("Teclado Led");
        produto.setPrecoUnitario(84.74);
        produto.setQuantidade(3);

        System.out.println("\nProduto: " + produto.getNome() + ", PrecoUnitário: " + produto.getPrecoUnitario() +
                ", Qtde: " + produto.getQuantidade() + ", Preco Final: " +
                String.format("%.2f", produto.calcularPrecoFinal()) + ", Desconto Aplicado: "
                + String.format("%.2f", produto.aplicarDescontos()));

        Servico servico = new Servico();
        servico.setTipoServico("Instalação Internet");
        servico.setPrecoHora(100);
        servico.setQuantidadeHora(2);

        System.out.println("\nServico: " + servico.getTipoServico() + ", Preço por hora: " + servico.getPrecoHora() +
                ", Qtde hora: " + servico.getQuantidadeHora() + ", Preco Final: " +
                String.format("%.2f", servico.calcularPrecoFinal()) + ", Desconto Aplicado: "
                + String.format("%.2f", servico.aplicarDescontos()));
    }
}
