-- Cria o banco de dados
create database db_cursoDaMinhaVida
default character set utf8
default collate utf8_general_ci;

-- Entra no banco de dados
use db_cursoDaMinhaVida;

-- Cria a tabela categoria
create table tb_categoria(
	id int auto_increment not null,
    nome varchar(15) not null,
    descricao varchar(255) not null,
    
    primary key(id)
)Engine InnoDb char set utf8;

-- Cria a tabela produto
create table tb_curso(
	id int auto_increment not null,
    nome varchar(15) not null,
    preco decimal(5, 2) not null,
    duracao int not null,
    categoria int not null,
    
    primary key(id),
    foreign key(categoria) references tb_categoria(id)
)Engine InnoDb char set utf8;

-- Inseri 5 registros na tabela categoria
insert into tb_categoria 
(nome, descricao)
values
("T.I.", "tenha muitas dores de cabeça"),
("Bem estar", "Dor no joelhos já mais"),
("Humanas", "Só sei que nada sei"),
("Biológicas", "Veja a beleza dos seres vivos por dentro"),
("Exatas", "Aprenda a usar a matemática ao seu favor e a mudar o mundo com ela");

-- Inseri 8 registros na tabela produto
insert into tb_curso
(nome, preco, duracao, categoria)
values
("JAVA", 105.50, 20, 1),
("MySQL", 29.90, 40, 1),
("Junit", 59.75, 45, 1),
("Dieta", 35.70, 10, 2),
("Corpo Fala", 15.65, 3, 4),
("Micro-organismo", 27.35, 15, 4),
("Física em Marte", 146.75, 12, 5),
("Relatividade", 59.50, 26, 4);

-- Consulta produto com o valor maior do que 50 reais.
select nome, preco from tb_curso
where preco > 50
order by nome;

-- Consulta Produto com o valor entre 3 e 60 reais.
select nome, preco from tb_curso
where preco between 3 and 60
order by nome;

-- Consulta Produto com a letra B.
select nome, preco from tb_curso
where nome like "J%"
order by nome;

-- Consulta entre as duas tabelas.
select cu.nome, cu.preco, cu.duracao, ca.nome as categoria, ca.descricao from tb_curso as cu
inner join tb_categoria as ca
on cu.categoria = ca.id
order by cu.nome;

-- Consulta Produto de uma categoria específica
select cu.nome, cu.preco, ca.nome as categoria from tb_curso as cu
inner join tb_categoria as ca
on cu.categoria = ca.id
where ca.nome = "T.I."
order by cu.nome;