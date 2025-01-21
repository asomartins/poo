package Ex_02;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo;
    private double valorDivida;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        atualizarMargemEmprestimo();
        System.out.println("Operação realizada: Depósito. Valor: "+valor);
        mostrarSaldo();
    }

    public void sacar(double valor) {
        if (temSaldo(valor)) {
            this.saldo -= valor;
            atualizarMargemEmprestimo();
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
            atualizarMargemEmprestimo();
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

    public void atualizarMargemEmprestimo() {
        //A margem de empréstimo será de 90% do saldo
        margemEmprestimo = this.saldo * 0.9;
    }

    public boolean pedirEmprestimo(double valorEmprestimo) {

        //O valor do empréstimo não pode ultrapassar a margem de empréstimo disponível
        if (valorEmprestimo > margemEmprestimo) {
            System.out.println("Empréstimo não autorizado. Saldo insuficiente.");
        }

        else if (valorDivida > 0) {
            System.out.println("Empréstimo não autorizado. O cliente possui dívidas em aberto.");
            System.out.println("Valor da dívida: "+this.valorDivida);
        }

        else {
            System.out.println("Empréstimo aprovado.");
            this.saldo += valorEmprestimo;
            valorDivida = valorEmprestimo;
            return true;
        }
            return false;
    }
}
