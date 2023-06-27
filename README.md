# Ms-Allwin

## O Projeto
É um sistema com autenticação de um RH que calcula o salario de cada colaborador dado a uma certa quantidade de dias, onde quem faz o gerenciamento do mesmo precisa ter credenciais e autorização.


## 📋 Frameworks

### Feign
Para requisições de API entre microsserviços

### Ribbon
Para balanceamento de carga

### Servidor Eureka 
Para registro dos microsserviços

### API Gateway Zuul
Para roteamento e autorização

### Hystrix
Para tolerância a falhas

### OAuth e JWT
Para autenticação e autorização

## ⚙️ Usabilidade (Requisições) 

`POST` Login

```yaml

Realizar o Login:
localhost:8080/hr-oauth/oauth/token
Authorization: Basic Auth
Username: {{client-name}}
Password: {{client-secret}}

Importante salvar o Token para demais requisições.
```
____________________________________________________________________________________________________________________

Demais requisições serão postadas posteriormente.


## 🛠️ Construído com

* [Intellij](https://www.jetbrains.com/idea/download/?section=windows) - IDE
* [SpringBoot](https://spring.io/) - Framework principal
* [Maven](https://maven.apache.org/) - Gerente de Dependência


## 🎁 Expressões de gratidão

* Gostaria de agradecer ao professor Nelio Alves por oferecer um curso que trás além de conteúdo super atualizado uma formula de ensino que já nos apresenta às boas práticas do desenvolvimento de software, sem falar na excelente didática.
 
* Github do mesmo: [acenelio](https://github.com/acenelio)

## 📄 Licença

The scripts and documentation in this project are released under the [MIT License](license)
