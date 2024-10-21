# Myaddress

A aplicação foi feita para realizar uma consulta a um api externa e retornar essas informaçẽos por meio de uma api. Para simular o retorno da integração, foi utilizado o container do mockoon.

## Sumário
- [Tecnologias](#tecnologias)
- [Features](#features)
- [Rodar Local](#rodar-local)

## Tecnologias

- **Java 17**
- **Spring Boot**
- **Maven**
- **MySQL**
- **Docker**

## Features

- **Pesquisar endereço pelo cep:** O usuário passando o cep, consegue consultar as informações do endereço.
- **Consultar histórico de utilização**: O usuário consegue verificar quais consultas foram feitas e quais dados consultados.

## Rodar Local

**Pré-Requisito:** Docker e JAVA 17

Faça um clone do Projeto

```bash
  git clone  https://github.com/LUANSENA10/myaddress.git
```

Importe o projeto na sua idea de preferencia

Execute a classe MyAddressApplication

Vá para a pasta do projeto

Abaixo collections :

curl do endpoint de consultar endereço

```bash
  http GET http://localhost:8080/01001-000
```

curl do endpoint de histórico de pesquisa
```bash
  http GET http://localhost:8080/history
```
