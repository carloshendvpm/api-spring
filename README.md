# API de Cadastro de Pessoas

Este repositório contém uma API RESTful desenvolvida em Java com Spring Boot e Postgres com JDBC. A API permite o cadastro de pessoas com os atributos "name", "age" e "cpf".

## Tecnologias utilizadas
- Java 17
- Spring Boot
- Postgres com JDBC
- Lombok
## Pré-requisitos
Antes de executar a aplicação, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- Java 17 ou superior
- Postgres

## Como executar a aplicação
1. Clone o repositório para sua máquina
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```
2. Navegue até a pasta do projeto:
```bash
cd seu-repositorio
```
3. Abra o arquivo application.properties e configure as informações de acesso ao banco de dados:
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/nome-do-banco
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
```
4. Execute o comando para compilar e executar a aplicação:
```bash
./mvnw spring-boot:run
```

## Endpoints disponíveis
A API possui os seguintes endpoints:

- GET /pessoas: Retorna uma lista com todas as pessoas cadastradas.
- GET /pessoas/{id}: Retorna uma pessoa com o ID especificado.
- POST /pessoas: Cadastra uma nova pessoa. É necessário enviar um JSON com os atributos "name", "age" e "cpf".
- PUT /pessoas/{id}: Atualiza os dados de uma pessoa com o ID especificado. É necessário enviar um JSON com os atributos que deseja atualizar.
- DELETE /pessoas/{id}: Remove uma pessoa com o ID especificado.
## Exemplo de requisição e resposta
Para cadastrar uma nova pessoa, envie uma requisição POST para o endpoint /pessoas com o seguinte JSON no corpo da requisição:
```json
{
  "name": "João da Silva",
  "age": 30,
  "cpf": "123.456.789-00"
}
```
A resposta será um JSON com os dados da pessoa cadastrada:
```json
{
  "id": 1,
  "name": "João da Silva",
  "age": 30,
  "cpf": "123.456.789-00"
}
```
## Contribuindo
Sinta-se à vontade para contribuir com o projeto fazendo um fork e enviando um pull request com suas melhorias.
