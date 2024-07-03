# Repositório do curso de Java: Aplicando a orientação a objetos

Uma visão geral sobre conceitos fundamentais de Orientação a Objetos em Java, como herança, polimorfismo, sobrescrita de métodos, e o uso de interfaces tratados ao longo do curso disponibilizado pela Alura.

## Conceitos Aplicados

### Herança

A herança permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). Isso ajuda a evitar duplicação de código e facilita a manutenção.

```java
public class Titulo {
    private String nome;
    private int anoDeLancamento;
}

public class Filme extends Titulo {
    private String diretor;
}

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
}

```

### Polimorfismo

O polimorfismo permite que um método tenha comportamentos diferentes com base no objeto que o invoca. Isso torna o código mais flexível e escalável.

```java
public void inclui(Titulo titulo) {
    System.out.println("Adicionando duração em minutos de " + titulo);
    this.tempoTotal += titulo.getDuracaoEmMinutos();
}

```

### Sobrescrita de Métodos

A sobrescrita de métodos permite que uma subclasse forneça uma implementação específica de um método que é definido na superclasse.

```java
public class Serie extends Titulo {
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}

```

### Interfaces

Interfaces definem "contratos" que classes podem implementar. Elas são usadas para especificar métodos que devem ser implementados, sem definir a implementação.

```java
public interface Classificavel {
    int getClassificacao();
}

public class Filme extends Titulo implements Classificavel {
    @Override
    public int getClassificacao() {
        return 0;
    }
}

```

### Encapsulamento

O encapsulamento é a prática de esconder a implementação interna de uma classe e expor apenas o que é necessário através de métodos públicos.
