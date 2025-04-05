package SSolid.Exemplo2;

import java.util.Scanner;

public class MainEncomenda {
    public static Encomenda lerEncomenda() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            int idEncomenda = sc.nextInt();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            return new Encomenda(idEncomenda, peso);
        }
    }
    public static void main(String[] args) {
        Encomenda encomenda = lerEncomenda();
        Exportador.salvarEmArquivo(encomenda);
    }
}
