package Ex_02;

import java.util.ArrayList;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio() {
        this.participantes = new ArrayList<>();
        this.premio = premio;
    }

    public void adicionarParticipante(Pessoa pessoa) {
        if (pessoa.getIdade() < 18)
            System.out.println("Participante menor de idade não pode ser adicionado ao sorteio");
        else
            this.participantes.add(pessoa);
    }

    public void sortear() {
//        int indice = Integer.parseInt(Math.random() * participantes.size());
//        participantes();
    }
}
