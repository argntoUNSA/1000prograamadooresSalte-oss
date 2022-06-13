package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio7 {

  public static void main(String[] args) {
    System.out.println("Inicio del programa");
    
    
    Scanner scan=new Scanner(System.in);
    String cadenaIngresada;
    int cantidadVocales,tamañoCadena,caracter;
    
    System.out.println("Ingrese su palabra: ");
    cadenaIngresada=scan.nextLine();
    tamañoCadena=cadenaIngresada.length();
    if(tamañoCadena>0){
      cantidadVocales=0;
      cadenaIngresada=cadenaIngresada.toUpperCase();
      for(int i=0;i<tamañoCadena;i++){
        caracter=cadenaIngresada.charAt(i);
        if(caracter==65 || caracter==69 || caracter==73 || caracter==79 || caracter==85) cantidadVocales++;
      }
      if(cantidadVocales>0) System.out.println("Tiene:"+cantidadVocales+" Vocales");
      else System.out.println("No tiene Vocales");
      if(cantidadVocales<tamañoCadena)
        System.out.println("Tiene:"+(tamañoCadena-cantidadVocales)+" Consonantes");
      else System.out.println("No tiene Consonantes");
      
    }
    else System.out.println("No se ingreso una palabra");
    
     
    
    
    
    
    scan.close();
    
    
    System.out.println("Fin del programa");

  }

}
