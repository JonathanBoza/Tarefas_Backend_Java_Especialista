
# Módulo 12 – Consistência, Filas e Observabilidade

**Aluno:** Jonathan Euzébio Boza  
**Curso:** Backend Java Especialista - EBAC  

---

## ✅ Exercício 1 – Consistência Forte e Consistência Eventual

**Consistência forte** significa que, assim que os dados são atualizados, todas as partes do sistema já enxergam o novo valor imediatamente.  
Já a **consistência eventual** permite que os dados se tornem consistentes depois de um tempo, ou seja, existe um pequeno atraso na atualização entre os sistemas.

🔹 **Exemplo de consistência forte:**  
Sistema bancário. Se você faz uma transferência, o valor deve sair da sua conta e aparecer na outra imediatamente.

🔹 **Exemplo de consistência eventual:**  
Sistemas de redes sociais como Instagram. Se você mudar seu nome, pode levar alguns segundos para essa alteração aparecer para todos os seguidores.

---

## ✅ Exercício 2 – Filas e Eventos

**Evento de dados** é quando algo muda no banco de dados, como um novo pedido ou alteração de status.  
**Evento de aplicação** é quando algo acontece no sistema como um todo, como envio de e-mail ou geração de nota fiscal.

🔸 **Quando usar evento de dados:**  
Para rastrear alterações e manter históricos. Ex: um pedido que muda de "pendente" para "enviado".

🔸 **Quando usar evento de aplicação:**  
Para acionar outros serviços. Ex: um pedido aprovado gera um evento para outro serviço emitir nota fiscal.

---

## ✅ Exercício 3 – Observabilidade

As métricas mais importantes para um microsserviço são:

- **Tempo de resposta:** mostra se o serviço está rápido.
- **Taxa de erro:** indica falhas nas requisições.
- **Uso de CPU e memória:** ajuda a identificar gargalos.
- **Número de requisições por segundo:** mostra o volume de uso do serviço.
- **Tempo de disponibilidade (uptime):** mede a confiabilidade do sistema.

Essas métricas ajudam o time a manter o sistema estável, rápido e confiável para os usuários.

---

