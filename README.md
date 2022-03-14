# biometric-app

APP para controle de usuários manipulados pela interface de biometria com nodemcu e persistidos na cloud heroku com bd MYSQL

Tecnologias - Java 8, Spring Boot 2.6.4, MYSQL 8

*ENDPOINTS*

Retornar todos os usuários cadastrados
https://biometric-app-iot.herokuapp.com/user


Retornar usuário por Id
https://biometric-app-iot.herokuapp.com/user/4

Cadastrar usuário
https://biometric-app-iot.herokuapp.com/user

-BODY

{
    "name" : "Rafael Veloso",
    "age" : 25
}


LOGIN POR ID (POPULA A PROPRIEDADE ISLOGGED COMO TRUE)
https://biometric-app-iot.herokuapp.com/user/logon/4

LOGOUT POR ID (POPULA A PROPRIEDADE ISLOGGED COMO FALSE)
https://biometric-app-iot.herokuapp.com/user/logout/4
