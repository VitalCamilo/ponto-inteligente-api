CREATE TABLE ´empresa´(
´id´  bigint(20) not null,
´cnpj´ varchar(255) not null,
´data_atualizacao´ datetime not null,
´data_criacao´ datetime not null,
´razao_social´ varchar(255) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE ´funcionario´ (
´id´ bigint(20) not null,
´cpf´ varchar(255) not null,
´data_atualizacao´ datetime not null,
´data_criacao´ datetime not null,
´email´ varchar(255) not null,
´nome´ varchar(255) not null,
´perfil´ varchar(255) not null,
´qtd_horas_almoco´ float default null,
´qtd_horas_trabalhada_dia´ float default null,
´senha´ varchar(255) not null,
´valor_hora´ decimal(19,2) default null,
´empresa_id´ bigint(20) default null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE ´lancamento´ (
´id´ bigint(20) not null,
´data´ datetime not null,
´data_atualizacao´ datetime not null,
´data_criacao´ datetime not null,
´descricao´ varchar(255) default null,
´localizacao´ varchar(255) default null,
´tipo´ varchar(255) default null,
´funcionario_id´ bigint(20) default null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Index para tabela 'empresa'

ALTER TABLE ´empresa´ ADD PRIMARY KEY(´id´);

-- Index para tabela 'funcionario'

ALTER TABLE ´funcionario´
 ADD PRIMARY KEY (´id´);
 
 -- Index para tabela 'lancamento'
 
 ALTER TABLE ´lancamento´ 
 ADD PRIMARY KEY(´id´);
 
 -- AUTO_INCREMENT PARA TABELAS
 
 ALTER TABLE ´empresa´ MODIFY
 ´id´ bigint(20) not null AUTO_INCREMENT;
 
  ALTER TABLE ´funcionario´ MODIFY
 ´id´ bigint(20) not null AUTO_INCREMENT;
 
  ALTER TABLE ´lancamento´ MODIFY
 ´id´ bigint(20) not null AUTO_INCREMENT;
 
 --  CHAVES ESTRANGEIRAS PARA TABELAS
 
 ALTER TABLE ´funcionario´ 
 ADD CONSTRAINT ´FKfuncionario´
 FOREIGN KEY (´empresa_id´) 
 references ´empresa´ (´id´);
 
  ALTER TABLE ´lancamento´ 
 ADD CONSTRAINT ´FKlancamento´
 FOREIGN KEY (´funcionario_id´) 
 references ´funcionario´ (´id´);

