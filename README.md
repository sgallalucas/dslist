# DSList

## Sobre o projeto

O projeto DSList é uma API REST desenvolvida para gerenciar listas de jogos em uma aplicação web, contruido durante o evento `Intensivão Java Spring` organizado pela DevSuperior.


## Modelo de domínio

![](https://raw.githubusercontent.com/sgallalucas/dslist/refs/heads/main/assets/modelo-dominio.png)

## Padrão de camadas

![](https://raw.githubusercontent.com/sgallalucas/dslist/refs/heads/main/assets/padrao-camadas.png)

## Tecnologias utilizadas

- Java
- Spring Boot
- JPA/Hibernate
- Maven
- Banco de dados H2/PostgreSQL
- Postman

## Como executar

```bash
# Clonar o repositório
git clone git@github.com:sgallalucas/dslist.git

# Rodar o aplicação
mvn spring-boot: run

# Testar os endpoits
Base URL: http://localhost:8080

Rotas disponíveis: 
curl -X GET http://localhost:8080/games 
curl -X GET http://localhost:8080/games/{id}
curl -X GET http://localhost:8080/lists 
curl -X GET http://localhost:8080/lists/{listId}/games 
curl -X POSThttp://localhost:8080/lists/{listId}/replacement 
```
