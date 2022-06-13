package CursoJavaModulo1Clase3y4;


/**
 * Calcular la cantidad de minutos que existen en una cantidad de segundos ingresada
 * por el usuario.
 */
import java.util.Scanner;

public class Ejercicio8
{
   
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int segundos;
        System.out.println("Ingrese una cantidad en enteros de segundos");
        segundos=scan.nextInt();
        System.out.println("la cantidad ingresada fue:"+segundos);
        System.out.println("Es equivalente a "+(segundos/60)+" minuto/s");
        
        
    }
}
