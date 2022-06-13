package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio14Clase5y6 {

  public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
    double numero;
    String resultado;
    System.out.println("Inicio del programa");
    System.out.println("Se utiliza una funcion tal que dado un x real:");
    System.out.println("\t*Devuelve Positivo si x>0");
    System.out.println("\t*Devuelve Negativo si x<0");
    System.out.println("\t*Devuelve Cero si x=0");
    System.out.print("Ingrese un numero: ");
    numero=scan.nextFloat();
    scan.close();
    resultado=funcion(numero);
    System.out.println("Resultado del metodo: "+resultado);
    
  }
  public static String funcion(double numero){
    String resultado="";
    if(numero==0) resultado+="Cero";
    else if(numero<0) resultado+="Negativo";
    else resultado+="Positivo";
    return resultado;
  }
}
