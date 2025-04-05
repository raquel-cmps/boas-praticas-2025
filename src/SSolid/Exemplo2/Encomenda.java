package SSolid.Exemplo2;

public class Encomenda {
    private int idEncomenda;
    private double peso;
    private double frete;

    public Encomenda(int idEncomenda, double peso) {
        this.idEncomenda = idEncomenda;
        this.peso = peso;
        this.frete = 10 * peso;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }


    public double getPeso() {
        return peso;
    }


    public double getFrete() {
        return frete;
    }

}
