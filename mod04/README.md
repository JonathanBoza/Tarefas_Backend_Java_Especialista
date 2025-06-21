# Módulo 04 – Código Limpo

Aluno: Jonathan Euzébio Boza  
Curso: Backend Java Especialista  

---

## Exercício 1 – Importância de se escrever código limpo

1. **Usar nomenclatura adequada:**  
   Nomes claros facilitam a leitura e o entendimento do código. Evita erros, melhora a manutenção e torna o projeto mais acessível para qualquer outro programador que for trabalhar no mesmo código futuramente.

2. **Resolver os problemas na causa raiz:**  
   Resolver apenas os sintomas gera retrabalho. Encontrar e corrigir o verdadeiro motivo do erro evita que o problema reapareça em outras partes do sistema.

3. **Seguir a política do escoteiro:**  
   Sempre deixar o código "um pouco melhor do que encontrou". Essa prática contínua melhora a qualidade do projeto sem esperar uma grande refatoração.

---

## Exercício 2 – Análise de métodos

1. `private void somaNumeros(int a, int b, int c, int d, int e, int f)`  
   ❌ Fere o princípio da **clareza** e da **legibilidade**. Muitos parâmetros dificultam o entendimento. Melhor usar um objeto com os dados agrupados.

2. `private void oPaiTaOn()`  
   ❌ Fere o princípio da **semântica e profissionalismo**. Nomes de métodos devem indicar claramente sua funcionalidade. “oPaiTaOn” é informal e não descritivo.

3. `private double checaSaldoEAtualiza(long userId, double value)`  
   ❌ Fere o princípio da **responsabilidade única**. Um método deve fazer **uma coisa só**. "Checar" e "atualizar" são ações distintas.

---
