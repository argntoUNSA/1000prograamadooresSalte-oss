drop database if exists ProcesoVenta;

create database ProcesoVenta;
use ProcesoVenta;

create table Producto(
	id int,
    nombre varchar(50),
    descripcion varchar(150),
    precioUnitario float,
    observacion varchar(200),
    primary key(id)
);

create table Cliente(
	id int,
    nombre varchar(50),
    direccion varchar(150),
    telefono long,
    observacion varchar(200),
    primary key(id)
);

create table Venta(
	id int,
    fecha Date,
    observacion varchar(200),
    cliente int,
    primary key(id),
    foreign key(cliente) references Cliente(id)
);

create table Detalle(
	venta int,
    producto int,
	cantidad int,
    precioUnitario float,   
    foreign key(producto) references Producto(id),
    foreign key(venta) references Venta(id)

);