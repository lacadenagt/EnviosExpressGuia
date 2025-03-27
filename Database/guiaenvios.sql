CREATE DATABASE guiaenvios;
use guiaenvios;

CREATE TABLE TipoUsuario(
	idTipoUsuario INT AUTO_INCREMENT,
    nombreTipo varchar(20) NOT NULL UNIQUE,
    primary key (idTipoUsuario)
);

INSERT INTO TipoUsuario(nombreTipo) VALUES('admin');
INSERT INTO TipoUsuario(nombreTipo) VALUES('usuario');


CREATE TABLE EstatusCuenta(
	idEstadoCuenta INT AUTO_INCREMENT,
    nombreEstadoCuenta varchar(10) NOT NULL UNIQUE,
    primary key (idEstadoCuenta)
);

INSERT INTO EstatusCuenta(nombreEstadoCuenta) VALUES ('ACTIVO');
INSERT INTO EstatusCuenta(nombreEstadoCuenta) VALUES ('INACTIVO');

CREATE TABLE Usuario(
	idUsuario INT AUTO_INCREMENT,
    nombres varchar(100) NOT NULL,
    apellidos varchar(100) NOT NULL,
    fechaNacimiento date, 
    correo varchar(128),
    username varchar(128) NOT NULL UNIQUE,
    contrasena varchar(128) NOT NULL,
    fechaRegistro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    idEstadoCuenta INT,
    idTipoUsuario  INT NOT NULL,
    PRIMARY KEY (idUsuario),
    FOREIGN KEY (idTipoUsuario) REFERENCES TipoUsuario(idTipoUsuario),
    FOREIGN KEY (idEstadoCuenta) REFERENCES EstatusCuenta(idEstadoCuenta)
); 


