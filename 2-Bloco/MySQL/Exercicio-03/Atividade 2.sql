-- Criação do banco de dados db_ecommerce
create database db_ecommerce
default character set utf8
default collate utf8_general_ci; 

-- Entrar no banco de dados
use db_ecommerce;

-- cria a tabela produto
create table tb_produto(
	id bigint auto_increment not null,
    nome varchar(25) not null,
    preco decimal(6, 2) not null,
    marca varchar(25) not null,
    quantidade int(4) not null,
    
    primary key(id)
)Engine InnoDb default char set = utf8;

-- Inserir 8 registros na tabela produto
insert into tb_produto (nome, preco, quantidade, marca)
values
('Televisão', '2104.99', '50', 'Samsung'),
('Notebook', '2600.59', '86', 'Dell'),
('Computador', '8054.97', '20', 'G-Fire'),
('Celular', '950.49', '154', 'Apple'),
('Fogão', '1159.00', '37', 'Eletrolux'),
('Geladeira', '2649.00', '15', 'Eletrolux'),
('Headset', '399.99', '320', 'Logitech'),
('Mouse', '150.88', '50', 'Multilaser');

-- Consulta para os produtos com o preço maior que 500
select nome, marca, preco from tb_produto
where preco > 500
order by nome;

-- Consulta para os produtos com o preço menor que 500
select nome, marca, preco from tb_produto
where preco < 500
order by nome;

-- Atualização de um registro
update tb_produto
set preco = '3850.99'
where id = '4';