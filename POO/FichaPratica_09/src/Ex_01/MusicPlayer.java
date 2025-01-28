package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        this.programacao.add(musica);
    };

    public void trocarMusica(int indice1, int indice2) {
        Musica musicaTemp = programacao.get(indice1);
        programacao.set(indice1, programacao.get(indice2));
        programacao.set(indice2, musicaTemp);
    };

    public void removerMusica(int indice) {
        this.programacao.remove(indice);
    };

    public void removerTodasMusicas() {
        this.programacao.removeAll(programacao);
    }

    public void imprimirRelatorio() {
        for (Musica musica : programacao) {
            System.out.println(musica.getTitulo() + " | " + musica.getGenero() + " | " + musica.getArtista() + " | " + musica.getDuracao());
        }
        System.out.println();
    }

    public String duracao() {
        int duracaoTotal = 0;
        for(Musica musica : programacao) {
            duracaoTotal += musica.getDuracao();
        }
        int horas = duracaoTotal / 3600;
        int minutos = (duracaoTotal % 3600) / 60;
        int segundos = duracaoTotal % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
