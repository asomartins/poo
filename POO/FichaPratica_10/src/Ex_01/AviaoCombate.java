package Ex_01;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;

    //Construtor

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCalda, int numMotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCalda, numMotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<Armas>();
    }

    //Inserir Armas - array
    public void adicionarArma(Armas arma) {
        armas.add(arma);
    }

    //Inserir Armas - array
    public void removerArmas(Armas armaRemovida) {
        armas.remove(armaRemovida);
    }

    //Imprimir detalhe das armas
    public void imprimirArmas() {
        System.out.println("***** ARMAS *****");

        for(int i = 0; i < armas.size() ; i++) {
            System.out.println("Arma (" + i + ")" + armas.get(i));
        }
    }

    //Imprimir detalhes do avião
    public void imprimirDetalheAviaoCombate() {
        System.out.println(" ***** Detalhes do Avião  *****");
        System.out.println("País de Origem: "+  this.paisOrigem);
        System.out.println("Camuflagem: "+  this.camuflagem);
    }
}