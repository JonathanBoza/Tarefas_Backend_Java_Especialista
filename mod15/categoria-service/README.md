# Categoria Service

Este é um serviço REST para gerenciamento de categorias desenvolvido com Spring Boot.

## Requisitos

- Java 17
- Maven
- Spring Boot 3.1.0

## Como executar

1. Clone o repositório
2. Entre na pasta do projeto
3. Execute o comando:

```bash
./mvnw spring-boot:run
```

Para Windows, use:
```bash
mvnw.cmd spring-boot:run
```

O serviço estará disponível em `http://localhost:8080`

## Endpoints da API

### Categoria

#### Criar uma nova categoria
```bash
curl -X POST http://localhost:8080/api/categorias \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Eletrônicos",
    "descricao": "Produtos eletrônicos em geral"
  }'
```

#### Listar todas as categorias
```bash
curl -X GET http://localhost:8080/api/categorias
```

#### Buscar uma categoria por ID
```bash
curl -X GET http://localhost:8080/api/categorias/{id}
```

#### Atualizar uma categoria
```bash
curl -X PUT http://localhost:8080/api/categorias/{id} \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Eletrônicos Atualizados",
    "descricao": "Nova descrição para eletrônicos"
  }'
```

#### Excluir uma categoria
```bash
curl -X DELETE http://localhost:8080/api/categorias/{id}
```

## Postman

Para testar a API usando o Postman:

1. Abra o Postman
2. Crie uma nova coleção chamada "Categoria Service"
3. Configure as seguintes requisições:

### POST - Criar Categoria
- Method: POST
- URL: http://localhost:8080/api/categorias
- Headers: Content-Type: application/json
- Body (raw/JSON):
```json
{
    "nome": "Eletrônicos",
    "descricao": "Produtos eletrônicos em geral"
}
```

### GET - Listar Categorias
- Method: GET
- URL: http://localhost:8080/api/categorias

### GET - Buscar Categoria por ID
- Method: GET
- URL: http://localhost:8080/api/categorias/{id}

### PUT - Atualizar Categoria
- Method: PUT
- URL: http://localhost:8080/api/categorias/{id}
- Headers: Content-Type: application/json
- Body (raw/JSON):
```json
{
    "nome": "Eletrônicos Atualizados",
    "descricao": "Nova descrição para eletrônicos"
}
```

### DELETE - Excluir Categoria
- Method: DELETE
- URL: http://localhost:8080/api/categorias/{id}

## Observações

- Substitua `{id}` nas URLs pelo ID real da categoria que você deseja manipular
- As respostas serão retornadas em formato JSON
- Em caso de erro, a API retornará um código de status HTTP apropriado com uma mensagem de erro
