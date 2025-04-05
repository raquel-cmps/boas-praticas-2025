package atv1;

public class PagamentoCartao implements IProcessarPagamento {
    @Override
    public String realizarPagamento(double valor) {
        return "atv1.Pagamento de R$" + valor + " realizado com CARTÃO.";
    }
}
