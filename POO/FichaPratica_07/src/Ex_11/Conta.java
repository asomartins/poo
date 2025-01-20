package Ex_11;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Operação realizada: Depósito. Valor: "+valor);
        mostrarSaldo();
    }

    public void sacar(double valor) {
        if (temSaldo(valor)) {
            this.saldo -= valor;
            System.out.println("Operação realizada: Saque. Valor: -"+valor);
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
        mostrarSaldo();
    }

    public boolean temSaldo(double valor) {
        if (this.saldo >= valor) {
            return true;
        }
        else {
            return false;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (temSaldo(valor)) {
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso. Valor: "+valor);
            mostrarSaldo();
        }
        else {
            System.out.println("Não foi possível realizar a Transferência. Motivo: Saldo insuficiente.");
            mostrarSaldo();
        }
    }

    public void mostrarSaldo() {
        System.out.println("********** BANCO CESAE **********");
        exibirTitular();
        System.out.println("Saldo: "+this.saldo);
    }

    public void exibirTitular() {
        System.out.println("Nome do titular: "+this.titular);
    }

}
