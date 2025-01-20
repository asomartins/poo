package Ex_07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numeroDePaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int numeroDePaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroDePaginas = numeroDePaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Categoria: "+categoria);
        System.out.println("Numero de Paginas: "+numeroDePaginas);
        System.out.println("ISBN: "+isbn+"\n");
    }
}
