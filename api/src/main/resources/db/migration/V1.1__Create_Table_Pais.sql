CREATE TABLE paises (

    id bigint not null auto_increment,
    nome VARCHAR(100) not null,
    capital VARCHAR(100) not null,
    regiao VARCHAR(100),
    sub_regiao VARCHAR(100),
    area integer (100),

    primary key(id)
);