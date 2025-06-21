# Módulo 06 – Comparando Monólitos e Microsserviços

**Aluno:** Jonathan Euzébio Boza  
**Curso:** Backend Java Especialista – EBAC  
**Módulo:** 06 – Arquitetura de Software

---

## 🧩 Exercício 1 – Escalabilidade

**Monólitos:**  
- ✅ Vantagens: Mais simples de escalar horizontalmente (ex: clonar todo o sistema).  
- ❌ Desvantagens: Escalabilidade limitada, pois todas as partes do sistema são escaladas juntas, mesmo que apenas uma esteja sobrecarregada.

**Microsserviços:**  
- ✅ Vantagens: Escalabilidade granular — apenas os serviços que precisam ser escalados são replicados.  
- ❌ Desvantagens: Maior complexidade na gestão de infraestrutura (múltiplos serviços, balanceamento, etc.).

---

## 🔁 Exercício 2 – Disponibilidade

**Monólitos:**  
- ✅ Vantagens: Menor complexidade inicial para garantir disponibilidade.  
- ❌ Desvantagens: Se uma parte falha, o sistema inteiro pode ficar indisponível.

**Microsserviços:**  
- ✅ Vantagens: Alta disponibilidade — falhas em um serviço não derrubam o sistema todo.  
- ❌ Desvantagens: Necessita estratégias como tolerância a falhas, circuit breakers e monitoramento contínuo.

---

## 💾 Exercício 3 – Consistência

**Monólitos:**  
- ✅ Vantagens: Transações são locais e consistência forte é mais fácil de manter.  
- ❌ Desvantagens: Difícil de desacoplar partes do sistema que compartilham dados.

**Microsserviços:**  
- ✅ Vantagens: Permite consistência eventual com mais escalabilidade.  
- ❌ Desvantagens: Garantir consistência entre serviços distribuídos é desafiador (ex: uso de eventos e mensageria).

---

## 🚀 Exercício 4 – Performance

**Monólitos:**  
- ✅ Vantagens: Comunicação local (dentro do mesmo processo), mais rápida.  
- ❌ Desvantagens: Pode sobrecarregar rapidamente com aumento de usuários.

**Microsserviços:**  
- ✅ Vantagens: Serviços independentes podem ter performance otimizada individualmente.  
- ❌ Desvantagens: Comunicação entre serviços (via rede) é mais lenta e pode gerar overhead.

---

## 🧪 Exercício 5 – Testabilidade

**Monólitos:**  
- ✅ Vantagens: Ambiente unificado facilita testes de integração e ponta a ponta.  
- ❌ Desvantagens: Testes unitários podem ser mais difíceis com dependências muito acopladas.

**Microsserviços:**  
- ✅ Vantagens: Facilita testes unitários isolados por serviço.  
- ❌ Desvantagens: Testes de integração e ponta a ponta exigem ambientes complexos e simulações (mock de APIs externas).

---

## ✅ Conclusão

Ambas as arquiteturas têm prós e contras. A escolha ideal depende dos objetivos, da equipe, do tamanho do projeto e da infraestrutura disponível.

