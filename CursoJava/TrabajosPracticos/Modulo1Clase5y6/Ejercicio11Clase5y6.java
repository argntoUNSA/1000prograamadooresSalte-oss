package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio11Clase5y6 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    float numeroA,numeroB,resultado;
    System.out.println("Ingrese sus numeros reales.");
    System.out.println("Si es decimal utilice la coma(,):");
    System.out.print("A:");
    numeroA=scan.nextFloat();
    System.out.print("B:");
    numeroB=scan.nextFloat();
    scan.close(); resultado=multiplicaReales(numeroA,numeroB);
    System.out.println("Resultado:");
    System.out.print(numeroA+" x "+numeroB+"="+resultado);
    
    
    
    
    
  }
  
  
  public static float multiplicaReales(float a,float b){
    return a*b;
    
  }

}
