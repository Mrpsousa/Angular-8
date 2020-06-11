CREATE TABLE usuario (
	id integer primary key AUTO_INCREMENT,
	nome varchar(400),	
	cpf varchar(11),
	roles varchar (20),
	created_at TIMESTAMP DEFAULT NOW()
);


INSERT INTO usuario (id, nome, cpf, roles, created_at) VALUES (1,'roger','02283845456','admin', null);


CREATE TABLE produto (
	id integer primary key AUTO_INCREMENT,
	descricao varchar(150),
	nome varchar(100),
	categoria varchar(30),
	valor DECIMAL(19,2),
	created_at TIMESTAMP DEFAULT NOW()
);

INSERT INTO produto (id, descricao, nome, categoria, valor, created_at ) VALUES (1,'Iphone 9 e fone','Iphone','eletronico', 1600.00, null);
INSERT INTO produto (id, descricao, nome, categoria, valor, created_at ) VALUES (2,'Perfume de notas amadeiradas','Malbec','perfume',200.00, null);
INSERT INTO produto (id, descricao, nome, categoria, valor, created_at ) VALUES (3,'Tênis Corrida Rainha','Rainha cross','sapato',650.00, null);
INSERT INTO produto (id, descricao, nome, categoria, valor, created_at ) VALUES (4,'Terno Slim Hugo Boss','Terno Slim','roupa', 800.00, null);


