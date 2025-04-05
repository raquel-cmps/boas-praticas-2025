package SSolid.Exemplo2;

import java.util.Scanner;

public class MainEncomenda {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            int idEncomenda = sc.nextInt();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            Encomenda encomenda = new Encomenda(idEncomenda, peso);

            Exportador.salvarEmArquivo(encomenda);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
