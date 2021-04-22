-- Cria o banco de dados
create database db_generation_game_online
default character set utf8
default collate utf8_general_ci;

-- Entra no banco de dados
use db_generation_game_online;

-- Cria a tabela classe
create table tb_classe(
	id int(2) auto_increment not null,
    nome varchar(20) not null,
    descricao varchar(255),
    
    primary key(id)
)Engine InnoDb default char set utf8;

-- Cria a tabela personagem
create table tb_personagem(
	id bigint auto_increment not null,
    nome varchar(15) not null,
    ataque int(4) not null,
    defesa int(4) not null,
    classe int(2) not null,
    
    primary key(id),
    foreign key(classe) references tb_classe(id)
)Engine InnoDb default char set utf8;

-- Inserir 5 registros na classe
insert into tb_classe values
(default, "Tanque", "Possui muita vida e defesa, estilo de luta normalmente corpo a corpo"),
(default, "Assassino", "Muita velocidade de movimento e de golpe, etilo de luta corpo a corpo"),
(default, "Mago", "Muito poder mágico e utiliza muita mana, estilo de luta a distância"),
(default, "Atirador", "Muita velocidade de movimento e de golpe, estilo de luta a distância"),
(default, "Suporte", "Possui muita vida e defesa, normalmente não luta");

-- Inserir 8 registros no personagem
insert into tb_personagem values
(default, "Fizz", 2500, 1400, 2),
(default, "Veigar", 1800, 1250, 3),
(default, "Nasus", 3700, 2875, 1),
(default, "Lux", 1500, 2200, 5),
(default, "Caitlyn", 2100, 1900, 4),
(default, "Ahri", 2200, 900, 3),
(default, "Cassiopeia", 900, 2200, 5),
(default, "Tryndamare", 4200, 3700, 1);

-- Consulta os personagens com mais de 2000 de ataque
select nome, ataque from tb_personagem
where ataque > 2000
order by nome;

-- Consulta os personagens entre 1000 até 2000 de defesa
select nome, defesa from tb_personagem
where defesa between 1000 and 2000
order by nome;

-- Consulta os personagens que começam com a letra C
select nome, ataque, defesa, classe from tb_personagem
where nome like "C%";

-- Consulta os dados entre as duas tabelas
select p.nome as Nome, p.ataque as Ataque, p.defesa as Defesa, c.nome as Classe, c.descricao as Descrição from tb_personagem as p
inner join tb_classe as c
on p.classe = c.id
order by p.nome;

-- Consulta personagem da classe Mago
select p.nome as Nome, p.ataque as Ataque, p.defesa as Defesa, c.nome as Classe from tb_personagem as p
inner join tb_classe as c 
on p.classe = c.id
where c.nome = "Mago"
order by p.nome;