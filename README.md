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

## Instalando o Repositório

Para configurar e executar o projeto, siga os passos abaixo:

1. **Clone o Repositório**
    
    ```bash
    git clone <https://github.com/seu-usuario/seu-repositorio.git>
    
    ```
    
2. **Navegue até o Diretório do Projeto**
    
    ```bash
    cd seu-repositorio
    
    ```
    
3. **Compile o Projeto**
    
    ```bash
    javac -d bin src/**/*.java
    
    ```
    
4. **Execute a Classe Principal**
    
    ```bash
    java -cp bin br.com.alura.minhasmusicas.Principal.Principal
    
    ```
