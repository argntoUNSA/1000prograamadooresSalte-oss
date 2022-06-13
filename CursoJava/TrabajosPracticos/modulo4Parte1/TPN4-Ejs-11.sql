drop database if exists hoteldb;
create database hoteldb;
#defino las tablas basicas
use hoteldb;

create table usuario(
	id_usuario int,
    nombre_usuario varchar(50),
	contraseña_usuario varchar(50),
	email_usuario varchar(50),
    fecha_alta date,
    ultimo_acceso date,
    primary key(id_usuario)
);



create table hotel(
	id_hotel int not null,
    nombre_hotel varchar(50),
    descripcion_hotel varchar(200),
    categoria_hotel varchar(50),
    domicilio_hotel varchar(50),
    poblacion_hotel smallint,
    provincia_hotel varchar(50),
    codigopostal_hotel smallint,
    telefono_hotel bigint,
    primary key(id_hotel)
);

create table administradorHotel(
	id_administrador int,
    nombre_administradorHotel varchar(50),
    apelllido_administradorHotel varchar(50),
    hotel_asignado int not null,
    primary key(id_administrador),
    foreign key(hotel_asignado) references hotel(id_hotel)
    
);

create table tipoHabitacion(
	id_tipoHabitacion int,
    nombre_tipoHabitacion varchar(50),
    descripcion_tipoHabitacion varchar(200),
    capacidad_tipoHabitacion tinyint,
    precio_tipoHabitacion float,
    hotel_tipoHabitacion int not null,
    primary key(id_tipoHabitacion),
    foreign key(hotel_tipoHabitacion) references hotel(id_hotel)
);

create table cliente(
	id_cliente int,
	nombre_cliente varchar(50),
    apelllido_cliente varchar(50),
    nif_cliente int,
    domicilio_cliente varchar(100),
    provincia_cliente varchar(50),
    codigo_postal_cliente int,
    telefono_cliente bigint,
    foreign key(nif_cliente) references usuario(id_usuario),
	primary key(id_cliente)
);

#defino la tabla de reservas
create table reserva(
	id_reserva int,
    fechaInicio_reserva date,
    fechaFin_reserva date,
    precio_reserva float,
    tipohabitacion_reserva int,
    cliente_reserva int,
    foreign key(cliente_reserva) references cliente(id_cliente),
    foreign key(tipoHabitacion_reserva) references tipoHabitacion(id_tipoHabitacion),
    primary key(id_reserva)
);






