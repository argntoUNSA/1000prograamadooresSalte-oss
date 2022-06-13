package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 * Dado un natural K. Generar y mostrar todos los numeros enteros pares comprendidos en
 * el intervalos [-K,K]. Considerar K mayor que 1.
 */
public class Ejercicio13
{
   public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int j,k;
        int[] lista,aux;
        
        System.out.println("Inicio del programa");
        System.out.println("Ingrese 1 numero natural K que represente ambos extremos de un intervalo");
        
        //Define tamaño de la lista y a la lista tambien:
        
        //Ingresa k natural
        do
        {
            System.out.println("K > 1, tal que el intervalo sera [-K;K]");
            k=scan.nextInt();
        }while(k<=1);
        
        //Crea lista de k elementos
        aux=new int[k/2 + 1];
        j=0;
        //Llenamos la lista con pares
        for(int i=1;i<=k;i++)
        {
            if(i%2==0)
            {
                aux[j]=i;
                j++;
            }
        }
        
       
        //Informamaos los resulltados
        System.out.println("Cantidad de pares: "+(2*j));
        //Mostramos los negativos:
        System.out.print("[ ");
        for(int i=j-1;i>=0;i--)
            System.out.print("-"+aux[i]+" ");
        //Mostramos los positivos:  
        for(int i=0;i<=j-1;i++)
            System.out.print(aux[i]+" ");
        System.out.print("]");
        
        System.out.print("Fin del programa");
        scan.close();
    
    }
}
