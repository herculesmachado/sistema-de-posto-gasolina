# ⛽ API de Gerenciamento de Posto de Combustível

API REST desenvolvida com **Java e Spring Boot** com o objetivo de praticar conceitos fundamentais do desenvolvimento Backend, como criação de APIs REST, operações CRUD, persistência de dados e relacionamento entre entidades utilizando JPA.

O projeto simula um sistema simples de gerenciamento de um posto de combustível, permitindo cadastrar clientes, combustíveis e registrar abastecimentos.

## 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Banco de Dados SQL
* H2 database
* Maven
* Lombok
* Postman
* Git e GitHub

## 📋 Funcionalidades

### 👤 Clientes

A API permite:

* Cadastrar clientes
* Listar todos os clientes
* Buscar cliente por ID
* Atualizar informações
* Excluir clientes

### ⛽ Combustíveis

A API permite:

* Cadastrar combustíveis
* Listar combustíveis
* Buscar combustível por ID
* Atualizar informações
* Excluir combustíveis

Cada combustível possui informações como:

* Nome
* Preço por litro

Exemplo:

```text
Gasolina Comum — R$ 6,29
Etanol — R$ 4,39
Diesel — R$ 6,10
```

### 🚗 Abastecimentos

A API também permite registrar abastecimentos vinculando um cliente a um combustível.

Cada abastecimento possui:

* Cliente
* Combustível
* Quantidade de litros
* Valor total
* Data do abastecimento

Exemplo:

> Um cliente abastece 30 litros de Gasolina Comum. O sistema registra o cliente, combustível utilizado, quantidade de litros, valor total e data do abastecimento.

## 🔗 Relacionamento entre entidades

O projeto possui o seguinte relacionamento:

```text
Cliente ───< Abastecimento >─── Combustível
```

Isso significa que:

* Um cliente pode possuir vários abastecimentos.
* Um combustível pode estar presente em vários abastecimentos.
* Cada abastecimento pertence a um cliente e utiliza um combustível.

## 🌐 Endpoints

### Clientes

| Método | Endpoint         | Descrição               |
| ------ | ---------------- | ----------------------- |
| GET    | `/clientes`      | Lista todos os clientes |
| GET    | `/clientes/{id}` | Busca um cliente por ID |
| POST   | `/clientes`      | Cadastra um cliente     |
| PUT    | `/clientes/{id}` | Atualiza um cliente     |
| DELETE | `/clientes/{id}` | Remove um cliente       |

### Combustíveis

| Método | Endpoint             | Descrição                   |
| ------ | -------------------- | --------------------------- |
| GET    | `/combustiveis`      | Lista todos os combustíveis |
| GET    | `/combustiveis/{id}` | Busca um combustível por ID |
| POST   | `/combustiveis`      | Cadastra um combustível     |
| PUT    | `/combustiveis/{id}` | Atualiza um combustível     |
| DELETE | `/combustiveis/{id}` | Remove um combustível       |

### Abastecimentos

| Método | Endpoint               | Descrição                      |
| ------ | ---------------------- | ------------------------------ |
| GET    | `/abastecimentos`      | Lista todos os abastecimentos  |
| GET    | `/abastecimentos/{id}` | Busca um abastecimento por ID  |
| POST   | `/abastecimentos`      | Registra um novo abastecimento |
| DELETE | `/abastecimentos/{id}` | Remove um abastecimento        |

## 🧠 Conceitos praticados

Durante o desenvolvimento deste projeto, foram praticados conceitos como:

* Desenvolvimento de APIs REST
* Arquitetura em camadas
* Controllers
* Services
* Repositories
* Entidades
* Operações CRUD
* Requisições HTTP
* JSON
* Spring Data JPA
* Persistência de dados
* Relacionamentos `@ManyToOne`
* Chaves estrangeiras
* Tratamento de requisições e respostas HTTP
* Organização de um projeto Backend

## 🏗️ Estrutura do projeto

A aplicação segue uma organização baseada em camadas:

```text
src
└── main
    └── java
        └── com.hercules
            ├── controller
            ├── infrastructure
              └── entities
              └── repositories
            ├── service
```

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com foco em aprendizado e prática de **desenvolvimento Backend com Java e Spring Boot**.

A proposta foi criar uma aplicação simples, mas que permitisse aplicar conceitos utilizados no desenvolvimento de sistemas reais, especialmente:

* Construção de APIs REST
* Persistência de dados
* Modelagem de entidades
* Relacionamentos entre tabelas
* Organização do código em camadas
* Operações CRUD

---

## 👨‍💻 Autor

**Hércules Machado**

Desenvolvedor Backend em formação, com foco em:

**Java • Spring Boot • APIs REST • SQL • PostgreSQL**
