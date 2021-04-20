-- Criação do bancode dados da escola
create database db_escola
default character set utf8
default collate utf8_general_ci;

-- Entra no banco de dados
use db_escola;

-- Cria tabela de alunos
create table tb_aluno(
	id bigint auto_increment not null,
    nome varchar(50) not null,
    nota decimal(3,1) not null,
    classe char(2) not null,
    celular_responsavel char(9) not null,
    primary key(id)
)Engine InnoDb default char set utf8;

-- Inserção de 8 alunos na tabela
insert into tb_aluno
values
(default, 'Anderson', '10', '3D', '111111111'),
(default, 'Ana', '4.5', '2G', '222222222'),
(default, 'Carlos', '9', '1A', '333333333'),
(default, 'Bruno', '3.7', '2E', '444444444'),
(default, 'Bianca', '6.0', '1B', '555555555'),
(default, 'João', '5.5', '3C', '666666666'),
(default, 'Amanda', '9.5', '2A', '777777777'),
(default, 'Natalice', '7.5', '3D', '888888888');

-- Consulta alunos que tiraram uma nota maior que 7
select nome, classe, nota from tb_aluno
where nota > 7
order by nome;

-- Consulta alunos que tiraram uma nota menor que 7
select nome, classe, nota from tb_aluno
where nota < 7
order by nome;

-- Atualiza um registro de aluno
update tb_aluno
set nota = '10'
where id = '8';