package CursoJavaModulo1Clase5y6;
import java.util.Random;

/**
 * Generar 20 numeros aleatorios entre 1 y 100 de forma aleatoria y contar cuantos de esos 
 * numerosenteros son divisibles por 5.
 */
public class Ejercicio4
{
    public static void main(String[] args){
        Random generador=new Random();
        int[] enterosGenerados,indices;
        enterosGenerados=new int[20];
        indices=new int[20];
        int contador=0;
        
        
        //Se generaran y mostraran los numeros enteros.
        //Tambien se detectaran los que sean divisibles por 5, para poder contarlos y saber cuales son
        System.out.println("Los numeros generados entre 1 y 100 son:");
        for(int i=0;i<20;i++){
            enterosGenerados[i]=generador.nextInt(100)+1;
            if(enterosGenerados[i]%5==0){
                contador++;
                indices[contador-1]=i;
            }
            System.out.print("["+enterosGenerados[i]+"]");
        }
        System.out.println();
        
       //Se mostraran los numeros divisibles por 5 detectados anteriormente, si es que hay
        if(contador>0){
            System.out.println("De los numeros generados, "+contador+" son divisibles por 5:");
            for(int i=0;i<contador;i++){
              System.out.print("["+enterosGenerados[indices[i]]+"]");  
            }
             System.out.println();  
        }
        else 
            System.out.println("Ninguno de los numeros generados, es divisible por 5.");
    }
}
