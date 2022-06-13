package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 * Dado 3 numeros naturales que representan los lados de un triángulo, se pide determinar
 * si el triángulo es Isosceles, Escaleno o Equilatero.
 * 
 * Info
 * Tipos de triángulo según la longitud de sus lados Según la longitud de sus lados, los
 * triángulos pueden clasi�carse en:
 * 1. Equilátero: Todos sus lados son iguales.
 * 2. Isósceles: Dos de sus tres lados son de igual longitud.
 * 3. Escaleno: Todos sus lados son de diferente longitud.
   */
public class Ejercicio11
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int lado1,lado2,lado3;
        
        
        System.out.println("Inicio del programa");
        System.out.println("Ingrese 3 numeros que representen los lados de un triaugulo");
        System.out.println("Se determinara de que tipo es el triaugulo");
        
        
        System.out.println("Ingrese las medidas de los lados");
        System.out.println("Ingrese el primer lado");
        lado1=scan.nextInt();
        System.out.println("Ingrese el segundo lado");
        lado2=scan.nextInt();
        System.out.println("Ingrese el tercer lado");
        lado3=scan.nextInt();
        
        
        System.out.print("Tipo de triangulo ingresado: ");
        if(lado1==lado2 && lado1==lado3) 
            System.out.println("Equilatero");
        else
        { 
            if(lado1==lado2) 
                System.out.println("Isoceles");
            else
                if(lado1==lado3)
                    System.out.println("Isoceles");
                else
                    if(lado2==lado3)
                        System.out.println("Isoceles");
                    else
                        System.out.println("Escaleno");
        }
        
        
        System.out.println("Fin del programa");
        scan.close();
    }
}
