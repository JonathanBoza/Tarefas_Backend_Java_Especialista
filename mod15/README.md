# Projeto Memelandia - Microserviços

Por: Jonathan Euzébio Boza

Este é o desafio final do curso **Profissão: Especialista Back-End Java**, realizado na **EBAC - Escola Britânica de Artes Criativas** ([ebaconline.com.br](https://ebaconline.com.br/)).

O objetivo do projeto foi transformar um sistema monolítico em microserviços. O projeto pode ser encontrado [aqui](https://github.com/JonathanBoza/Tarefas_Backend_Java_Especialista/tree/master/mod15).

## Descrição do Projeto

O projeto foi dividido em dois microserviços principais:

1. **usuario-service**: Responsável pelo gerenciamento de usuários.
2. **meme-service**: Responsável pelo cadastro de memes e categorias de memes.

### Desafio

A aplicação monolítica original foi transformada em dois microserviços distintos para melhorar a escalabilidade e manutenção do sistema. 

As principais tarefas do desafio foram:

- Identificar os domínios da aplicação e criar os modelos e bancos de dados necessários para cada um deles.
- Criar serviços independentes para operações de cada domínio.
- Seguir os princípios dos **12 fatores** no desenvolvimento dos microserviços.
- Melhorar a observabilidade do sistema, adicionando logs e métricas.

## Estrutura dos Microserviços

### 1. **usuario-service**

Este microserviço é responsável pelo gerenciamento de usuários. Ele permite a criação e manutenção de usuários. Cada usuário possui:

- **id**: Identificador único.
- **nome**: Nome do usuário.
- **email**: E-mail do usuário.
- **dataCadastro**: Data em que o usuário foi cadastrado.

#### Funcionalidades:

- Exibe a lista de usuários: `http://localhost:8082/usuarios`.
- Registra a criação de novos usuários.

#### Logs:

- O microserviço gera logs para:
  1. Quando a lista de usuários é acessada.
  2. Quando um novo usuário é cadastrado.

#### Banco de Dados:

- O banco de dados utilizado foi o **H2**.
- O script `schema.sql` é utilizado para criação da tabela de usuários.

### 2. **meme-service**

Este microserviço é responsável pelo cadastro de categorias de memes e memes em si. Cada categoria e meme possui os seguintes dados:

#### Categoria de Meme:
- **id**: Identificador único da categoria.
- **nome**: Nome da categoria.
- **descricao**: Descrição da categoria.
- **dataCadastro**: Data em que a categoria foi cadastrada.
- **usuarioId**: ID do usuário que criou a categoria.

#### Meme:
- **id**: Identificador único do meme.
- **nome**: Nome do meme.
- **descricao**: Descrição do meme.
- **dataCadastro**: Data em que o meme foi cadastrado.
- **categoriaMeme**: Categoria à qual o meme pertence.
- **usuarioId**: ID do usuário que cadastrou o meme.
- **url**: URL do meme (pode ser uma imagem ou vídeo).

#### Funcionalidades:

- Exibe a lista de categorias de memes: `http://localhost:8083/categoria-meme`.
- Exibe a lista de memes: `http://localhost:8083/meme`.
- Registra a criação de novas categorias e memes.

#### Logs:

- O microserviço gera logs para:
  1. Quando a lista de categorias ou memes é acessada.
  2. Quando uma nova categoria ou meme é cadastrado.

#### Banco de Dados:

- O banco de dados utilizado foi o **H2**.
- O script `schema.sql` é utilizado para criação das tabelas de categorias e memes.

### Comunicação entre Microserviços

A comunicação entre os microserviços é feita através do **OpenFeign**, que permite realizar chamadas HTTP de forma simplificada.

### Testes e Integração

- Para testar as APIs, foi utilizado o **Postman**.
- O banco de dados **H2** foi utilizado para armazenar os dados localmente.

Aqui estão alguns exemplos de dados usados para testar os serviços:

### 1. **Usuários**

Endpoint: `http://localhost:8082/usuarios`

```json
{
  "nome": "Guilherme",
  "email": "guilherme@email.com",
  "dataCadastro": "2024-02-15"
}

{
  "nome": "Miguel",
  "email": "miguel@email.com",
  "dataCadastro": "2024-01-10"
}

{
  "nome": "Cristina",
  "email": "cristina@example.com",
  "dataCadastro": "2025-03-28"
}

```

Endpoint: `http://localhost:8083/categoria-meme`

```json
{
  "nome": "Jogos",
  "descricao": "Memes sobre jogos",
  "dataCadastro": "2025-03-28",
  "usuarioId": 2
}

{
  "nome": "Futebol",
  "descricao": "Memes sobre futebol",
  "dataCadastro": "2025-03-28",
  "usuarioId": 3
}
```

Endpoint: `http://localhost:8083/meme`

```json
{
  "nome": "Meme de Jogos",
  "descricao": "Meme sobre jogos divertidos",
  "dataCadastro": "2025-03-28",
  "categoriaMeme": {
    "id": 1
  },
  "usuarioId": 2,
  "url": "https://maisplay.com/wp-content/uploads/2018/09/games-memes-engracados-1.jpg"
}

{
  "nome": "Meme de Futebol",
  "descricao": "Meme sobre futebol engraçado",
  "dataCadastro": "2025-03-28",
  "categoriaMeme": {
    "id": 2
  },
  "usuarioId": 3,
  "url": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc8-BRqkE-fIMombVLpLhl5i6b1_2PXWofkA&s"
}
```

### Como Rodar o Projeto

Para rodar os microserviços localmente, siga os seguintes passos:

1. Clone o repositório:
    ```bash    git clone https://github.com/JonathanBoza/Tarefas_Backend_Java_Especialista.git
    cd Tarefas_Backend_Java_Especialista/mod15
    ```

2. Para rodar o **usuario-service**:
    ```bash
    cd usuario-service
    ./mvnw spring-boot:run
    ```

3. Para rodar o **meme-service**:
    ```bash
    cd meme-service
    ./mvnw spring-boot:run
    ```

4. Acesse as APIs:

    - Lista de usuários: `http://localhost:8082/usuarios`
    - Cadastro de usuário (POST): `http://localhost:8082/usuarios`
    - Lista de categorias de memes: `http://localhost:8083/categoria-meme`
    - Cadastro de categoria de meme (POST): `http://localhost:8083/categoria-meme`
    - Lista de memes: `http://localhost:8083/meme`
    - Cadastro de meme (POST): `http://localhost:8083/meme`

## Logs

O sistema gera logs em dois momentos:

1. **Acesso às listas**: Informa quando a lista de usuários, categorias ou memes foi acessada.
2. **Cadastro de novos itens**: Informa quando um novo usuário, categoria de meme ou meme foi cadastrado.

## Considerações Finais

Este projeto foi um desafio, pois exigiu a migração de um sistema monolítico para uma arquitetura de microserviços. A implementação de logs e métricas também ajudou a melhorar a observabilidade do sistema.

