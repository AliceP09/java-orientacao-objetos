import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        /* Scanner é uma classe no java usada para ler a entrada de dados. O System.in é o parêmetro que usamos
        * para identificar que a entrada de dados será pelo teclado. */
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        /* .next é o método usado para ler cada tipo de entrada diferente como: String, int, double e etc. */
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento ?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
