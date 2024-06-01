# Spring Security with OAth2 and JWT

Study of authentication in a simple tweet application, using Spring Security 6, OAuth2, and JWT.
You will find configuration, entity, repository, service, and controller layers, with their respective responsibilities.

## To upload the application

- Enter the docker folder, and run the command: 
``` sh
    docker-compose -d up --build --force-recreate
```

## To create private and public keys
    
- Go to the "src/main/resource" folder and run the following commands through the terminal

``` sh
    openssl genrsa > app.key;
    openssl rsa -in app.key -pubout -out app.pub;
```

- With the commands above, two files will be created, app.key for the private key, and app.pub for the public key.

- To insert data into the profile table, create the data.sql file also within the "src/main/resource" folder, with the following content:

```sh
INSERT INTO tb_roles (role_id, name) VALUES (1, 'admin');
INSERT INTO tb_roles (role_id, name) VALUES (2, 'basic');
```
- ![alt text](image.png)