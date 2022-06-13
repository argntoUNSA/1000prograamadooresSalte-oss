package CursoJavaModulo1;
import java.util.Scanner;
/**
 * Realizar un programa que calcule el resultado de una expresion algebraica, use distintos operadores. Realizar al menos 3 expresiones algebraicas.
*/


public class Ejercicio13 {

  public static void main(String[] args) {
    
    //Se declaran las variables necesarias
    Scanner sc=new Scanner(System.in);
    int A,B,C,D;
    double resultado;
    
    
    //ingrese 3 nros enteros y se calcularan distintas operaciones
    System.out.println("Ingrese su primer nro Entero");
    A=sc.nextInt();
    System.out.println("Ingrese su segundo nro Entero");
    B=sc.nextInt();
    System.out.println("Ingrese su tercer nro Entero");
    C=sc.nextInt();
    System.out.println("Ingrese su ultimo nro Entero");
    D=sc.nextInt();
    
    //Una vez ingresados los numeros se podran hacer los diferentes calculos
    System.out.println("Se realizara la sgte operacion algebraica: ");
    System.out.println("A+B*(C+D)");
    resultado=A+B*(C+D);
    System.out.println("Resultado: "+resultado);
    
    System.out.println("Se realizara la sgte operacion algebraica: ");
    resultado=A+(B*C)+D;
    System.out.println("A+(B*C)+D");
    System.out.println("Resultado: "+resultado);
    
    System.out.println("Se realizara la sgte operacion algebraica: ");
    resultado=(A+B)*C+D;
    System.out.println("(A+B)*C+D");
    System.out.println("Resultado: "+resultado);
    System.out.println("(A+B)*C+D");
   
    
  }

}
