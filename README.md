# API de Tradução

Esta é uma API de tradução de textos, desenvolvida em **Java** com **Spring Boot**.

## Tecnologias usadas

- Java 17
- Spring Boot
- Maven
- API GenAI (API do Gemini)

## Sobre o projeto

Este projeto foi criado para aprender e praticar conceitos de conexão com APIs externas, utilizando a ferramenta **GenAI**.  
Também foi aplicado um pouco de **DDD** (Domain-Driven Design), principalmente na organização dos pacotes, e o uso de **VOs** (Value Objects) para entender melhor o funcionamento.

Com isso, pude enxergar de forma mais clara como é o início de um desenvolvimento com DDD e como uma **entidade rica** pode fazer seu próprio gerenciamento de exceções.

## Observações

Para testar o projeto, é necessário:  
1. Adquirir uma chave da API do Gemini.  
2. Criar um arquivo `.env` na raiz do projeto.  
3. Dentro do `.env`, adicionar a variável: Key=sua-chave-da-api