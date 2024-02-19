import java.util.Calendar;
import java.util.GregorianCalendar;

//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Carro {

    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor);
    }

    int calculaIdadeCarro(){
        Calendar cal = GregorianCalendar.getInstance();
        return cal.get(Calendar.YEAR) - ano;
    }
}
