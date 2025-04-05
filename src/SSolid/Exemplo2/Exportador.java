package SSolid.Exemplo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exportador {
    public static void salvarEmArquivo(Encomenda encomenda) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("encomendas.txt", true))) {
            bw.write("ID: " + encomenda.getIdEncomenda() + " - Frete: " + encomenda.getFrete());
            bw.newLine();
            System.out.println("Salvo no arquivo encomendas.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
