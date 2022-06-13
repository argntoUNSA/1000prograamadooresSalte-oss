package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 * Declare dos variables base y altura,que representan la base y la altura de un triangulo.
 * Asigne un valor cualquiera a cada una y muestre la superficie del mismo..
   */
public class Ejercicio10
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        double base,altura;
        
        
        System.out.println("Inicio del programa");
        System.out.println("Ingrese 2 numeros que representen la base y altura de un triaugulo recto");
        System.out.println("Si ingresa un numero con dedcimales debe usar la coma");
        
        System.out.print("Ingrese base: ");
        base=scan.nextDouble();
        System.out.println();
        System.out.print("Ingrese altura: ");
        altura=scan.nextDouble();
        System.out.println();
        
        
        System.out.println("Base: "+base+" cm.");
        System.out.println("Altura: "+altura+" cm.");
        System.out.println("Area: "+(base*altura)+" cm2.");
        
        
        System.out.println("Fin del programa");
        scan.close();
    }
}
