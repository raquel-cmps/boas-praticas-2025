package OSolid.Exemplo1;

public class CalculadoraDesconto {
    public double calcular(double valor, String tipoDesconto) {
        if ("NATAL".equals(tipoDesconto)) {
            return valor * 0.9; // 10% de desconto
        } else if ("ANIVERSARIO".equals(tipoDesconto)) {
            return valor * 0.8; // 20% de desconto
        } else {
            return valor; // Sem desconto
        }
    }
}
