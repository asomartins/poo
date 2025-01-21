package Ex_02;

public class Main {
    public static void main(String[] args) {
    Conta conta1 = new Conta(14338, 500, "Amanda Martins");

    conta1.mostrarSaldo();
    conta1.depositar(100);
    conta1.pedirEmprestimo(530);
    conta1.mostrarSaldo();
    conta1.pedirEmprestimo(100);
    }
}
