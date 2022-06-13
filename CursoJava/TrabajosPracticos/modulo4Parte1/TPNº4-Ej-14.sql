use universidad;

select nombre, apellido1 from persona inner join profesor on persona.id_persona = profesor.id_profesor;

select nombre from departamento inner join profesor on departamento.id_departamento = profesor.id_departamento;

select nombre from asignatura inner join profesor on asignatura.id_profesor = profesor.id_profesor;

select * from asignatura;