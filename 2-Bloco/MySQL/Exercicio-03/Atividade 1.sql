-- criação do banco de dados do RH
create database db_rh
default character set utf8
default collate utf8_general_ci;

-- entrar no banco de dados
use db_rh;

-- criação da tabela funcianário
create table tb_funcionario(
	matricula int(5) auto_increment not null,
    nome varchar(45) not null,
    cpf char(11) not null unique,
    salario decimal(7, 2) not null,
    cargo varchar(20),
    primary key(matricula)
) Engine InnoDb default char set = utf8;

-- Inserção de 5 registros
insert into tb_funcionario
values
(default, 'Anderson', '11111111111', '37850.85', 'Gerente'),
(default, 'Ana', '22222222222', '14405.50', 'Analista'),
(default, 'Beatriz', '33333333333', '7375.25', 'Dev Back-end'),
(default, 'Caio', '44444444444', '1932.45', 'Dev Front-end'),
(default, 'Lucas', '55555555555', '1580.99', 'Dba');

-- consulta dos funcionários que ganham mais de 2000
select nome, cargo, salario from tb_funcionario
where salario > 2000
order by nome; 

-- consulta dos funcionários que ganham menos de 2000
select nome, cargo, salario from tb_funcionario
where salario <= 2000
order by nome;

-- Atualização de um registro
update tb_funcionario
set salario = '50780.99'
where matricula = 1;