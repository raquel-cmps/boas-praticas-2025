package LSOLID.Exemplo2;

public class ContaPoupanca implements IContaBancaria {
    protected double saldo;

    @Override
    public double contarSaldo() {
        saldo += saldo * 0.03; // simular o investimento
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
