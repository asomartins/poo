package Ex_05;

public class Carro {
    String marca;
    String modelo;
    int anoDeFabricacao;

    public Carro(String marca, String modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String ligar() {
        return "O carro está ligado";
    }
}
