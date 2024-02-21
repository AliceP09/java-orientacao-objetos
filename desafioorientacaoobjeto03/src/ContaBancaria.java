//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
//        consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um
//        método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
public class ContaBancaria {

    private String nome;
    private int numConta;

    // Usando o protected eu consigo através de uma classe que extenda a de Conta Bancária acessar diretamente o
    // atributo, sem precisar acessar o método.
    protected double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        } else
            System.out.println("O valor do saque é maior que o saldo.");
    }

    public double consultarSaldo(){
        return saldo;
    }

}
