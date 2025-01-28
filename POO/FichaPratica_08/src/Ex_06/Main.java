package Ex_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(1.7, "Ginástica", "Julio Pereira", "Brasil", 60);
        Atleta atleta2 = new Atleta(1.6, "Ginástica", "Diego Hipólyto", "Brasil", 80);

        ArrayList<Atleta> listaAtletas = new ArrayList<>();
        listaAtletas.add(atleta1);
        listaAtletas.add(atleta2);

        Competicao competicao = new Competicao(listaAtletas, "Campeonato Brasileiro de Ginástica", "Brasil");
        competicao.imprimirInformacoes();

        Atleta atleta3 = new Atleta(1.65, "Ginástica", "João Almeida", "Brasil", 100);
        competicao.adicionarAtleta(atleta3);
        competicao.imprimirInformacoes();
    }
}
