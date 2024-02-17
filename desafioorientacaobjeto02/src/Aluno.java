//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
// modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Aluno {

    private String nome;
    private double nota;
    private int totalNotas = 0;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota += nota;
        totalNotas++;
    }

    public double calcularMedia(){
        return nota/ totalNotas;
    }

}
