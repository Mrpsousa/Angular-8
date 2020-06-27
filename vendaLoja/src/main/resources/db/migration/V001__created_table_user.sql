CREATE TABLE usuario (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    /*x decimal(19,10) DEFAULT NULL,*/
	deleted_at TIMESTAMP NULL, 
	created_at TIMESTAMP NULL DEFAULT NOW(), 
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO usuario (id, user_name, senha) VALUES
(1,'admin', 'admin');