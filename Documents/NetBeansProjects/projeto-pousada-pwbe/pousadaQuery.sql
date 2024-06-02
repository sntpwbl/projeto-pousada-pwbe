DROP DATABASE IF EXISTS pousada;
CREATE DATABASE pousada;

USE pousada;

DROP TABLE IF EXISTS tbl_usuarios;
CREATE TABLE tbl_usuarios(
    id_usuario int PRIMARY KEY AUTO_INCREMENT,
    email_usuario varchar(100) NOT NULL UNIQUE,
    senha_usuario varchar(24) NOT NULL
);
DROP TABLE IF EXISTS tbl_dados;
CREATE TABLE tbl_dados(
    id_dados int PRIMARY KEY AUTO_INCREMENT, 
    nome varchar(100) NOT NULL,
    cpf char(11) NOT NULL UNIQUE,
    endereco varchar(200) NOT NULL,
    ddd char(2) NOT NULL,
    telefone varchar(9) NOT NULL,
    cidade varchar(30) NOT NULL,
    estado char(2) NOT NULL,
    fk_email varchar(100) NOT NULL,
    FOREIGN KEY (fk_email) REFERENCES tbl_usuarios(email_usuario)
    );

DROP TABLE IF EXISTS tbl_quartos;
CREATE TABLE tbl_quartos(
    id_quarto int PRIMARY KEY AUTO_INCREMENT,
    status_quarto varchar(12) NOT NULL, 
    diaria_quarto float NOT NULL
);

DROP TABLE IF EXISTS tbl_pagamentos;
CREATE TABLE tbl_pagamentos(
    id_pagamento int PRIMARY KEY AUTO_INCREMENT,
    numero_cartao varchar(19) NOT NULL,
    nome_titular varchar(100) NOT NULL,
    cvv_cartao char(3) NOT NULL,
    data_vencimento date NOT NULL
);

DROP TABLE IF EXISTS tbl_reservas;
CREATE TABLE tbl_reservas(
    id_reserva int PRIMARY KEY auto_increment,
    fk_id_usuario int NOT NULL,
    fk_quarto int NOT NULL,
    fk_pagamento int NOT NULL,
    data_entrada date NOT NULL,
    data_saida date NOT NULL,
    FOREIGN KEY (fk_id_usuario) REFERENCES tbl_usuarios(id_usuario),
    FOREIGN KEY (fk_quarto) REFERENCES tbl_quartos(id_quarto),
    FOREIGN KEY (fk_pagamento) REFERENCES tbl_pagamentos(id_pagamento)
);

insert into tbl_usuarios(email_usuario, senha_usuario) values('teste', 'teste');
select * from tbl_usuarios;