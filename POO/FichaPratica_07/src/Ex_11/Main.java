package Ex_11;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(14338, 500, "Amanda Martins");
        Conta conta2 = new Conta(12345, 200, "Soraia Almeida");
        Conta conta3 = new Conta(22222, 300, "Carolini Silva");

    conta1.mostrarSaldo();
    conta1.depositar(150);

    conta2.mostrarSaldo();
    conta2.depositar(200);

    conta3.mostrarSaldo();
    conta3.depositar(300);

    conta1.mostrarSaldo();
    conta1.sacar(50);

    conta2.mostrarSaldo();
    conta2.sacar(150);

    conta3.mostrarSaldo();
    conta3.sacar(10);

    conta1.mostrarSaldo();
    conta2.exibirTitular();
    conta1.transferir(50, conta2);
    conta1.mostrarSaldo();
    conta2.exibirTitular();

    conta3.mostrarSaldo();
    conta3.transferir(150, conta1);
    conta3.mostrarSaldo();
    }
}
