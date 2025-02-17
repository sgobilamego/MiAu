import java.util.ArrayList;

public class Cliente{
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private String endereço;
    private ArrayList<Pet> pets;

    public Cliente(){};
    public Cliente(String nome, String sobrenome, int idade, String cpf, String endereço) {}
    public Cliente(String nome, String sobrenome, int idade, String CPF, String endereço, ArrayList<Pet> pets){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereço = endereço;
        this.pets = new ArrayList<Pet>();
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                ", endereço='" + endereço + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void fazerAvalaiação(Avaliação avaliação){
        System.out.println(avaliação);
    }

    //mudanças, ao invés de um método para escolher a classe passeio, creche ou hospedagem, criei os metodos das três.
    public void hospedagem(String entrada, String saida, float periodo, String local, String detalhes){
        Hospedagem hospedagem = new Hospedagem(entrada, saida, periodo, local, detalhes);
    }

    public void creche(String data, float hora, float duracao, String detalhes){
        Creche creche = new Creche(data, hora, duracao, detalhes);
    }

    public void passeio(String data, float hora, float duracao, String detalhes){
        Passeio passeio = new Passeio(data, hora, duracao, detalhes);
    }

    public void cadastrarPet(String nomePet, int idadePet, String tipo, String detalhes){
        Pet animal = new Pet(nomePet, idadePet, tipo, detalhes);
    }
}
