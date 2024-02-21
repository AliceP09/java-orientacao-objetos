import java.util.Random;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int ultimoNumero){
        int proximo = ultimoNumero + 1;

        while (!verificarPrimalidade(proximo)){
            proximo++;
        }

        return proximo;
    }

}
