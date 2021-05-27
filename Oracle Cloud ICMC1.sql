DROP TABLE Usuario;
DROP TABLE Perfil;
DROP TABLE Planos;
DROP TABLE Kids; 
DROP TABLE FormaPagamento;  
DROP TABLE Debito;
DROP TABLE Pessoa;

CREATE TABLE Planos(
    Id NUMBER NOT NULL,
    Nome VARCHAR2(25) NOT NULL,
    Valor FLOAT NOT NULL,
    QualidadeMax NUMBER(5) NOT NULL,
    QtdTelas NUMBER(1) NOT NULL,
    NumMaxPerfis NUMBER(1) NOT NULL,
    CONSTRAINT PK_PLANO PRIMARY KEY(Id),
    CONSTRAINT UN_PLANO_NOME UNIQUE(Nome),
    CONSTRAINT CK_PLANO_QLDSTREAM CHECK(QualidadeMax in (360,480,720,1080,2160))
);


CREATE TABLE Usuario(
     CPF NUMBER(11) NOT NULL,
    Nome VARCHAR2(60) NOT NULL,
    Email VARCHAR2(255) NOT NULL,
    DataNasc DATE NOT NULL,
    Plano NUMBER NOT NULL,
    CONSTRAINT PK_USUARIO PRIMARY KEY(CPF),
    CONSTRAINT FK_USUARIO_PLANO FOREIGN KEY(Plano)
        REFERENCES Plano(Id) ON DELETE SET NULL,
    CONSTRAINT UN_USUARIO_EMAIL UNIQUE(Email)
);

/*INSERT INTO Usuario(IdUsuario,CPF,NomeUsuario,DataNasc,Email) values(101,30000,'igor',TO_DATE('07/12/2019 15:00:00', 'DD/MM/YYYY HH24:MI:SS'),'igorloredo@i12');
INSERT INTO Usuario(IdUsuario,CPF,NomeUsuario,DataNasc,Email) values(102,30000,'igor',TO_DATE('07/12/2019 15:00:00', 'DD/MM/YYYY HH24:MI:SS'),'igorloredo@i12'); */

CREATE TABLE Perfil(
    IdPerfil INTEGER NOT NULL,
    IdADM INTEGER,
    Apelido VARCHAR2(10) NOT NULL,
    Idioma VARCHAR2(30) DEFAULT 'PT-BR',
    IdiomaPref VARCHAR2(30),
    ResolucaoPref INTEGER
);



CREATE TABLE FormaPagamento(
     IdUsuarioPag INTEGER NOT NULL PRIMARY KEY
     REFERENCES Usuario(IdUsuario)             
); 

CREATE TABLE Debito(
    IdDebito INTEGER NOT NULL,
    NomeCartao VARCHAR2(20) NOT NULL,
    Banco VARCHAR2(20) NOT NULL,
    Agencia INTEGER NOT NULL,
    Conta INTEGER NOT NULL
    
);

CREATE TABLE Kids (
    FaixaEtaria INTEGER NOT NULL
); 

CREATE TABLE Pesssoa( /*falta refenciar filmes*/
    ID NUMBER NOT NULL,
    NomePessoa VARCHAR2(20),
    Cargo VARCHAR2(20)
);

CREATE TABLE Serie( /*refenciar filme*/
    id NUMBER NOT NULL,
    numTemporadas NUMBER NOT NULL
);


CREATE TABLE Idioma(
    ID NUMBER NOT NULL,
    Lengenda VARCHAR2(15) NOT NULL,
    Audio VARCHAR2(15)NOT NULL
);






