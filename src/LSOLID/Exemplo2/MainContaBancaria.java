package LSOLID.Exemplo2;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(300);
        System.out.println("saldo corrente 1: " + contaCorrente.contarSaldo());
        contaCorrente.sacar(30);
        System.out.println("saldo corrente 2: " + contaCorrente.contarSaldo());


        IContaBancaria contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(400);
        System.out.println("saldo poupança 1: " + contaPoupanca.contarSaldo());
    }
}
