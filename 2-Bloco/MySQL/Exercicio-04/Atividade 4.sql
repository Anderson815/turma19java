-- Cria o banco de dados
create database db_cidade_das_carnes
default character set utf8
default collate utf8_general_ci;

-- Entra no banco de dados
use db_cidade_das_carnes;

-- Cria a tabela categoria
create table tb_categoria(
	id int auto_increment not null,
    nome varchar(15) not null,
    descricao varchar(255) not null,
    
    primary key(id)
)Engine InnoDb char set utf8;

-- Cria a tabela produto
create table tb_produto(
	id int auto_increment not null,
    nome varchar(15) not null,
    preco decimal(5, 2) not null,
    ativo boolean not null,
    categoria int not null,
    
    primary key(id),
    foreign key(categoria) references tb_categoria(id)
)Engine InnoDb char set utf8;

-- Inseri 5 registros na tabela categoria
insert into tb_categoria 
(nome, descricao)
values
("Bovino", "Carne que vem do boi"),
("Suíno", "Carne que vem do porco"),
("Avino", "Carne que vem das aves"),
("Peixes", "Preciso nem descrever"),
("Outros", "Qualquer outro tipo de carne");

-- Inseri 8 registros na tabela produto
insert into tb_produto 
(nome, preco, ativo, categoria)
values
("Picanha", 105.50, true, 1),
("Costela", 29.90, true, 1),
("Coxa", 59.75, false, 3),
("Sardinha", 35.70, true, 4),
("Filé", 15.65, true, 3),
("Bacon", 27.35, false, 2),
("Linguiça", 146.75, false, 2),
("Lagosta", 59.50, false, 5);

select * from tb_produto;

-- Consulta produto com o valor maior do que 50 reais.
select nome, preco from tb_produto
where preco > 50
order by nome;

-- Consulta Produto com o valor entre 3 e 60 reais.
select nome, preco from tb_produto
where preco between 3 and 60
order by nome;

-- Consulta Produto com a letra B.
select nome, preco from tb_produto
where nome like "C%"
order by nome;

-- Consulta entre as duas tabelas.
select p.nome, p.preco, p.ativo, c.nome as categoria, c.descricao from tb_produto as p
inner join tb_categoria as c
on p.categoria = c.id
order by p.nome;

-- Consulta Produto de uma categoria específica
select p.nome, p.preco, c.nome as categoria from tb_produto as p
inner join tb_categoria as c
on p.categoria = c.id
where c.id = 1
order by p.nome;