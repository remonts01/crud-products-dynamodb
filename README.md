<h1 align="center">
  CRUD PRODUCTS DYNAMODB
</h1>

API para cadastrar produtos (CRUD) que utiliza o banco de dados DynamoDB da AWS.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [DynamoDB](https://aws.amazon.com/pt/dynamodb/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA

## Como Executar

Obs.: é preciso ter uma tabela criada no DynamoDB.

Atualizar o arquivo application.properties:
Substituir as variáveis ${AWS_DYNAMODB_ENDPOINT}, ${AWS_ACCESS_KEY_ID}, ${AWS_SECRET_ACCESS_KEY} e ${AWS_REGION}

## Docker

- Clonar repositório git
- Construir o projeto:

```
$ docker build -t crud-products-dynamodb-1.0.0 .
```
- Executar a aplicação:
```
$ docker run -p 8080:8080 crud-products-dynamodb-1.0.0
```

## Java 17 e Maven

- Clonar repositório git
- Construir o projeto:

```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/crud-products-dynamodb-1.0.0.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
