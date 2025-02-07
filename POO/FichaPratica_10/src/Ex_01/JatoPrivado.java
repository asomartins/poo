package Ex_01;

import java.util.ArrayList;

public class JatoPrivado extends Aviao{
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;
    private ArrayList<Instalacoes> instalacoes;

    //Construtor

    public JatoPrivado(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCalda, int numMotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(numSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCalda, numMotores, autonomia, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacoes>();
    }

    public void adicionarInstalacoes(Instalacoes instalacoes) {
        this.instalacoes.add(instalacoes);
    }

    public void removerInstalacoes(Instalacoes instalacaoRemover) {
        instalacoes.remove(instalacaoRemover);
    }

    //Detalhes da lista de instalações
    public void listarInstalacoes() {
        System.out.println("***** INSTALAÇÕES *****");
        for (int i = 0; i < instalacoes.size(); i++) {
            System.out.println("Item (" + i + ") - " + instalacoes.get(i));
        }
    }


    //Detalhes do jato
    public void imprimirDetalhesJato () {
        System.out.println(" ***** Detalhes do Jato Particular *****");
        System.out.println("Lotação: "+ + this.lotacao);
        System.out.println("Capacidade Categoria: "+ + this.capacidadeBagagem);
        System.out.println("Categoria: "+ this.categoria);
        System.out.println("******************************************");
    }
}