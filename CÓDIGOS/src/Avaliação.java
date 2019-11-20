import java.util.Scanner;

public class Avaliação{
    private String nome;
    private float nota;
    private String detalhes;

    public Avaliação(){};
    public Avaliação(String nome, float nota, String detalhes) {
        this.nome = nome;
        this.nota = nota;
        this.detalhes = detalhes;
    }

     @Override
    public String toString() {
        return "Avaliação do cuidador! " + "\nNome do cliente: " + nome + "\nAvaliação do serviço: " + nota +  "\nObservações: " + detalhes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
