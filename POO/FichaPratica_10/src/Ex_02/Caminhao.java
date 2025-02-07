package Ex_02;

public class Caminhao extends Veiculo{
    double capacidadeCargaKg;

    public Caminhao(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo100) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo100);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double calcularViagem(double distancia, double carga) {
        double consumo = this.consumo100(distancia);
        double valorViagemDistancia = this.tipoCombustivel.precoLitro_Combustivel(consumo);
        double valorViagemComCarga = carga * consumo;

        return valorViagemComCarga;
    }

    @Override
    public void ligar() {
        System.out.println("O caminhao ligou BI BI");
    }
}
