# Cadastro de clientes - Avaliação Surittec!

* Java 11
* [Spring Boot 2.3.4.RELEASE]https://start.spring.io/
* Mysql Driver
* [IDE SpringTools]https://spring.io/tools
* Lombok
* Spring Web
* Spring Data JPA
* Bean Validation
* Maven 4.0.0

# Métodos CRUD Cliente

**Adicionando Cliente**

POST http://localhost:8080/clientes 

```
{
    "nome": "José Carvalho",
    "cpf": "232.121.111-22",
    "endereco": {
        "cep": "72.120-000",
        "logradouro": "Av. Brasil 707/907",
        "bairro": "Tijuca",
        "cidade": "Rio de Janeiro",
        "uf": "RJ"
    },
    "telefone": "11 91512-9834",
    "email": "jose@gmail.com"
}
```

**Para buscar cliente por id**

GET http://localhost:8080/clientes/{id}


**Para atualizar um cliente**

PUT http://localhost:8080/clientes/{id}

```
{
    "id": 8,
    "nome": "Luizão da Silva Carvalho",
    "cpf": "232.111.111-22",
    "endereco": {
        "id": 6,
        "cep": "72.000-000",
        "logradouro": "Av. Brasil 707/907",
        "bairro": "São Paulo",
        "cidade": "São Paulo",
        "uf": "SP",
        "complemento": "casa 12"
    },
    "telefone": "11 94512-9834",
    "email": "luizao@gmail.com"
}
```


**Para deletar um cliente**

DELETE http://localhost:8080/delete/{id}



