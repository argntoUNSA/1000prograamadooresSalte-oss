use universidad;


select * from persona
	where sexo='M';

select * from persona
	where tipo="profesor";

select * from persona
	where (tipo="profesor" and sexo='H');

select nombre from persona 
	where tipo="alumno" and sexo='H'
    order by apellido1;

select nombre from persona
	where (tipo="alumno" and nombre like 'j%');

select telefono from persona
	where (nombre='Juan' and apellido1 ='Saez');

select id_persona, apellido1, nombre from persona
	where (tipo = 'alumno')
    group by nombre;

select id_persona, nombre, apellido1 from persona
	order by id_persona;