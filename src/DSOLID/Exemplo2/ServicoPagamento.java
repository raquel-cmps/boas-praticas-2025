package DSOLID.Exemplo2;

public class ServicoPagamento {

    // apenas leitura
    private final ILogger logger;

    public ServicoPagamento(ILogger logger) {
        this.logger = logger;
    }

    public void pagar(double valor) {
        // Lógica de pagamento
        logger.gerarLog("Pagamento de R$" + valor + " realizado com sucesso!");
    }
}

