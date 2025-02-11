package Ex_02;

public class Carro extends Veiculo{
    int quantidadePassageiros;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo100, int quantidadePassageiros) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo100);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    //Metodo para calcular o custo
    public double calcularCusto(double distancia) {
        TipoCombustivel tipoCombustivel = this.getTipoCombustivel();
        double consumo = this.consumoCombustivel(distancia);

        return this.getTipoCombustivel().precoLitro_Combustivel(consumo);
    }

    @Override
    public void ligar() {
        System.out.println("O carro ligou.... vrum vrum");
    }
}
