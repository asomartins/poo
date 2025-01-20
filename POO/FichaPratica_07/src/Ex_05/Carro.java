package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private int anoDeFabricacao;

    public Carro(String marca, String modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String ligar() {
        return "O carro está ligado";
    }
}
