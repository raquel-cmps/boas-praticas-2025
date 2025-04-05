package LSOLID.Exemplo2;

public class ContaCorrente implements IContaBancaria {
    protected double saldo;

    public void sacar(double valor) {
        saldo -= valor;
    }


    @Override
    public double contarSaldo() {
        return saldo;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}


