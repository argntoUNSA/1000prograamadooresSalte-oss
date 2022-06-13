package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 * Dado un numero natural N. Determinar si este es primo
 */
public class Ejercicio15
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int n,divisor;
        double aux;
        //Ingreso del numero natural
        do
        {
            System.out.println("Ingrese numero natural N>1");
            n=scan.nextInt();
        }while(n<=0);
        
       /*Conoceremos los divisores del numero ingresado y determinaremos si es o no primo
         * Segun la definicion de un numero primo:
         * Sea un numero natural n no tendra divisores excepto al 1 y al n
         * Tambien sabemos que un numero natural solo tendra divisores, si es que tiene al menos un divisor
         * menores a su raiz
        */
       //Calculamos su raiz y definimos el ciclo para asegurarnos de que no tenga divisores
        aux=Math.sqrt(n);
        divisor=2;
        while(divisor<=aux && n%divisor!=0)
            divisor++;
            
        
       
        
        //Informamos los resultados
        
        if(divisor<=aux)
            System.out.println("No es primo, primer divisor encontrado: "+divisor);
        else
            System.out.println("Es primo");
            
        
        
    }
}
