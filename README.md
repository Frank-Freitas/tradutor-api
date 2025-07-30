# Tradutor de Textos com Spring Boot

Esta é uma API de tradução de textos, desenvolvida em **Java** com **Spring Boot**.  
Está sendo criada em partes, com o objetivo de praticar padrões de desenvolvimento em projetos Java com Spring.  
Com o tempo, o projeto será atualizado e ganhará novas camadas de estudo, incluindo padrões de projeto, arquiteturas, metodologias e paradigmas de programação, aprofundando ainda mais o aprendizado.

## Adições recentes

- Utilização da ferramenta **GenAI** para traduções automatizadas.
- Aplicação de conceitos de **DDD** (Domain-Driven Design) nas entidades do domínio, nos casos de uso e no uso de Value Objects (VOs).
- Implementação de uma **classe global para tratamento personalizado de exceções** (ExceptionHandler), centralizando e padronizando o controle de erros.
- Introdução do **padrão de projeto Strategy**, com a criação da interface `Client` e classes concretas para facilitar a integração com APIs externas e tornar o sistema mais flexível.

Esta lista está em constante evolução, com novas funcionalidades e aprendizados sendo incorporados conforme avanços nos estudos e implementações.

## Tecnologias utilizadas
- Java 17
- Spring Boot 3.5.3
- Maven  3.9.9
- API GenAI (API do Gemini)
- Swagger

## Observações
Para testar o projeto, é necessário adquirir uma chave da API do Gemini.

**Como adquirir API Key**

1. Acesse: https://aistudio.google.com/prompts/new_chat
2. Faça login com sua conta Google.
3. No topo da página, clique em **"Get API Key"** para gerar sua chave gratuita.

## Configuração

**Clonar repositório:**

- Abra um terminal no local que deseja clonar o projeto:
   
   ***Git Bash, Cmd, PowerShell etc. (preferencialmente Git Bash)***

- No terminal, clone o projeto com o comando:
```bash
git clone git@github.com:Frank-Freitas/tradutor-api.git
```

- Após clonar, va para a pasta raiz do projeto com o comando:
```bash
cd tradutor-api/
```

- Na raiz do projeto, execute:
```bash
mvn clean install
```

**Configurar API Key no projeto**

1. Criar um arquivo `.env` na raiz do projeto.
2. Dentro do `.env`, adicionar a variável:

   ```env
   Key=<sua-chave-da-api>
   ```

Para executar o sistema, na pasta raiz execute abra o terminal novamente e execute:
```bash
mvn spring-boot:run
```

## Swagger
Para testar a API, após seguir todos os passos de configuração anteriores, abra o link abaixo no navegador e utilize a interface do Swagger UI para realizar requisições:

[http://localhost:8080/swagger-ui/index.html#/translate-controller/translate](http://localhost:8080/swagger-ui/index.html#/translate-controller/translate)

A aplicação roda, por padrão, na porta 8080.
Se desejar, você pode alterar essa porta no arquivo ***application.properties*** usando a propriedade ***server.port=<endereço-da-porta>***
