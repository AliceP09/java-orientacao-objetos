public class Principal {
    public static void main(String[] args) {

        ModeloCarro camaro = new ModeloCarro();

        camaro.setModelo("Camaro");
        camaro.incluiPrecoMedio(194.888, 300.001, 451.006);

        camaro.exibirInfo();

        Cachorro toddy = new Cachorro();
        toddy.abanarRabo();
        toddy.emitirSom();

        Gato will = new Gato();
        will.arranharMoveis();
        will.emitirSom();

        ContaCorrente minhaConta = new ContaCorrente();

        minhaConta.setNome("Alice Souza");
        minhaConta.setNumConta(25631);
        minhaConta.descontarTarifaMensal(10);
        System.out.println("Saldo: " + minhaConta.consultarSaldo());

        minhaConta.depositar(100);
        System.out.println("Saldo: " + minhaConta.consultarSaldo());

        minhaConta.sacar(20);
        System.out.println("Saldo: " + minhaConta.consultarSaldo());

        GeradorPrimo meuPrimeiroNumeroPrimo = new GeradorPrimo();
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();

        System.out.println(meuPrimeiroNumeroPrimo.gerarProximoPrimo(7));
        System.out.println(verificadorPrimo.verificarSeEhPrimo(97));
        System.out.println(verificadorPrimo.verificarSeEhPrimo(1));

        meuPrimeiroNumeroPrimo.listarPrimos(100);


    }
}
