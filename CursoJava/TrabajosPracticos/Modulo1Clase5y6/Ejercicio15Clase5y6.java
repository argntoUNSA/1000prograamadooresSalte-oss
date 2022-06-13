package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio15Clase5y6 {

  public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   String usuario,contraseña;
   System.out.println("Usuario: ");
   usuario=scan.nextLine();
   System.out.println("Contraseña: ");
   contraseña=scan.nextLine();
   scan.close();
   loguear(usuario,contraseña);
  }
  public static void loguear(String usuario,String contraseña){
    String infoU,infoC,resultado;
    infoU="cris1234";
    infoC="xf3C#";
    if(usuario.compareTo(infoU)==0 && contraseña.compareTo(infoC)==0) resultado="logueo existoso";
    else resultado="error logueo";
    System.out.println(resultado);
  }
  
}
