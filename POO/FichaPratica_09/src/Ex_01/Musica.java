package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(String artista, int duracao, String genero, String titulo) {
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
