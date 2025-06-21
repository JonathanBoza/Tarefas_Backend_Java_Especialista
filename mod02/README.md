
# Módulo 02 - Recursão e Programação Dinâmica

**Aluno:** Jonathan Euzébio Boza  
**Curso:** Backend Java Especialista  
**Módulo:** 02

---

## ✅ Conteúdo da Entrega

### 📌 Exercício 1 – Recursão
Arquivo: `FatorialRecursivo.java`  
- Implementa o cálculo do fatorial com recursão.
- **Condição de parada**: quando `n == 0` ou `n == 1`.

❓ *É possível calcular o fatorial de números acima de 100 com recursão?*  
➡️ **Não é recomendado**, pois há risco de **estouro de pilha (stack overflow)** devido à profundidade da recursão.

---

### 📌 Exercício 2 – Programação Dinâmica
Arquivo: `FatorialDinamico.java`  
- **Top-Down**: usa memoização (cache).
- **Bottom-Up**: usa laço iterativo.

✅ Ambas são mais eficientes e seguras para números grandes do que a versão recursiva simples.

---

### 📌 Exercício 3 – Comparações
- **Recursivo**: Complexidade de tempo = O(n), mas alto uso da pilha de chamadas.
- **Top-Down**: Também O(n), mas evita chamadas repetidas.
- **Bottom-Up**: O(n), mais eficiente em uso de memória.

💡 **Programação dinâmica** é melhor porque **evita repetições e economiza recursos**.

---

## 🧪 Como testar os códigos

Requisitos:
- Java instalado
- Compile com:
```bash
javac FatorialRecursivo.java
javac FatorialDinamico.java
```
Execute com:
```bash
java FatorialRecursivo
java FatorialDinamico
```

---

## 📚 Conclusão

Este módulo mostrou como **recursão e programação dinâmica** resolvem o mesmo problema de formas diferentes. A escolha depende da eficiência e do limite de memória/recursos da aplicação.

