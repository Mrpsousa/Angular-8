CREATE TABLE CLIENTE (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100),
    created_at TIMESTAMP NULL DEFAULT NOW()
);

CREATE TABLE PRODUTO (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    DESCRICAO VARCHAR(100),
    PRECO_UNITARIO NUMERIC(20,2),
    created_at TIMESTAMP NULL DEFAULT NOW()
);

CREATE TABLE PEDIDO (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    CLIENTE_ID INTEGER,
	PRODUTO_ID INTEGER,
    TOTAL NUMERIC(20,2),
    DATA_PEDIDO TIMESTAMP,
    created_at TIMESTAMP NULL DEFAULT NOW()
);

INSERT INTO CLIENTE (id, nome, created_at) VALUES (1, 'roger', null), (2, 'marcos', null);
INSERT INTO PRODUTO (id, descricao, preco_unitario, created_at) VALUES (1, 'tv', 123, null),(2, 'radio', 321, null);
INSERT INTO PEDIDO (id, cliente_id, produto_id, total, data_pedido, created_at) VALUES (1, 1, 1, 4, null, null), (2, 2, 2, 3, null, null);
