package OSolid.Exemplo2;

public class PagamentoBoleto implements IProcessarPagamento {
    @Override
    public String realizarPagamento(double valor) {
        return "atv1.Pagamento de R$" + valor + " realizado com BOLETO.";
    }
}
