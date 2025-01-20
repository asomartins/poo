package Ex_07;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A Filha Perdida", "Elena Ferrante", "Romance", 176, "8551000322");
        Livro livro2 = new Livro("Hábitos Atómicos", "Elena Ferrante", "Romance", 304, "9789892345581");
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
