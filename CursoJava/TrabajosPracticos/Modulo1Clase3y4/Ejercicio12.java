package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 * Dada un lista con las edades de N deportistas, se necesita informar la edad promedio de
 * los deportistas de la lista; cual es la menor y la mayor edad ingresada.
 */
public class Ejercicio12
{
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int CANT_ELEM_MAX=100;
        int n,menor,mayor,posMenor,posMayor;
        int[] listaEdades=new int[CANT_ELEM_MAX];
        
        System.out.println("Ingrese la cantidad de deportista que quiere ingresar");
        System.out.println("Numero entre 1 y "+CANT_ELEM_MAX);
        n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            
            System.out.print("Edad del deportista nro"+(i+1)+": ");
            listaEdades[i]=scan.nextInt();
            System.out.println();
        }
        
        menor=mayor=listaEdades[0];
        posMenor=posMayor=1;
        for(int i=1;i<n;i++)
        {
            if(menor>listaEdades[i])
            {
                menor=listaEdades[i];
                posMenor=i+1;
            }
            if(mayor<listaEdades[i])
            {
                mayor=listaEdades[i];
                posMayor=i+1;
            }
        }
        
        System.out.println("Edad del deportista mas joven: "+menor+"\t posicion: "+posMenor);
        System.out.println("Edad del deportista mas adulto: "+mayor+"\t posicion: "+posMayor);
    }
}
