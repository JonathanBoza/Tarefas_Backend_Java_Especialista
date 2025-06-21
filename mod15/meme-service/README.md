# Meme Service API

Este é um serviço de gerenciamento de memes que permite criar, buscar, atualizar e deletar memes e suas categorias.

## Requisitos

- Java 11 ou superior
- Maven
- MySQL/H2 Database

## Como Executar

1. Clone o repositório:
```bash
git clone [url-do-repositorio]
```

2. Entre na pasta do projeto:
```bash
cd meme-service
```

3. Execute o projeto com Maven:
```bash
./mvnw spring-boot:run
```

O serviço estará disponível em `http://localhost:8080`

## Endpoints da API

### Memes

#### Criar um novo meme
```bash
curl -X POST http://localhost:8080/memes \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Meme Legal",
    "descricao": "Um meme muito engraçado",
    "categoriaId": 1
  }'
```

#### Listar todos os memes
```bash
curl -X GET http://localhost:8080/memes
```

#### Buscar meme por ID
```bash
curl -X GET http://localhost:8080/memes/{id}
```

#### Atualizar um meme
```bash
curl -X PUT http://localhost:8080/memes/{id} \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Meme Atualizado",
    "descricao": "Descrição atualizada",
    "categoriaId": 1
  }'
```

#### Deletar um meme
```bash
curl -X DELETE http://localhost:8080/memes/{id}
```

### Categorias de Memes

#### Criar uma nova categoria
```bash
curl -X POST http://localhost:8080/categorias \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Memes Engraçados",
    "descricao": "Categoria para memes divertidos"
  }'
```

#### Listar todas as categorias
```bash
curl -X GET http://localhost:8080/categorias
```

#### Buscar categoria por ID
```bash
curl -X GET http://localhost:8080/categorias/{id}
```

#### Atualizar uma categoria
```bash
curl -X PUT http://localhost:8080/categorias/{id} \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Categoria Atualizada",
    "descricao": "Nova descrição da categoria"
  }'
```

#### Deletar uma categoria
```bash
curl -X DELETE http://localhost:8080/categorias/{id}
```

## Usando o Postman

1. Importe a coleção do Postman abaixo:

```json
{
  "info": {
    "_postman_id": "your-postman-id",
    "name": "Meme Service API",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "Memes",
      "item": [
        {
          "name": "Criar Meme",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n    \"nome\": \"Meme Legal\",\n    \"descricao\": \"Um meme muito engraçado\",\n    \"categoriaId\": 1\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/memes",
              "protocol": "http",
              "host": ["localhost"],
              "port": "8080",
              "path": ["memes"]
            }
          }
        },
        {
          "name": "Listar Memes",
          "request": {
            "method": "GET",
            "url": {
              "raw": "http://localhost:8080/memes",
              "protocol": "http",
              "host": ["localhost"],
              "port": "8080",
              "path": ["memes"]
            }
          }
        }
      ]
    },
    {
      "name": "Categorias",
      "item": [
        {
          "name": "Criar Categoria",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n    \"nome\": \"Memes Engraçados\",\n    \"descricao\": \"Categoria para memes divertidos\"\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": {
              "raw": "http://localhost:8080/categorias",
              "protocol": "http",
              "host": ["localhost"],
              "port": "8080",
              "path": ["categorias"]
            }
          }
        },
        {
          "name": "Listar Categorias",
          "request": {
            "method": "GET",
            "url": {
              "raw": "http://localhost:8080/categorias",
              "protocol": "http",
              "host": ["localhost"],
              "port": "8080",
              "path": ["categorias"]
            }
          }
        }
      ]
    }
  ]
}
```

2. No Postman:
   - Clique em "Import"
   - Cole o JSON acima
   - Clique em "Import"
   - A coleção será importada com todos os endpoints configurados

## Observações

- Certifique-se de que o banco de dados está configurado corretamente em `application.properties`
- Os IDs nas URLs devem ser substituídos por IDs válidos existentes no banco de dados
- Todos os endpoints retornam respostas em formato JSON
