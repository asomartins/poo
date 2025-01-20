package Ex_01;

import Ex_05.TipoCombustivel;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumo;

    public Carro(String marca, String modelo, int ano, int potencia, double cilindrada, double consumo, TipoCombustivel tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void ligar() {
        int idade = 2025 - this.ano;

        if (idade > 30) {
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!\nVrum-vrum-vrum");
            } else
                System.out.println("Custa a pegar... O carro está ligado! \nVrum-vrum-vrum");
        } else {
            if (this.potencia < 250)
                System.out.println("O Carro está ligado! \nVrummmmmmmmm");
            else
                System.out.println("O Carro está ligado! \nVRUUMMMMMMMM");
        }
    }

    public Carro corrida (Carro adversario) {

        if (this.potencia > adversario.potencia) {
            return this;
        } else if (this.potencia < adversario.potencia) {
            return adversario;
        } else if (this.cilindrada == adversario.cilindrada) {
            if (this.ano > adversario.ano)
                return this;
            else if (this.ano < adversario.ano)
                return adversario;

    }
        return null;
}

    public double consumoCombustivel(double consumo) {
        return consumo;
    }

}
