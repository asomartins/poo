package Ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private int peso;
    private String paisOrigem;

    public Atleta(double altura, String modalidade, String nome, String paisOrigem, int peso) {
        this.altura = altura;
        this.modalidade = modalidade;
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
