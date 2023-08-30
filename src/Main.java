public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1000, 569823);
        c1.sacar(500);
        c1.sacar(570); // Vai mostrar Saldo insuficiente
        System.out.println(c1.getSaldo());
        System.out.println(c1);
        c1.depositar(100);
        System.out.println(c1.getSaldo());
        c1.depositar(-100);
        System.out.println(c1.getSaldo());

        //

        Conta c2 = new Conta(5200, 789513);
        System.out.println(Conta.getNumeroContas());
    }
}
