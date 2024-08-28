CREATE DATABASE DADOS_FUNCIONARIOS

USE DADOS_FUNCIONARIOS

CREATE TABLE FUNCIONARIO
(ID_FUNC INT IDENTITY(1,1) PRIMARY KEY,
NM_FUNCIONARIO VARCHAR(50) NOT NULL,
DT_ADMISSAO DATE NOT NULL,
SALARIO NUMERIC (18,2) NULL,
SEXO VARCHAR(1) NULL)

SELECT * FROM FUNCIONARIO

INSERT INTO FUNCIONARIO VALUES ('JOSE PEREIRA','03/01/2024',1800.20,'M')

--ESPECIFICA QUE VAI INSERIR APENAS DT_ADMISSAO E NM_FUNCIOANRIO
INSERT INTO FUNCIONARIO (DT_ADMISSAO,NM_FUNCIONARIO) VALUES ('15/12/2005','ANGELINA')

--ESPECIFICICA QUE VAI SELECIONAR TODOS QUE COME�AM COM J 
SELECT * FROM FUNCIONARIO WHERE NM_FUNCIONARIO LIKE 'J%'