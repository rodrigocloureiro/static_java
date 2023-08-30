public class Conta {
    private String nomeTitular;
    private int numero;
    private double saldo;
    private static int numeroContas;

    public Conta(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numero = numeroConta;
        Conta.numeroContas++;
    }

    public double getSaldo() { return this.saldo; }

    public int getNumero() { return this.numero; }

    public String getNomeTitular() { return this.nomeTitular; }

    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public static int getNumeroContas() { return Conta.numeroContas; }

    private boolean valorInvalido(double valor) {
        return this.saldo - valor < 0;
    }

    public void sacar(double valor) {
        if (valorInvalido(valor)) System.out.println("Saldo insuficiente..");
        else this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) System.out.println("Não foi possível depositar. Valor inválido..");
        else this.saldo += valor;
    }

    @Override
    public String toString() {
        return String.format("Número: %d - Saldo: R$ %.2f", numero, saldo);
    }
}
