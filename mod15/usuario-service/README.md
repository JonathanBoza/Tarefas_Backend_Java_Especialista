# Usuario Service

Este é um serviço REST para gerenciamento de usuários desenvolvido com Spring Boot.

## Requisitos

- Java 11 ou superior
- Maven

## Como executar

1. Clone o repositório
2. Entre na pasta do projeto
3. Execute o comando:

```bash
mvnw spring-boot:run
```

O serviço estará disponível em `http://localhost:8081`

## Banco de dados

O projeto utiliza o banco de dados H2 (em memória). Você pode acessar o console do H2 em:
- URL: `http://localhost:8081/h2-console`
- JDBC URL: `jdbc:h2:mem:usuariodb`
- Username: `sa`
- Password: (deixe em branco)

## API Endpoints

### Listar todos os usuários

```bash
# usando cURL
curl -X GET http://localhost:8081/usuarios
```

No Postman:
- Método: GET
- URL: `http://localhost:8081/usuarios`

### Criar novo usuário

```bash
# usando cURL
curl -X POST \
  http://localhost:8081/usuarios \
  -H 'Content-Type: application/json' \
  -d '{
    "nome": "João Silva",
    "email": "joao@email.com"
}'
```

No Postman:
- Método: POST
- URL: `http://localhost:8081/usuarios`
- Headers: 
  - Content-Type: application/json
- Body (raw JSON):
```json
{
    "nome": "João Silva",
    "email": "joao@email.com"
}
```

Resposta esperada:
```json
{
    "id": 1,
    "nome": "João Silva",
    "email": "joao@email.com",
    "dataCadastro": "2025-06-20"
}
```

## Testando com Postman

1. Abra o Postman
2. Crie uma nova coleção chamada "Usuario Service"
3. Adicione as requisições:
   - GET Usuarios
   - POST Usuario
4. Para cada requisição, configure conforme descrito acima na seção de endpoints
5. Para testar, certifique-se que a aplicação está rodando e execute as requisições

## Logs

Durante a execução da aplicação com `mvnw spring-boot:run`, você verá os seguintes tipos de logs:

1. Logs do Maven Wrapper (mvnw):
   - Mensagens sobre a instalação/download do Maven (se necessário)
   - Avisos do sistema Java (podem ser ignorados)

2. Logs do Spring Boot:
   - Informações sobre a inicialização do Spring Boot
   - Configuração do Tomcat (normalmente na porta 8080)
   - Inicialização do banco de dados H2
   - Status final indicando que a aplicação está pronta

A aplicação estará pronta para uso quando você ver uma mensagem similar a:
```
... Started UsuarioServiceApplication in X.XXX seconds ...
```

### Verificando se a aplicação está rodando

Você pode testar se a aplicação está rodando de duas formas:

1. Acessando o console H2:
   - Abra `http://localhost:8080/h2-console` no navegador
   
2. Testando o endpoint de usuários:   ```bash
   curl http://localhost:8081/usuarios
   ```

Se receber uma resposta (mesmo que seja uma lista vazia `[]`), significa que a aplicação está funcionando corretamente.
