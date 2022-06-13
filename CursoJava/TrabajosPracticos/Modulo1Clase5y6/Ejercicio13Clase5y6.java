package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio13Clase5y6 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double numero;
    short resultado;
    System.out.println("Inicio del programa");
    System.out.println("Se utiliza una funcion tal que dado un x real:");
    System.out.println("\t*Devuelve 1 si 1<x<100");
    System.out.println("\t*Devuelve 0 c.o.c.");
    System.out.print("Ingrese un numero: ");
    numero=scan.nextFloat();
    scan.close();
    resultado=funcion(numero);
    System.out.println("Resultado del metodo: "+resultado);
    System.out.print("Es decir: ");
    if(resultado!=1) System.out.print("no ");
    System.out.print("esta en el intervalo [1;100]");
    
  }
  public static short funcion(double numero){
    if(numero<=100 && numero>=1) return 1;
    else return 0;
  }
}
