# Cadastro de clientes - Avaliação Surittec!

* Java 8
* [Spring Boot 2.3.4.RELEASE](https://start.spring.io/)
* Mysql Driver
* [IDE SpringTools](https://spring.io/tools)
* Lombok
* Spring Web
* Spring Data JPA
* Bean Validation
* Maven 4.0.0

# Add-ons
Este projeto foi criado para funcionar junto ao frontend 
[surittec-crud-frontend](https://github.com/andrebrandaodf/surittec-crud-frontend).
Informações sobre como rodar o projeto frontend se encontram [README.md](https://github.com/andrebrandaodf/surittec-crud-frontend/blob/main/README.md). 

# Executando projeto

1. Entrar na pasta do projeto `surittec-crud` 

	`cd surittec-crud`
 
2. Executar o servidor spring 

	`./mvnw spring-boot:run`

# Métodos CRUD Cliente

**Adicionando Cliente**

POST http://localhost:8080/clientes 

```
{
            "nome": "Heitor Macedo Varela",
            "cpf": "213.142.143-12",
            "endereco": {
                "cep": "72.310-715",
                "logradouro": "Quadra 504 conjunto 09",
                "bairro": "Samambaia sul",
                "localidade": "Brasília",
                "uf": "DF",
                "complemento": "casa 5",
                "ddd":null,
                "gia":"",
                "ibge": null,
                "siafi":""
            },
            "telefone": "61 98502-8544",
            "email": "heitormacedo@gmail.com"
}
```

**Para buscar cliente por id**

GET http://localhost:8080/clientes/{id}


**Para atualizar um cliente**

PUT http://localhost:8080/clientes/{id}

```
{
	    "id": 23,
            "nome": "Ronaldo Nazário do Nascimento",
            "cpf": "251.142.143-12",
            "endereco": {
            	"id": 24,
                "cep": "72.310-715",
                "logradouro": "Quadra 504 conjunto 09",
                "bairro": "Samambaia sul",
                "localidade": "Brasília",
                "uf": "DF",
                "complemento": "casa 12",
                "ddd":null,
                "gia":"",
                "ibge": null,
                "siafi":""
            },
            "telefone": "61 98402-8544",
            "email": "ronaldonazario@gmail.com"
}
```

**Para deletar um cliente**

DELETE http://localhost:8080/delete/{id}
