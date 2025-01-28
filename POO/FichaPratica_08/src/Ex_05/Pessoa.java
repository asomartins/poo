package Ex_05;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int idade, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }
}
