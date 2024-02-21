import java.util.List;

//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas
//        subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico
//        para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para
//        o GeradorPrimo.
public class NumerosPrimos {

    public Boolean verificarPrimalidade(int numero){
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0){
                return false;
            }
        }
        if(numero <= 1){
            return false;
        } else {
            return true;
        }
    }

    public void listarPrimos(int limite){
        System.out.println("Números primos até + " + limite);
        for (int i = 2; i <= limite ; i++){
            if (verificarPrimalidade(i)){
                System.out.println(i + " ");
            }
        }
    }
}
