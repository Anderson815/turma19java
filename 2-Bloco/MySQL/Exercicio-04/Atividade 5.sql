-- Cria o banco de dados
create database db_construindo_a_nossa_vida
default character set utf8
default collate utf8_general_ci;

-- Entra no banco de dados
use db_construindo_a_nossa_vida;

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
    quantidade int not null,
    categoria int not null,
    
    primary key(id),
    foreign key(categoria) references tb_categoria(id)
)Engine InnoDb char set utf8;

-- Inseri 5 registros na tabela categoria
insert into tb_categoria 
(nome, descricao)
values
("Hidráulica", "Tudo que envolve água"),
("Elétrica", "Tudo que envolve sobre enegia"),
("Concreto", "Materiais básicos para para preparação de concreto"),
("Ferramenta", "Ferramentas para trabalhar com construção"),
("Acabamento", "cuida de transtornos mentais e comportamentais do indivíduo");

-- Inseri 8 registros na tabela produto
insert into tb_produto 
(nome, preco, quantidade, categoria)
values
("Cano", 105.50, 20, 1),
("Caixa", 29.90, 40, 1),
("Fio", 59.75, 45, 2),
("Lâmpada", 35.70, 10, 2),
("Areia", 15.65, 3, 3),
("Pedra", 27.35, 15, 3),
("Tinta", 146.75, 12, 5),
("Pá", 59.50, 26, 4);

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
select p.nome, p.preco, p.quantidade, c.nome as categoria, c.descricao from tb_produto as p
inner join tb_categoria as c
on p.categoria = c.id
order by p.nome;

-- Consulta Produto de uma categoria específica
select p.nome, p.preco, c.nome as categoria from tb_produto as p
inner join tb_categoria as c
on p.categoria = c.id
where c.id = 2
order by p.nome;