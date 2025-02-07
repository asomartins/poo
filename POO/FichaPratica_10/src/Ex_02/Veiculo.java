package Ex_02;

import Ex_02.TipoCombustivel;

public class Veiculo {

//Atributos

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    public TipoCombustivel tipoCombustivel;
    private double consumo100;

    //Construtor

    public Veiculo(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo100) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo100 = consumo100;
    }

    public String getMarca() {
        return marca;
    }

    public void ligar() {
        int idade = 2025 - this.ano;

        if (idade > 30) {
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        }
        if (idade <= 30) {
            if (this.potencia < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMM");
            }

        }


    }

    public Veiculo corrida(Veiculo adversario) {

        if (this.potencia > adversario.potencia) {
            return this;
        } else if (this.potencia < adversario.potencia) {
            return adversario;

        } else if (this.potencia == adversario.potencia) { //Bloco de empate de potencia
            if (this.cilindrada > adversario.cilindrada) {
                return this;
            } else if (this.cilindrada < adversario.cilindrada) {
                return adversario;

            } else if (this.cilindrada == adversario.cilindrada) {//Bloco de empate de cilindrada
                if (this.ano > adversario.ano) {
                    return this;
                } else if (this.ano < adversario.ano) {
                    return adversario;
                }

            }

        }
        return null;

    }


    public double consumo100(double distancia) {
        double valorConsumo = this.consumo100 * distancia;
        return valorConsumo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }
}
