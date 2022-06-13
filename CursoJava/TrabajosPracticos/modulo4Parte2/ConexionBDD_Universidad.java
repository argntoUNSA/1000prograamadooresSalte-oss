package modulo4Parte1;

import java.sql.*;

public class ConexionBDD_Universidad {
	
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/universidad";
	static final String USER="root";
	static final String PASS="Ssap4toor0t0!";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement  stmt1,stmt2;
		stmt1=null;
		stmt2=null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt1=conn.createStatement();
			String sql;
			ResultSet rs;
			
			
			/*
//Ejercicio 4
//Utilizando la BDD universidad creada en el práctico anterior agregar 3 alumnos y 1 docente
//en los registros de la tabla persona
			sql="insert into persona\r\n"
					+ "values\r\n"
					+ "		(11, '38223286T', 'David', 'Schmidt', 'Fisher', 'Almería', 'C/ Venus', '678516294', '1978/01/19', 'H', 'alumno'),\r\n"
					+ "		(12, '26902806M', 'Salvador', 'Sánchez', 'Pérez', 'Almería', 'C/ Real del barrio alto', '950254837', '1991/03/28', 'H', 'alumno'),\r\n"
					+ "		(13, '11105554G', 'Zoe', 'Ramirez', 'Gea', 'Almería', 'C/ Marte', '618223876', '1979/08/19', 'M', 'alumno'),\r\n"
					+ "		(14, '97258166K', 'Irina', 'Strosin', 'Turcotte', 'Almería', 'C/ Neptuno', NULL, '1999/05/24', 'M', 'profesor')"
					+";";
			stmt1.executeUpdate(sql);
			
			sql="select * from persona";
			rs=stmt1.executeQuery(sql);
			while(rs.next()) {
				System.out.println(
						"\t"+rs.getInt("id_persona")
						+"\t"+rs.getString("nombre"));
			}
			*/
			
			/*
			Ejercicio 5
			Utilizando de la BDD universidad eliminar los siguientes registros dentro de la Tabla
			asignatura
			Álgebra lineal y matemática discreta
			Cálculo
			Estadística
 
			sql="select id_asignatura, nombre from asignatura;";
			String nombre;
			int id;
			rs=stmt1.executeQuery(sql);
			while(rs.next()) {
				stmt2=conn.createStatement();
				nombre=rs.getString("nombre");
				id=rs.getInt("id_asignatura");
				System.out.println(nombre+":"+id);
				
//				Eliminar las asignaturas, pero teniendo en cuenta las claves foraneas que relacionan las tablas
				if (nombre.compareTo("Álgegra lineal y matemática discreta")==0 || nombre.compareTo("Cálculo")==0 || nombre.compareTo("Estadística")==0) {
					sql="delete from alumno_se_matricula_asignatura\r\n"
					+ "	where\r\n"
					+ "		id_asignatura="+id+"\r\n"
					+ ";";
					stmt2.executeUpdate(sql);
					
					sql="delete from asignatura\r\n"
							+ "	where\r\n"
							+ "		id_asignatura="+id+"\r\n"
							+ ";";
					stmt2.executeUpdate(sql);
					System.out.println(nombre+" eliminada");
				}
				stmt2.close();
			}
			*/
			/*
			 * Ejercicio 7
			 * Utilizando la base de Datos universidad creada en el practico anterior Realizar las
			 * siguientes Consultas desde un programa en JAVA para obtener de la BDD los siguientes
			 * datos:
			 */
//			a. Todas las personas que tengan como valor 'M' en su atributo sexo.
			sql="select apellido1, apellido2, nombre, ciudad, tipo"
					+ "	from persona "
					+ "		where sexo='M'"
					+ ";";
			rs=stmt1.executeQuery(sql);
			System.out.println("Mujeres Registradas:");
			while(rs.next()){
				System.out.println(
						rs.getString("apellido1")
						+"\t"+rs.getString("apellido2")
						+"\t"+rs.getString("nombre")
						+"\t"+rs.getString("ciudad")
						+"\t"+rs.getString("tipo"));
			}
			System.out.println();
			
//			b. Todas las personas que tengan como valor 'profesor' en su atributo tipo
			sql="select apellido1, apellido2, nombre, ciudad, tipo"
					+ "	from persona"
					+ "		where tipo='profesor'"
					+ ";";
			rs=stmt1.executeQuery(sql);
			System.out.println("Profesores registrados:");
			while(rs.next()){
				System.out.println(
						rs.getString("apellido1")
						+"\t"+rs.getString("apellido2")
						+"\t"+rs.getString("nombre")
						+"\t"+rs.getString("ciudad")
						+"\t"+rs.getString("tipo"));
			}
			System.out.println();
			
//			c. ¿Existe algún profesor hombre en la universidad ?
			sql="select apellido1, apellido2, nombre, ciudad, tipo"
					+ "	from persona \n"
					+"		where tipo='profesor' and sexo='H'"
					+ ";";
			rs=stmt1.executeQuery(sql);
			System.out.println("Profesores hombres registrados:");
			while(rs.next()){
				System.out.println(
						rs.getString("apellido1")
						+"\t"+rs.getString("apellido2")
						+"\t"+rs.getString("nombre")
						+"\t"+rs.getString("ciudad")
						+"\t"+rs.getString("tipo"));
			}
			System.out.println();
			
//			d. ¿Cuántos son los alumnos Hombres en la universidad ?
			sql="select apellido1, apellido2, nombre, ciudad, tipo"
					+ " from persona"
				    +"		where"
				    +"			tipo='alumno' and sexo='H'"
				    + ";";
			rs=stmt1.executeQuery(sql);
			System.out.println("Alumnos hombres registrados:");
			while(rs.next()){
				  System.out.println(
							rs.getString("apellido1")
							+"\t"+rs.getString("apellido2")
							+"\t"+rs.getString("nombre")
							+"\t"+rs.getString("ciudad")
							+"\t"+rs.getString("tipo"));
			}
			System.out.println();
			
//			e. Nombre de alumno/s que empieza con la letra 'J'
			sql="select nombre, apellido1, apellido2, tipo"
					+"	from persona"
					+"		where tipo='alumno' and nombre like 'J%'"
					+ "group by nombre"
					+ ";";
			rs=stmt1.executeQuery(sql);
			System.out.println("Alumnos con nombres que empiezan por J:");
			while(rs.next()){
				  System.out.println(
							rs.getString("nombre")
							+"\t"+rs.getString("apellido2")
							+"\t"+rs.getString("apellido1"));
			}
			System.out.println();
			
//			f) Cual es el numero de telefono de el registro de la tabla persona cuyo 
//			atributo nombre es 'Juan' y su atributo apellido1 es 'Saez'
			sql="select telefono, nombre, apellido1"
					+ "	from persona"
					+"		where nombre='Juan' and apellido1='Saez'"
					+ ";";
			rs=stmt1.executeQuery(sql);
			rs.next();
			System.out.print("Telefono de Juan Saez:\t"+rs.getString("telefono"));
			System.out.println();
			
			if(rs!=null) {
				rs.close();
			}
			if(rs!=null) {
				rs.close();
			}
			stmt1.close();
			conn.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt1!=null) {
					stmt1.close();
				}
				if(stmt2!=null) {
					stmt2.close();
				}
			}
			catch(SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException se3) {
				se3.printStackTrace();
			}
			
		}
		System.out.println("Goodbye");
	} 

}
