package DSOLID.Exemplo2;

public class ConsoleLogger implements ILogger{
    @Override
    public void gerarLog(String mensagem) {
        System.out.println("LOG: " + mensagem);
    }
}


