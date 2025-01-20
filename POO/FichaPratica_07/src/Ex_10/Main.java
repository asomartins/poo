package Ex_10;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Adriana Monteiro", 2000, "Marketing");
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
    }
}
