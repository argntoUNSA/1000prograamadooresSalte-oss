package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio17Clase5y6 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    long numero;
    System.out.println("Inicio del programa");
    System.out.println("Dado un nro se determinara si es o no primo.");
    System.out.print("Ingrese su nro: ");
    numero=scan.nextLong();
    scan.close();
    System.out.print("Respueta: ");
    if(esPrimo(numero)) System.out.println("Es primo");
    else System.out.println("No es primo");
  }
  public static boolean esPrimo(long numero){
    long divisor;
    double raiz;
    divisor=2;
    raiz=Math.sqrt(numero);
    while(divisor<=raiz && numero%divisor!=0) divisor++;
    if(divisor<=raiz) return false;
    else return true;
  }

}
