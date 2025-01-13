package Ex_02;

public class Cachorro {
    String nome;
    String raca;
    String latido = "au au au";

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void latir() {
        System.out.println(latido);
    }

    public void setLatido(String novoLatido) {
        this.latido = novoLatido;
    }
}
