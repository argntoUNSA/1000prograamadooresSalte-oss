drop database if exists universidad;
CREATE DATABASE universidad CHARACTER SET utf8mb4;
USE universidad;

CREATE TABLE departamento(
	id_departamento int,
	nombre varchar(50) not null,
    primary key(id_departamento)
);

CREATE TABLE persona(
	id_persona int,
	nif VARCHAR(9),
	nombre VARCHAR(25),
	apellido1 VARCHAR(50),
	apellido2 VARCHAR(50),
	ciudad VARCHAR(25),
	direccion VARCHAR(50),
	telefono VARCHAR(9),
	fecha_nacimiento DATE,
	sexo ENUM('H', 'M'),
	tipo ENUM('profesor', 'alumno'),
    primary key(id_persona)
);

CREATE TABLE profesor(
	id_profesor int, 
	id_departamento int,
    foreign key(id_profesor) references persona(id_persona),
	foreign key(id_departamento) references departamento(id_departamento),
    primary key(id_profesor)
);

create table grado(
	id_grado int,
    nombre varchar(100),
    primary key(id_grado)
);


create table asignatura(
	id_asignatura INT,
	nombre VARCHAR(100),
	creditos FLOAT,
	tipo ENUM('basica','obligatoria','optativa'),
	curso tinyint ,
	cuatrimestre tinyint,
	id_profesor INT,
	id_grado INT,
    primary key(id_asignatura),
	foreign key(id_profesor) references profesor(id_profesor),
	foreign key(id_grado) references grado(id_grado)
);

create table curso_escolar(
	id_curso_escolar INT,
	anyo_inicio YEAR,
    anyio_fin YEAR,
    primary key(id_curso_escolar)
);

create table alumno_se_matricula_asignatura(
	id_alumno INT,
	id_asignatura INT,
	id_curso_escolar INT,
    primary key(id_alumno, id_asignatura, id_curso_escolar),
    foreign key(id_alumno) references persona(id_persona),
    foreign key(id_asignatura) references asignatura(id_asignatura),
	foreign key(id_curso_escolar) references curso_escolar(id_curso_escolar)
);


insert into departamento values(1, 'Informática');
insert into departamento values(2, 'Matemáticas');
insert into departamento values(3, 'Economía y Empresa');
insert into departamento values(4, 'Educación');
insert into departamento values(5, 'Agronomía');
insert into departamento values(6, 'Química y Física');
insert into departamento values(7, 'Filología');
insert into departamento values(8, 'Derecho');
insert into departamento values(9, 'Biología y Geología');

insert into persona values(1, '26902806M', 'Salvador', 'Sánchez', 'Pérez', 'Almería', 'C/ Real del barrio alto', '950254837', '1991/03/28', 'H', 'alumno');
insert into persona values(2, '89542419S', 'Juan', 'Saez', 'Vega', 'Almería', 'C/ Mercurio', '618253876','1992/08/08', 'H', 'alumno');
insert into persona values(3, '11105554G', 'Zoe', 'Ramirez', 'Gea', 'Almería', 'C/ Marte', '618223876','1979/08/19', 'M', 'profesor');
insert into persona values(4, '17105885A', 'Pedro', 'Heller', 'Pagac', 'Almería', 'C/ Estrella fugaz', NULL,'2000/10/05', 'H', 'alumno');
insert into persona values(5, '38223286T', 'David', 'Schmidt', 'Fisher', 'Almería', 'C/ Venus', '678516294','1978/01/19', 'H', 'profesor');
insert into persona values(6, '04233869Y', 'José', 'Koss', 'Bayer', 'Almería', 'C/ Júpiter', '628349590','1998/01/28', 'H', 'alumno');
insert into persona values(7, '97258166K', 'Ismael', 'Strosin', 'Turcotte', 'Almería', 'C/ Neptuno', NULL,'1999/05/24', 'H', 'alumno');
insert into persona values(8, '79503962T', 'Cristina', 'Lemke', 'Rutherford', 'Almería', 'C/ Saturno','669162534', '1977/08/21', 'M', 'profesor');
insert into persona values(9, '82842571K', 'Ramón', 'Herzog', 'Tremblay', 'Almería', 'C/ Urano','626351429', '1996/11/21', 'H', 'alumno');
insert into persona values(10, '61142000L', 'Esther', 'Spencer', 'Lakin', 'Almería', 'C/ Plutón', NULL,'1977/05/19', 'M', 'profesor');

insert into profesor values(3, 1);
insert into profesor values(5, 2);
insert into profesor values(8, 3);
insert into profesor values(10, 4);

insert into grado values(1, 'Grado en Ingeniería Agrícola (Plan 2015)');
insert into grado values(2, 'Grado en Ingeniería Eléctrica (Plan 2014)');
insert into grado values(3, 'Grado en Ingeniería Electrónica Industrial (Plan 2010)');
insert into grado values(4, 'Grado en Ingeniería Informática (Plan 2015)');
insert into grado values(5, 'Grado en Ingeniería Mecánica (Plan 2010)');
insert into grado values(6, 'Grado en Ingeniería Química Industrial (Plan 2010)');
insert into grado values(7, 'Grado en Biotecnología (Plan 2015)');
insert into grado values(8, 'Grado en Ciencias Ambientales (Plan 2009)');
insert into grado values(9, 'Grado en Matemáticas (Plan 2010)');
insert into grado values(10, 'Grado en Química (Plan 2009)');

insert into asignatura values(1, 'Álgegra lineal y matemática discreta', 6, 'básica', 1, 1, 3, 4);
insert into asignatura values(2, 'Cálculo', 6, 'básica', 1, 1, 5, 4);
insert into asignatura values(3, 'Física para informática', 6, 'básica', 1, 1, 3, 4);
insert into asignatura values(4, 'Introducción a la programación', 6, 'básica', 1, 1, 8, 4);
insert into asignatura values(5, 'Organización y gestión de empresas', 6, 'básica', 1, 1, 10, 4);
insert into asignatura values(6, 'Estadística', 6, 'básica', 1, 2, 3, 4);
insert into asignatura values(7, 'Estructura y tecnología de computadores', 6, 'básica', 1, 2, 5, 4);
insert into asignatura values(8, 'Fundamentos de electrónica', 6, 'básica', 1, 2, 8, 4);
insert into asignatura values(9, 'Lógica y algorítmica', 6, 'básica', 1, 2, 3, 4);
insert into asignatura values(10, 'Metodología de la programación', 6, 'básica', 1, 2, 10, 4);

insert into curso_escolar values(1, 2014, 2015);
insert into curso_escolar values(2, 2015, 2016);
insert into curso_escolar values(3, 2016, 2017);
insert into curso_escolar values(4, 2017, 2018);
insert into curso_escolar values(5, 2018, 2019);

insert into alumno_se_matricula_asignatura values(1, 1, 1);
insert into alumno_se_matricula_asignatura values(1, 2, 1);
insert into alumno_se_matricula_asignatura values(2, 3, 1);
insert into alumno_se_matricula_asignatura values(3, 4, 2);
insert into alumno_se_matricula_asignatura values(4, 5, 2);
insert into alumno_se_matricula_asignatura values(5, 6, 2);
insert into alumno_se_matricula_asignatura values(6, 7, 3);
insert into alumno_se_matricula_asignatura values(7, 8, 3);
insert into alumno_se_matricula_asignatura values(8, 9, 4);
insert into alumno_se_matricula_asignatura values(9, 10, 4);
insert into alumno_se_matricula_asignatura values(10, 1, 4);

