package LSOLID.Exemplo1;

public class Quadrado extends Retangulo {
    @Override
    public void setLargura(double largura) {
        this.largura = largura;
        this.altura = largura; // Quadrado obriga altura = largura
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
        this.largura = altura; // Quadrado obriga largura = altura
    }
}
