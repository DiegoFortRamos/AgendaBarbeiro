create table barbeiros(
    id_barbeiro    INT              AUTO_INCREMENT PRIMARY KEY,
    nome           VARCHAR(200)     NOT NULL,
    sobrenome      VARCHAR(300)     NOT NULL,
    nascimento     VARCHAR(12)      NOT NULL,
    cpf            VARCHAR(15)      NOT NULL UNIQUE,
    email          VARCHAR(100)     NOT NULL UNIQUE,
    pais           VARCHAR(50)      NOT NULL,
    estado         VARCHAR(50)      NOT NULL,
    cidade         VARCHAR(1000)    NOT NULL,
    cep            VARCHAR(20),
    complemento    VARCHAR(200),
    numero         int,
    logradouro     VARCHAR(150)


)