package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 * Dado un numero natural N se desea conocer sus divisores y la suma de todos ellos. No
 * considerar el 1 ni el nro en si mismo.
 */
public class Ejercicio14
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int n,divisor,cantDivisores,sumaDivisores;
        double aux;
        int[] listaDivisores;
        //Ingreso del numero natural
        do
        {
            System.out.println("Ingrese numero natural N>1");
            n=scan.nextInt();
        }while(n<=0);
        
        //Conoceremos los divisores del numero ingresado
        //Segun el Teorema de la division entera:
        //Sea un numero natural n tendra divisores p_i, tal que p_i<sqrt(n)
        //aux=Math.sqrt(n);
        listaDivisores=new int[n];
        cantDivisores=sumaDivisores=0;
        for(divisor=2;divisor<n;divisor++)
        {
            if(n%divisor==0)    
            {
                 
                 sumaDivisores+=divisor;
                 listaDivisores[cantDivisores]=divisor;
                 cantDivisores++;
            }
            
        }
        
        //Informamos los resultados
        
        if(cantDivisores>0)
        {
            System.out.println("Cantidad de divisores: "+cantDivisores);
            System.out.println("Suma de divisores: "+sumaDivisores);
            System.out.print("Lista de divisores: [ ");
            for(int i=0;i<cantDivisores;i++)
                System.out.print(listaDivisores[i]+" ");
            System.out.println("]");
        }
        else System.out.print("Es un nro primo, por lo que no tiene divisores");
        
        
    }
}
