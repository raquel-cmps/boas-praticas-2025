package atv1;

import java.util.HashMap;
import java.util.Map;

public class SistemaPagamento {

    public IProcessarPagamento instanciarMetodoPagamento(Pagamento metodoPagamento) {
        Map<Pagamento, IProcessarPagamento> instancia = new HashMap<>();

        instancia.put(Pagamento.CARTAO, new PagamentoCartao());
        instancia.put(Pagamento.BOLETO, new PagamentoBoleto());
        instancia.put(Pagamento.PIX, new PagamentoPix());

        return instancia.get(metodoPagamento);
    }
}
