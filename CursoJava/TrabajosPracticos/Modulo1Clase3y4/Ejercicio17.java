
package CursoJavaModulo1Clase3y4;
import java.util.Scanner;
/*Dada un lista de numero naturales mostrar aquellos que tengan una cantidad par de digitos pares
*/
public class Ejercicio17 {

  public static void main(String[] args) {
    int[] listaEnteros,listaSeleccion;
    int cantidadEnteros,cantidadSeleccion;
    boolean bandera;
    String opcion;
    Scanner scan=new Scanner(System.in);
    
    
    System.out.println("Ingrese sus numeros. ");
    //Inicializo las variables
    cantidadEnteros=0;
    listaEnteros = new int[100];
    
    
    do
    {
     //Se realizara un ingreso condicionado
     //Primero pedimos el numero
       System.out.print("nro"+(cantidadEnteros+1)+": ");
      cantidadEnteros+=1;
       listaEnteros[cantidadEnteros-1]=scan.nextInt();
       System.out.println();
     //confirmo el ingreso del proximo numero
       System.out.println("¿agregar uno mas? S/N: ");
       opcion="";
       opcion+=scan.next();
       System.out.println("Ingreso "+opcion);
       bandera=opcion.compareToIgnoreCase("s")==0;
       System.out.println("Por lo que la bandera es "+bandera);
     }while(bandera);
    
  
  
    //Comienzo a analizar la lista de naturales
    //Y a almacenar quellos que cumplen con la condicion
  
    listaSeleccion=new int[100];
    cantidadSeleccion=0;
    for(int i=0;i<cantidadEnteros;i++)
    {
      int aux,cantP,digito;//cantI,;
      aux=listaEnteros[i];
      cantP=0;
      while(aux>0)
      {
        digito=aux%10;
        if(digito%2==0)
        {
          if(digito!=0)
          cantP++;
        
        }
      //else cantI++;
        aux/=10;
      }
      if(cantP%2==0 && cantP!=0)
      {
        cantidadSeleccion++;
        listaSeleccion[cantidadSeleccion-1]=listaEnteros[i];
      }
    }
    //Informo los resultados
    if(cantidadSeleccion==0)
      System.out.println("Ningun nro ingresado cumple");
    else
    {
      
      System.out.println("Numeros que cumplen con que la canridad de digitos pares, es un nro par. Son: ");
      System.out.print("[ ");
      for(int i=0;i<cantidadSeleccion;i++)
      {
        System.out.print(listaSeleccion[i]+" ");
        
      }
      System.out.print(" ]");
      System.out.print("Fin del programa");
      scan.close();
      
      
    }
    
  }
}
