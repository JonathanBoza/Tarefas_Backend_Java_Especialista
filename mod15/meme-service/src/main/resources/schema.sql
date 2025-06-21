
CREATE SEQUENCE sequence_categoria_meme START WITH 1 INCREMENT BY 50;


CREATE TABLE categoria_meme (
  id BIGINT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  data_cadastro DATE NOT NULL,
  usuario_id BIGINT,
  CONSTRAINT pk_categoriameme PRIMARY KEY (id)
);


CREATE SEQUENCE sequence_meme START WITH 1 INCREMENT BY 50;


CREATE TABLE meme (
  id BIGINT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  data_cadastro DATE NOT NULL,
  categoria_meme_id BIGINT,
  usuario_id BIGINT,
  url VARCHAR(255) NOT NULL,
  CONSTRAINT pk_meme PRIMARY KEY (id)
);


ALTER TABLE meme ADD CONSTRAINT FK_MEME_ON_CATEGORIA_MEME FOREIGN KEY (categoria_meme_id) REFERENCES categoria_meme (id);
