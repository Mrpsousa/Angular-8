 CREATE TABLE PEDIDO (
    id INTEGER AUTO_INCREMENT,
    CLIENTE_ID INTEGER,
    PRODUTO_ID INTEGER,
    DATA_PEDIDO TIMESTAMP NULL DEFAULT NOW(),
    TOTAL NUMERIC(20,2),
    created_at TIMESTAMP NULL DEFAULT NOW(),
    PRIMARY KEY (id)
);
 
 INSERT INTO pedido (id, cliente_id, produto_id, data_pedido, total, created_at) VALUES
(1, 1, 1, null, 123, null);

CREATE TABLE CLIENTE (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    PEDIDO_ID INTEGER, 
    NOME VARCHAR(100),
    created_at TIMESTAMP NULL DEFAULT NOW(),
    FOREIGN KEY (PEDIDO_ID) REFERENCES PEDIDO(id) ON DELETE CASCADE
);

CREATE TABLE PRODUTO (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    DESCRICAO VARCHAR(100),
    PRECO_UNITARIO NUMERIC(20,2),
    created_at TIMESTAMP NULL DEFAULT NOW()
);




INSERT INTO produto (id, descricao, preco_unitario, created_at) VALUES
(1,'produto X', 323, null);


INSERT INTO cliente (id, pedido_id, nome, created_at) VALUES
(1, 1, 'proger', null);
