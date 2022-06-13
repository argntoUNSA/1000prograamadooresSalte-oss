create database hoteldb;

create table tipoHabitacion(
	id_tipoHabitacion varchar(50),
    nombre_tipoHabitacion varchar(50),
    descripcion_tipoHabitacion varchar(200),
    capacidad_tipoHabitacion tinyint,
    precio_tipoHabitacion float,
    hotel_tipoHabitacion varchar(50),
    primary key(id_tipoHabitacion),
    foraign key(hotel_tipoHabitacion)
);
create table hotel(
	id_hotel varchar(50),
    nombre_hotel varchar(50),
    descripcion_hotel varchar(200),
    categoria_hotel varchar(50),
    domicilio_hotel varchar(50),
    poblacion_hotel smallint,
    provincia_hotel varchar(50),
    codigopostal_hotel smallint,
    telefono_hotel bigint,
    administrador_hotel varchar(50),
    habitaciones_hotel 
);
create table usuario(
	id_usuario int,
    nombre_usuario varchar(50),
	contraseña_usuario varchar(50),
	email_usuario varchar(50),
    fecha_alta date,
    ultimo_acceso date,
    primary key(id_usuario)
);

create table cliente(
	nombre_cliente varchar(50),
    apelllido_cliente varchar(50),
    nif_cliente int,
    domicilio_cliente varchar(100),
    poblacion_cliente varchar(20),
    provincia_cliente varchar(50),
    codigo_postal_cliente int,
    telefono_cliente bigint,
    foreign key(nif_cliente) references usuario(id_usuario),
	primary key(nif_cliente)
);

create table administradorHotel(
	nombre_administradorHotel varchar(50),
    apelllido_administradorHotel varchar(50),
    hoteles_administradorHotel hotel[]
);