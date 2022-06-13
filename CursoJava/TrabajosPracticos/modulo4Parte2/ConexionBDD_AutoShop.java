package modulo4Parte1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBDD_AutoShop {

	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/auto_shop";
	static final String USER="root";
	static final String PASS="Ssap4toor0t0!";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			String sql;
			
			
//			sql="create table Departaments(\r\n"
//					+"Id int not null auto_increment\r\n,"
//					+"Name varchar(50)\r\n,"
//					+ "primary key(Id)\r\n"
//					+ ");";
//			stmt.executeUpdate(sql);
//			System.out.println("Table Departaments Created");
//			
//			sql="insert into Departaments\r\n"
//					+ "values\r\n"
//					+ "		(1,'MR'),\r\n"
//					+ "		(2,'Sales'),\r\n"
//					+ "		(3,'Tech')\r\n"
//					+ ";";	
//			stmt.executeUpdate(sql);
//			System.out.println("Values Inserted sucessfull");
			
//			sql="create table Employees(\r\n"
//					+"Id int not null auto_increment,\r\n"
//					+"FName varchar(35) not null,\r\n"
//					+"LName varchar(35) not null,\r\n"
//					+"PhoneNumber varchar(12),\r\n"
//					+"ManagerId int,\r\n"
//					+"DepartamentId int not null,\r\n"
//					+"Salary int not null,\r\n"
//					+"HairDate Date not null,\r\n"
//					+"primary key(Id),\r\n"
//					+"foreign key(ManagerId) references Employees(Id),\r\n"
//					+"foreign key(DepartamentId) references Departaments(Id)\r\n"
//					+ ");";
//			stmt.executeUpdate(sql);
//			System.out.println("Table Employees Created");
//			
//			sql="insert into Employees\r\n"
//					+ "values\r\n"
//					+ "		(1,'James','Smith','1234567890',NULL,1,1000,'2002-01-01'),\r\n"
//					+ "		(2,'John','Johnson','2468101214',1,1,400,'2005-03-23'),\r\n"
//					+ "		(3,'Michael','Williams','1357911131',1,2,600,'2009-12-05'),\r\n"
//					+ "		(4,'Jonnathan','Smith','1234567890',2,1,500,'2016-07-12')\r\n"
//					+ ";";
//			stmt.executeUpdate(sql);
//			System.out.println("Values Inserted sucessfull");
//			
//			sql="create table Customers(\r\n"
//					+"Id int not null auto_increment,\r\n"
//					+"FName varchar(35) not null,\r\n"
//					+"LName varchar(35) not null,\r\n"
//					+"Email varchar(100) not null,\r\n"
//					+"PhoneNumber varchar(12),\r\n"
//					+"PreferredContact varchar(5) not null,\r\n"
//					+"primary key(Id)\r\n"
//					+ ");";
//			stmt.executeUpdate(sql);
//			System.out.println("Table Customers Created");
//			
//			sql="insert into Customers\r\n"
//					+ "values\r\n"
//					+ "		(1,'William','Jones','william.jones@example.com',3347927472,'PHONE'),\r\n"
//					+ "		(2,'David','Miller','dmiller@example.net','2137921892','EMAIL'),\r\n"
//					+ "		(3,'Richard','Davis','richard0123@example.com',NULL,'EMAIL')\r\n"
//					+ ";";
//			stmt.executeUpdate(sql);
//			System.out.println("Values Inserted sucessfull");
//			
//			sql="create table Cars(\r\n"
//					+"Id int not null auto_increment,\r\n"
//					+"CustomerId int not null,\r\n"
//					+"EmployeeId int not null,\r\n"
//					+"Model varchar(50) not null,\r\n"
//					+"Status varchar(12),\r\n"
//					+"TotalCost int not null,\r\n"
//					+"primary key(Id),\r\n"
//					+"foreign key(CustomerId) references Customers(Id),\r\n"
//					+"foreign key(EmployeeId) references Employees(Id)\r\n"
//					+ ");";
//			stmt.executeUpdate(sql);
//			System.out.println("Table Cars Created");
//			
//			sql="insert into Cars\r\n"
//					+ "values\r\n"
//					+ "		(1,1,2,'Ford F 150','READY',230),\r\n"
//					+ "		(2,1,2,'Ford F 150','READY',200),\r\n"
//					+ "		(3,2,1,'Ford Mustang','WAITING',100),\r\n"
//					+ "		(4,3,3,'Toyota Prius','WORKING',1254)\r\n"
//					+ ";";
//			stmt.executeUpdate(sql);
//			System.out.println("Values Inserted sucessfull");
//			
			ResultSet rs;
			sql="select * from Departaments";
			rs=stmt.executeQuery(sql);
			System.out.println("Departaments:");
			while(rs.next()) {
				System.out.println(
						"\t"+rs.getInt("Id")
						+ "\t"+rs.getString("Name"));
			}
			System.out.println();
			sql="select * from Employees";
			rs=stmt.executeQuery(sql);
			System.out.println("Employees: ");
			while(rs.next()) {
				System.out.println(
						"\t"+rs.getString("FName")
						+ "\t"+rs.getString("LName")
						+ "\t"+rs.getString("PhoneNumber")
						+"\t"+rs.getInt("Salary")
						+"\t"+rs.getDate("HairDate"));
			}
			System.out.println();
			sql="select * from Customers";
			rs=stmt.executeQuery(sql);
			System.out.println("Customers: ");
			while(rs.next()) {
				System.out.println(
						"\t"+rs.getString("FName")
						+ "\t"+rs.getString("LName")
						+ "\t"+rs.getString("Email")
						+ "\t"+rs.getString("PhoneNumber"));
			}
			System.out.println();
			sql="select * from Cars";
			rs=stmt.executeQuery(sql);
			System.out.println("Cars: ");
			while(rs.next()) {
				System.out.println(
						"\t"+rs.getString("Model")
						+ "\t"+rs.getString("Status")
						+ "\t"+rs.getInt("TotalCost"));
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		}
		
	}

}
