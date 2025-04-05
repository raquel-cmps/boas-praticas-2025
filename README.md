# 🧱 Princípios SOLID

Este repositório visa demonstrar, de forma simples e prática, os princípios **SOLID**, que fazem parte das boas práticas de programação orientada a objetos. Estes princípios ajudam a escrever um código mais limpo, organizado, fácil de manter e com menos chances de erros ao longo do tempo.

## 📌 O que é SOLID?

**SOLID** é um acrônimo para cinco princípios fundamentais da programação orientada a objetos. Cada letra representa um princípio que contribui para a criação de um software mais robusto e flexível.

### 🔹 S — Single Responsibility Principle (Princípio da Responsabilidade Única)

> Uma classe deve ter apenas um motivo para mudar.

Isso significa que cada classe deve ter uma única responsabilidade ou função dentro do sistema. Isso facilita a manutenção e a organização do código.

### Implementação
<pre>
public static void main(String[] args) {
    Encomenda encomenda = lerEncomenda();
    Exportador.salvarEmArquivo(encomenda);
}
</pre>

🧠 Explicação:
- Desta forma, a classe main fica apenas focada no fluxo principal realizando as chamas para os métodos que contém a lógica de execução.

--- 

### 🔹 O — Open/Closed Principle (Princípio Aberto/Fechado)

> Entidades de software devem estar abertas para extensão, mas fechadas para modificação.

Ou seja, você deve conseguir adicionar novos comportamentos ao seu código sem precisar alterar o que já está funcionando, geralmente usando herança ou composição.

### Implementação
```java
public interface IProcessarPagamento {
    String realizarPagamento(double valor);
}

public class PagamentoCartao implements IProcessarPagamento {
    public String realizarPagamento(double valor) {
        return "Pagamento de R$" + valor + " realizado via Cartão.";
    }
}

public class PagamentoPix implements IProcessarPagamento {
    public String realizarPagamento(double valor) {
        return "Pagamento de R$" + valor + " realizado via Pix.";
    }
}
```

Como o sistema se comporta ao escolher a forma de pagamento
```java
public class SistemaPagamento {

    public IProcessarPagamento instanciarMetodoPagamento(Pagamento metodoPagamento) {
        Map<Pagamento, IProcessarPagamento> instancia = new HashMap<>();

        instancia.put(Pagamento.CARTAO, new PagamentoCartao());
        instancia.put(Pagamento.BOLETO, new PagamentoBoleto());
        instancia.put(Pagamento.PIX, new PagamentoPix());

        return instancia.get(metodoPagamento);
    }
}
```


🧠 Explicação:
- A interface IProcessarPagamento permite que novas formas de pagamento sejam criadas sem alterar o código das classes existentes.

- SistemaPagamento apenas faz a associação entre o tipo de pagamento e sua implementação.

- Se amanhã surgir uma nova forma de pagamento, como PayPal, você só precisa:

  - Criar uma nova classe PagamentoPaypal que implementa IProcessarPagamento.

  - Adicionar uma linha no Map de SistemaPagamento.

Assim, o código está aberto para extensão (adicionar novas formas de pagamento), mas fechado para modificação (não precisa alterar as classes antigas).

--- 

### 🔹 L — Liskov Substitution Principle (Princípio da Substituição de Liskov)

> Classes derivadas devem ser substituíveis por suas classes base.

Se um código utiliza uma classe base, ele deve funcionar corretamente com qualquer classe que herde dela, sem precisar saber os detalhes da subclasse.

### Implementação
```java
public interface IContaBancaria {
    double contarSaldo();
    void depositar(double valor);
}

public class ContaCorrente implements IContaBancaria {
    protected double saldo;

    // apenas a conta corrente pode sacar
    public void sacar(double valor) {
        saldo -= valor;
    }


    @Override
    public double contarSaldo() {
        return saldo;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}

public class ContaPoupanca implements IContaBancaria {
    protected double saldo;

    @Override
    public double contarSaldo() {
        saldo += saldo * 0.03; // simular o investimento
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}

```

🧠 Explicação:
- Agora, qualquer implementação de IContaBancaria pode ser usada de forma intercambiável, sem causar erros ou comportamentos inesperados. 
Isso é exatamente o que o LSP busca garantir.

--- 

### 🔹 I — Interface Segregation Principle (Princípio da Segregação de Interface)

> Muitas interfaces específicas são melhores do que uma interface única e geral.

Evita a criação de interfaces grandes e genéricas, preferindo interfaces menores e mais específicas para que as classes só implementem o que realmente utilizam.

### Implementação
```java
public interface VeiculoAquatico {
    void navegar();
}

public interface VeiculoTerrestre {
    void dirigir();
}

public interface VeiculoVoador {
    void voar();
}

public class Carro implements VeiculoTerrestre {
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada...");
    }
}


```

🧠 Explicação:
- Agora, Carro implementa apenas a interface que realmente faz sentido para ele, sem ser forçado a lidar com métodos 
desnecessários. Caso você tenha um Avião, ele poderia implementar apenas VeiculoVoador, e um Barco apenas VeiculoAquatico.

---

### 🔹 D — Dependency Inversion Principle (Princípio da Inversão de Dependência)

> Dependa de abstrações, não de implementações.

As classes devem depender de interfaces ou classes abstratas, e não de classes concretas. Isso promove o desacoplamento e facilita a substituição e manutenção do código.

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como parte da disciplina de **Boas Práticas de Programação** do curso de **Ciência da Computação**.

---
