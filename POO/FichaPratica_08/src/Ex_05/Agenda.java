package Ex_05;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Pessoa> agenda = new ArrayList<>();

    public void adicionarPessoa(Pessoa novaPessoa) {
        this.agenda.add(novaPessoa);
    }
    public void listarPessoas() {
        for (Pessoa pessoaAtual : agenda) {
            System.out.println("Nome: "+pessoaAtual.getNome());
            System.out.println("E-mail: "+pessoaAtual.getEmail());
            System.out.println("Telemóvel: "+pessoaAtual.getTelemovel());
            System.out.println("Idade: "+pessoaAtual.getIdade());
            System.out.println();
        }
    }

}
