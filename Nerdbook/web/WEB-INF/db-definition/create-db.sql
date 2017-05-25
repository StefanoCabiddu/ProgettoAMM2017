create schema Nerdbook;

create table Nerdbook.utente( 
	ID int primary key, 
	Nome varchar(32) not null, 
	Cognome varchar(32) not null,
	Username varchar(32) not null,
	Password varchar(32) not null,
	ImmagineProfilo varchar(4096),
	FrasePresentazione varchar(256) not null
);

create table Nerdbook.gruppi( 
	ID int primary key, 
	NomeGruppo varchar(32) not null, 
	ArgomentoGruppo varchar(256) not null,
	CaratteristicheGruppo varchar(32) not null,
	NumeroPartecipanti int not null
);

create table Nerdbook.post( 
	ID int primary key, 
	NomeUtente varchar(32) not null, 
	CognomeUtente varchar(32) not null,
	FrasePost varchar(1024) not null
);