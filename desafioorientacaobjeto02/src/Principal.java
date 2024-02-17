public class Principal {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNumeroConta(8054);
        contaBancaria.setSaldo(1000);

        System.out.println("Número da Conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setNome("Alice Souza");
        idadePessoa.setIdade(23);

        idadePessoa.verificaIdade();

        Produto produto = new Produto();

        produto.setNome("Sabão em pó 1kg");
        produto.setPreco(8.99);

        System.out.println(String.format("%.2f",produto.aplicarDesconto(25)));

        Aluno aluno = new Aluno();

        aluno.setNome("Alice Pereira de Souza");
        aluno.setNota(10);
        aluno.setNota(7.5);
        aluno.setNota(8.5);

        System.out.println("Média de Notas: " + String.format("%.2f", aluno.calcularMedia()));

        Livro livro = new Livro();

        livro.setTitulo("A Última Pétala");
        livro.setAutor("Kawanny Beserra");

        livro.exibeDetalhes();
    }

}
