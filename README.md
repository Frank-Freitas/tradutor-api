# API de Tradução

Esta é uma API de tradução de textos, desenvolvida em **Java** com **Spring Boot**.

## Tecnologias utilizadas

- Java 17 ou superior
- Spring Boot
- Maven
- API GenAI (API do Gemini)
- Swagger (Já está configurado)

## Configuração

Após clonar o projeto do GitHub, abra o terminal na raiz do projeto e execute:

```bash
mvn clean install
```

Quando a instalação terminar, para iniciar o sistema, execute:

```bash
mvn spring-boot:run
```

## Swagger

Para testar a API, abra o link abaixo no navegador e faça as requisições de teste:

[http://localhost:8080/swagger-ui/index.html#/translate-controller/translate](http://localhost:8080/swagger-ui/index.html#/translate-controller/translate)

## Sobre o projeto

Este projeto foi criado para aprender e praticar conceitos de conexão com APIs externas, utilizando a ferramenta **GenAI**.  
Também foi aplicado um pouco de **DDD** (Domain-Driven Design), principalmente na organização dos pacotes, e o uso de **VOs** (Value Objects) para entender melhor o funcionamento.

## Observações

Para testar o projeto, é necessário:

1. Adquirir uma chave da API do Gemini.
2. Criar um arquivo `.env` na raiz do projeto.
3. Dentro do `.env`, adicionar a variável:

   ```env
   Key=<sua-chave-da-api>
   ```
