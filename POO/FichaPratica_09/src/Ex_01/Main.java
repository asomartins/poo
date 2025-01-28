package Ex_01;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("ColdPlay", 60, "Rock Alternativo", "The Scientist");
        Musica musica2 = new Musica("Queen", 60, "Rock", "Bohemian Rapsody");
        Musica musica3 = new Musica("Quim Barreiros", 60, "Heavy Metal", "Mestre da Culinária");
        Musica musica4 = new Musica("Chico Buarque", 60, "MPB", "Construção");
        Musica musica5 = new Musica("Iron Maiden", 60, "Rock", "The Trooper");
        Musica musica6 = new Musica("Taylor Swift", 60, "Pop", "Love Story");

        MusicPlayer programacao = new MusicPlayer();
        programacao.adicionarMusica(musica1);
        programacao.adicionarMusica(musica2);
        programacao.adicionarMusica(musica3);
        programacao.adicionarMusica(musica4);
        programacao.adicionarMusica(musica5);
        programacao.adicionarMusica(musica6);
        programacao.imprimirRelatorio();

        programacao.trocarMusica(0,5);
        programacao.imprimirRelatorio();

        programacao.removerMusica(2);
        programacao.imprimirRelatorio();

        System.out.println(programacao.duracao());

        programacao.removerTodasMusicas();
        programacao.imprimirRelatorio();

        System.out.println(programacao.duracao());

    }
}
