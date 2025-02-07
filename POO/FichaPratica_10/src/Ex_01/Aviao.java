package Ex_01;

public class Aviao {
    private String numeroSerie;
    private String modelo;
    private int anoFabricacao;
    private double peso;
    private double comprimentoFuselagem;
    private double envergaduraAsas;
    private double alturaCalda;
    private int numMotores;
    private double autonomia;
    private double velocidadeMax;
    private double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCalda, int numMotores, double autonomia, double velocidadeMax, double preco) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.peso = peso;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCalda = alturaCalda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }

    public void imprimirDetalhesAviao () {
        System.out.println("N Serie:" + numeroSerie);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano Fabricação" + anoFabricacao);
        System.out.println("Autonomia" + autonomia);
        System.out.println("Comprimento Fuselagem" + comprimentoFuselagem);
        System.out.println("Envergadura Asas" + envergaduraAsas);
        System.out.println("Modelo" + modelo);
        System.out.println("Número de motores" + numMotores);
        System.out.println("Peso" + peso);
        System.out.println("Preco" + preco);
        System.out.println("Velocidade Maxima" + velocidadeMax);
    }

    public double getPreco() {
        return preco;
    }
}