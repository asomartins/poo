package Ex_02;

public class Caminhao extends Veiculo{
    double capacidadeCargaKg;

    public Caminhao(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km, double capacidadeCargaKg) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, litros100km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double calcularViagem(double distancia, double carga) {
        double valorViagemComCarga = 0;
        if (this.capacidadeCargaKg < carga) {
            System.out.println("O caminhão não tem capacidade para levar a carga.");
        } else {
            double consumo = this.consumoCombustivel(distancia);
            double valorViagemDistancia = this.tipoCombustivel.precoLitro_Combustivel(consumo);
            valorViagemComCarga = carga * 10 * consumo / 100;

        }
        return valorViagemComCarga;
    }

    @Override
    public void ligar() {
        System.out.println("O caminhao ligou BI BI");
    }
}
