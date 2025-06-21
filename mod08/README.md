
# Módulo 08 – Os 12 Fatores e Serviços Stateless

**Aluno:** Jonathan Euzébio Boza  
**Curso:** Backend Java Especialista - EBAC  

---

## 📌 Exercício 1 – Os 12 Fatores

### 1. Configurações
Separar as configurações do código é essencial, pois permite que o mesmo código seja executado em diferentes ambientes (dev, teste, produção) apenas mudando as variáveis de ambiente. Isso evita erros e facilita a manutenção.

### 2. Deploys e Releases
Manter um processo de deploy simples e automatizado permite que novas versões do sistema sejam liberadas com mais rapidez e segurança. Isso reduz o risco de erro humano e ajuda na entrega contínua.

### 3. Logs
Tratar logs como fluxo de eventos e não armazená-los no disco permite que eles sejam centralizados, analisados e monitorados em tempo real. Assim, problemas podem ser identificados e corrigidos rapidamente.

---

## 📌 Exercício 2 – CI/CD e Serviços Sem Estado (Stateless)

Serviços **sem estado** (stateless) são importantes porque não dependem de informações salvas localmente na memória da aplicação. Isso permite que novas instâncias do serviço sejam criadas ou removidas automaticamente sem impactar o funcionamento do sistema.

Na **CI/CD**, isso é essencial, pois garante que a aplicação possa ser implantada em vários servidores de forma segura, escalável e automatizada. O sistema continua funcionando mesmo se uma instância for substituída.

Se um serviço **tiver estado**, ao matar uma instância, os dados armazenados nela são perdidos. Isso pode causar falhas, perda de sessão ou corrupção de dados. Por isso, os dados devem ser armazenados em bancos ou sistemas externos, não no próprio serviço.

---
