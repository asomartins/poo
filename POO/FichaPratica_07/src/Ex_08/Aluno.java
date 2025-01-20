package Ex_08;

public class Aluno {
    String nome;
    int idade;
    String curso;
    double media;

    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String situacao () {
        String situacaoAluno = "";

        if (this.media >= 9.5)
            situacaoAluno = "Aprovado";
        else
            situacaoAluno = "Reprovado";

        return situacaoAluno;
    }

}
