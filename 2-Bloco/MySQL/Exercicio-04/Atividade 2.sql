-- Cria o banco de dados
create database db_pizzaria_legal
default character set utf8
default collate utf8_general_ci;

-- Entra no banco de dados
use db_pizzaria_legal;

-- Cria a tabela categoria
create table tb_categoria(
	id int auto_increment not null,
    nome varchar(15) not null,
    descricao varchar(255) not null,
    
    primary key(id)
)Engine InnoDb char set utf8;

-- Cria a tabela pizza
create table tb_pizza(
	id int auto_increment not null,
    nome varchar(15) not null,
    preco decimal(5, 2) not null,
    quantidade int not null,
    categoria int not null,
    
    primary key(id),
    foreign key(categoria) references tb_categoria(id)
)Engine InnoDb char set utf8;

-- Inseri 5 registros na tabela categoria
insert into tb_categoria 
(nome, descricao)
values
("Americana", "do modelo dos estados unidos"),
("Italiana", "massa tradicional"),
("Brasileira", "massa bem leve"),
("Espanhola", "massa bem pessada"),
("Mexicana", "cheddar na borda");

-- Inseri 8 registros na tabela pizza
insert into tb_pizza 
(nome, preco, quantidade, categoria)
values
("Calabresa", 32.50, 40, 3),
("Mussarela", 25.90, 20, 3),
("4 Queijos", 35.25, 25, 3),
("Portuguesa", 48.50, 10, 4),
("Camarão", 55.65, 3, 1),
("Milho", 22.35, 15, 2),
("Bauru", 46.75, 12, 5),
("Frango", 20.50, 26, 4);

-- Consulta Pizzas com o valor maior do que 45 reais.
select nome, preco from tb_pizza
where preco > 45
order by nome;

-- Consulta Pizzas com o valor entre 29 e 60 reais.
select nome, preco from tb_pizza
where preco between 29 and 60
order by nome;

-- Consulta Pizzas com a letra C.
select nome, preco from tb_pizza
where nome like "C%"
order by nome;

-- Consulta entre as duas tabelas.
select p.nome, p.preco, p.quantidade, c.nome as categoria, c.descricao from tb_pizza as p
inner join tb_categoria as c
on p.categoria = c.id
order by p.nome;

-- Consulta Pizzas de uma categoria específica
select p.nome, p.preco, c.nome as categoria from tb_pizza as p
inner join tb_categoria as c
on p.categoria = c.id
where c.nome = "Brasileira"
order by p.nome;