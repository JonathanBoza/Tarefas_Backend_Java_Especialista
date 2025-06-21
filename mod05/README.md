# Módulo 05 – Testes Unitários

**Aluno:** Jonathan Euzébio Boza  
**Curso:** Backend Java Especialista  

## Estrutura do Projeto

O projeto segue a estrutura padrão Maven:

```
mod05/
├── src/
│   ├── main/java/com/ebac/modulo05/
│   │   ├── Calculadora.java
│   │   └── Fibonacci.java
│   └── test/java/com/ebac/modulo05/
│       ├── CalculadoraTest.java
│       └── FibonacciTest.java
└── pom.xml
```

## Exercício 1 – Classe Calculadora

Foi criada a classe `Calculadora` com os métodos:
- `adicionar(int a, int b)`
- `subtrair(int a, int b)`
- `multiplicar(int a, int b)`
- `dividir(int a, int b)`, com verificação para divisão por zero.

Todos os métodos possuem testes unitários com JUnit 5 na classe `CalculadoraTest.java`.

## Exercício 2 – Testes da sequência de Fibonacci

Foi criada a classe `Fibonacci` com função recursiva `calcular(int n)`.

Foram implementados 3 testes:
- `calcular(0)` → 0
- `calcular(1)` → 1
- `calcular(5)` → 5

## Exercício 3 – Reflexão

> Você conseguiria entender o código que escreveu sem documentá-lo?

**Resposta:**  
Sim, consigo entender porque os nomes das classes e métodos são claros e seguem boas práticas.  
Porém, em projetos maiores com múltiplos autores e lógica mais complexa, documentar é essencial para evitar ambiguidades e facilitar manutenções futuras.

## Como executar os testes

### Pré-requisitos
- Java 11 ou superior
- Maven

### Usando Maven
No diretório `mod05`, execute:
```bash
mvn clean test
```

### Usando IDE
O projeto pode ser importado e executado em IDEs como Eclipse ou IntelliJ IDEA.
1. Importe como projeto Maven
2. Aguarde o download das dependências
3. Execute os testes com o test runner da IDE
