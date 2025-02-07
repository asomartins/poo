package Ex_02;

public class Carro extends Veiculo{
    int quantidadePassageiros;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo100, int quantidadePassageiros) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo100);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public double calcularViagem(TipoCombustivel tipoCombustivel, double distancia) {
        double consumo = this.consumo100(distancia);
        double valorViagem = this.tipoCombustivel.precoLitro_Combustivel(consumo);

        return valorViagem;
    }

    @Override
    public void ligar() {
        System.out.println("O carro ligou.... vrum vrum");
    }
}
