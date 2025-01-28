package Ex_05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Amanda Martins", 38, "asomartins@gmail.com", "916515125");
        Pessoa pessoa2 = new Pessoa("Soraia Almeida", 36, "soraia@gmail.com", "99542233");

        Agenda agenda = new Agenda();

        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);

        System.out.println("\n****************** Agenda ******************\n");
        agenda.listarPessoas();
    }
}
