package OSolid.Exemplo2;

public class MainPagamento {
    public static void main(String[] args) {

        SistemaPagamento sistemaPagamento = new SistemaPagamento();
        var instancia = sistemaPagamento.instanciarMetodoPagamento(Pagamento.PIX);
        var result = instancia.realizarPagamento(400.99);
        System.out.println(result);
    }
}
