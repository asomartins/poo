package Ex_06;

import java.util.ArrayList;

public class Competicao {
    private String nomeCompeticao;
    private String paisCompeticao;
    private ArrayList<Atleta> listaAtletasCompeticao;

    public Competicao(ArrayList<Atleta> listaAtletasCompeticao, String nomeCompeticao, String paisCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
        this.paisCompeticao = paisCompeticao;
        this.listaAtletasCompeticao = listaAtletasCompeticao;
    }

    public void adicionarAtleta(Atleta novoAtleta) {
        this.listaAtletasCompeticao.add(novoAtleta);
    }

    public void imprimirInformacoes() {
        System.out.println("Nome da competição: "+this.nomeCompeticao);
        System.out.println("País: "+this.paisCompeticao);
        System.out.println("Atletas participantes:");
        for (Atleta atleta : this.listaAtletasCompeticao) {
            System.out.println(atleta.getNome());
        }
        System.out.println();
    }
}
