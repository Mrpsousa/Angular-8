CREATE TABLE cliente (
	id integer primary key AUTO_INCREMENT,
	nome varchar(400),	
	cpf varchar(11),
	rg varchar(10),
	data_nasc date,
	created_at TIMESTAMP DEFAULT NOW()
);


INSERT INTO cliente (id, nome, cpf, rg, data_nasc, created_at) VALUES (1,'admin','02283845456','1983746273', null, null);
INSERT INTO cliente (id, nome, cpf, rg, data_nasc, created_at) VALUES (2,'roger','92837412345','5436432627', null, null);
INSERT INTO cliente (id, nome, cpf, rg, data_nasc, created_at) VALUES (3,'tanus','81926182381','2456745673', null, null);
INSERT INTO cliente (id, nome, cpf, rg, data_nasc, created_at) VALUES (4,'ironman','82365394649','2356768834', null, null);
INSERT INTO cliente (id, nome, cpf, rg, data_nasc, created_at) VALUES (5,'chaves','23425235234','2342524567', null, null);

CREATE TABLE produto (
	id integer primary key AUTO_INCREMENT,
	descricao varchar(150),
	nome_produto varchar(100),
	created_at TIMESTAMP DEFAULT NOW()
);

INSERT INTO produto (id, descricao, nome_produto, created_at ) VALUES (1,'Sofá de 2 lugares','Sofá Lang', null);
INSERT INTO produto (id, descricao, nome_produto, created_at) VALUES (2,'Cama Box','cama', null);
INSERT INTO produto (id, descricao, nome_produto, created_at) VALUES (3,'Mesa Itatiaia','mesa', null);
INSERT INTO produto (id, descricao, nome_produto, created_at) VALUES (4,'Geladeira Consul','geladeira', null);
INSERT INTO produto (id, descricao, nome_produto, created_at) VALUES (5,'Microondas Brastemp','microondas', null);
