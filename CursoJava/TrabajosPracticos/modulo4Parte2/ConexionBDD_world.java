package modulo4Parte1;

//Iportar paquetes requeridos
import java.sql.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ConexionBDD_world {
	//Paso 1: Regisrrar JDBC Driver JDBC
	//Nombre del driver y la URL de la BDD 
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://127.0.0.1:3306/world";
	//Paso 2) Credenciales de la BDD
	static final String USER="root";
	static final String PASS="Ssap4toor0t0!";
		
	public static void listarPaises(Connection conn) throws SQLException{
		Statement stmt=null;
		ResultSet rs=null;
		String sql;
//		¿Cuáles son los países que existen en la BDD ?
	 	System.out.println("Listado de paises registrados:");
	 	sql="select Name"
	 			+ "	from country"
	 			+ ";";
	 	stmt=conn.createStatement();
	 	rs=stmt.executeQuery(sql);
	 	while(rs.next()) {
	 		System.out.println(rs.getString("Name"));
	 	}
	 	System.out.println();
	 	
	}
	public static void contarPaises(Connection conn) throws SQLException{
		Statement stmt=null;
		ResultSet rs=null;
		String sql;
		int cant;
		
		sql="select count(Name)"
	 			+ "	from country"
	 			+ ";";
		stmt=conn.createStatement();
	 	rs=stmt.executeQuery(sql);
	 	rs.next();
	 	cant=rs.getInt("count(Name)");
	 	System.out.println("En total son "+cant+" paises");
		
	}
	public static void mostrarHabitantes(Connection conn) throws SQLException{
		Statement stmt=null;
		ResultSet rs=null;
		String sql;
		System.out.println("Listado de paises y cantidad de habitantes:");
		sql="select Name, Population"
 			+ "	from country"
 			+ ";";
		stmt=conn.createStatement();
	 	rs=stmt.executeQuery(sql);
	 	while(rs.next()) {
	 		System.out.println(
	 				rs.getString("Name")
	 				+"\t"+rs.getInt("population"));
	 	}
	 	
	 	System.out.println();
	}
	public static void paisMasHabitado(Connection conn) throws SQLException{
		Statement stmt1=conn.createStatement(),stmt2=conn.createStatement();
		ResultSet rs1,rs2;
		String sql1,sql2;
		
		sql1="select max(Population) Population"
				+"	from Country"
				+ ";";
		stmt1=conn.createStatement();
		rs1=stmt1.executeQuery(sql1);
		rs1.next();
		
		
		sql2="select Population, Name"
 			+ "	from  Country"
 			+ "		where Population="+rs1.getInt("Population")
 			+ "	group by Population "
 			+ ";";
		stmt2=conn.createStatement();
		rs2=stmt2.executeQuery(sql2);
		System.out.println("Pais/es con mas habitantes: ");
		while(rs2.next()) {
			System.out.println(
					"	"+rs2.getInt("Population")
					+"	"+rs2.getString("Name")
					);
		}
	}
	public static void paisConMasProvincias(Connection conn1,Connection conn2) throws SQLException{
		Statement 
			stmt1=conn1.createStatement(),
			stmt2=conn2.createStatement();
		ResultSet 
			rs1,
			rs2;
		String
			sql1,
			sql2,
			codigoReferencia,
			codigoResultado;
		int
			mayor,
			aux;
		sql1="select Code"
				+"	from Country"
				+ ";";		
		rs1=stmt1.executeQuery(sql1);
		mayor=0;
		codigoResultado="";
		while(rs1.next()) {
			codigoReferencia=rs1.getString("Code");
			sql2="select count(CountryCode) contador"
 			+ "	from  City"
 			+ "		where CountryCode='"+codigoReferencia+"'"
 			+ ";";
			
//			stmt2=conn.createStatement();
			rs2=stmt2.executeQuery(sql2);
			rs2.next();
			aux=rs2.getInt("contador");
			if(aux>mayor) {
				mayor=aux;
				codigoResultado=codigoReferencia;
			}
		}
		sql1="select * "
				+ "	from Country"
				+ "	where Code='"+codigoResultado+"'";
		rs1=stmt1.executeQuery(sql1);
		rs1.next();
		System.out.println(
				rs1.getString("Name")
				+"\t tiene "+mayor+" provincias: ");
	}
	public static void mostrarDescendentementePorHabitante(Connection conn) throws SQLException{
//		Statement stmt=conn.createStatement();
//		ResultSet rs;
//		String sql;
//		sql="select Name, Population"
// 			+ "	from Country apodo"
// 			+ "	order by Population DESC"
// 			+ ";";
//		stmt=conn.createStatement();
//		rs=stmt.executeQuery(sql);
//		System.out.println("Lista de paises, ordenada por cantidad de habitantes");
//		while(rs.next()) {
//			System.out.println(
//				 "	"+rs.getString("Name")
//				+"	"+rs.getInt("Population"));
//		}
	}
	public static void proviciaMasHabitada(Connection conn) throws SQLException{
		Statement 
			stmt=conn.createStatement();
		ResultSet 
			rs;
		String
			sql,
			codigoReferencia,
			codigoResultado;
		sql="select Id, Name, Population "
				+ "	from City"
				+ "	order by Population DESC"
				+ ";";
		rs=stmt.executeQuery(sql);
		rs.next();
		System.out.println(
				"La provincia con mas habitantes es: "+rs.getString("Name")
				+"Con "+rs.getInt("Population")+" habitatntes");
		
		

	}
	public static void totaldeHabitantes(Connection conn) throws SQLException{
		Statement 
			stmt;
		ResultSet 
			rs;
		String
			sql;
		sql="select sum(Population) total"
				+ "	from Country"
				+ ";";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		rs.next();
		System.out.println("La cantidad total de habitantes del mundo es: "+rs.getLong("total"));
	}
	public static void listarLenguajes(Connection conn) throws SQLException{
		Statement 
			stmt;
		ResultSet 
			rs;
		String
			sql;
		sql="select Language, count(Language) contador "
				+ "from CountryLanguage "
				+ "group by Language "
				+ "having contador=1"  
				+ ";";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
	 	System.out.println("Listado de lenguajes del mundo:");
		while(rs.next()) {
			System.out.println("\t"+rs.getString("Language"));
		}
	}
	
	public static void contarLenguajes(Connection conn) throws SQLException{
		Statement 
			stmt;
		ResultSet 
			rs;
		String
			sql;
		sql="select count(Language) contador1 "
				+ "	from (select Language, count(Language) contador2 "
				+ "			from CountryLanguage "
				+ "			group by Language "
				+ "			having contador2=1) tabla"  
				+ ";";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		rs.next();
	 	System.out.println("Cantidad de lenguajes del mundo:");
		System.out.println("\t"+rs.getInt("contador1"));
		
	}
	
	public static void listarPorcentajes(Connection conn) throws SQLException{
		Statement 
			stmt;
		ResultSet 
			rs;
		String
			sql;
		sql="select Language, count(Language) contador "
				+ "from CountryLanguage "
				+ "group by Language "
				+ "having contador=1"  
				+ ";";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
	 	System.out.println("Listado de lenguajes del mundo:");
		while(rs.next()) {
			System.out.println("\t"+rs.getString("Language"));
		}
	}
	public static void porcentajeMundialLenguajes(Connection conn) throws SQLException{
		Statement 
			stmt,
			stmtAux;
		ResultSet 
			rs,
			rsAux;
		String
			sql,
			language;
		double
			percentage,
			percentageAux,
			acum;
		Long
			populationTotal;
		HashMap<String,Double>
			mapa;
		
		sql="select Code, Population "
				+ "from Country "
				+ ";";
	
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		System.out.println("Porcentajes de lenguajes del mundo:");
		
		mapa=new HashMap<String,Double>();
		sql="select sum(Population) poblaciontotal "
				+ "from Country";
		stmtAux=conn.createStatement();
		rsAux=stmtAux.executeQuery(sql);
		rsAux.next();
		populationTotal=rsAux.getLong("poblaciontotal");
		while(rs.next()) {
			percentageAux=rs.getLong("Population")*100/populationTotal;
			sql="select Percentage, Language"
				+ "	from CountryLanguage "
				+ "	where CountryCode='"+rs.getString("Code")+"'"
				+ ";";
			stmtAux=conn.createStatement();
			rsAux=stmtAux.executeQuery(sql);
			
			
			while(rsAux.next()) {
				language=rsAux.getString("Language");
				
				percentage=rsAux.getDouble("Percentage")*percentageAux/100;
				
				if(mapa.containsKey(language)) {
					percentage+=mapa.get(language);
					mapa.replace(language, percentage);
				}
				else {
					
					mapa.put(language, percentage);
				}
			}
			
		}
		
		System.out.println("Mapa:");
		DecimalFormat formato=new DecimalFormat("#.0000");
		
		
//		sql="select sum(Population) poblaciontotal "
//				+ "	from Country";
//		stmt=conn.createStatement();
//		rs=stmt.executeQuery(sql);
//		rs.next();
//		population=rs.getLong("poblaciontotal");
		acum=0;
		for (String languageAux : mapa.keySet()) {
//			percentage=(mapa.get(languageAux)*100)/population;
//			mapa.replace(languageAux, percentage);
	        System.out.println(languageAux+"		:	"+formato.format(mapa.get(languageAux))+" %");
	        acum+=mapa.get(languageAux);
		}
		System.out.println("Acum: "+acum);
	}
	
	
	public static void punto1() {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		
		try {
//			1.
//			Crear una instancia del JDBC Driver.
//			2.
//			Especificar la url y credenciales de la BDD.
//			3.
//			Establecer una conexión usando el driver que crea el objeto Connection.
//			4.
//			Crear un objeto Statement, usando Connection.
//			5.
//			Armar el postulado SQL y enviarlo a ejecución usando el Statement.
//			6.
//			Recibir los resultados en el objeto ResultSet.
			
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			String sql;
			ResultSet rs;
			sql="select Name, Code, Population from Country";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				int population=rs.getInt("Population");
				String name=rs.getString("Name");
				String countryCode=rs.getString("code");
				System.out.println("Pais: "+name);
				System.out.println("Codigo Pais: "+countryCode);
				System.out.println("Poblacion: "+population);
				System.out.println();
			}
			rs.close();
			stmt.close();
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
				if(stmt!=null) {
					stmt.close();
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
	public static void main(String[] args) {
//		punto1();
		
		Connection conn=null,connAux=null;
		Statement stmt=null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			connAux=DriverManager.getConnection(DB_URL,USER,PASS);
			String sql;
			ResultSet rs;
			
		//¿Cuáles son los países que existen en la BDD ?
//			listarPaises(conn);
			
		//¿Cuántos son los países que existen en la BDD ?
//			contarPaises(conn);
			 	
		//¿Cuántos son los habitantes de cada país ?
//			mostrarHabitantes(conn);
			
		//¿Cuál es el país que tiene más habitantes ?
//			paisMasHabitado(conn);
			
		//¿Cuál es el país que tiene más provincias ?
//			paisConMasProvincias(conn,connAux);
	
					
		//¿Cuál es la provincia con más habitantes ?
//			proviciaMasHabitada(conn);
			
		//¿Cuál es el número total de habitantes en el mundo según los registros de nuestra BDD ?
//			totaldeHabitantes(conn);
		
		//¿Cuáles son los lenguajes que existen en el mundo ?
//			listarLenguajes(conn);

		//¿Cuántos lenguajes hay en el mundo ?
//			contarLenguajes(conn);
			
		//¿Cuál es el porcentaje de personas que hablan cada lenguaje ?
			porcentajeMundialLenguajes(conn);
	 	}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
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
