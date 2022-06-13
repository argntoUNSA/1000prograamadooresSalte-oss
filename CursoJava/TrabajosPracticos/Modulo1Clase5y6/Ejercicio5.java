package CursoJavaModulo1Clase5y6;
import java.util.Random;

/**
 * Dada una lista de enteros, separarla en dos listas ordenadas de menor a mayor, la primera con 
 * los numeros pares y la segunda con los impares.
 */
public class Ejercicio5
{
    public static void main(String[] args){
        
        
        System.out.println("Inicio del programa");
        //Declaramos las variables necesarias pàra generar una lista de enteros y saparar esa lista 
        //en dos 
        Random generador=new Random();
        int[] enterosGenerados,enterosPares,enterosImpares;
        int cantidad,contadorPares,contadorImpares,auxiliar;
        
        //asignamos valores iniciales a los contadores y generamos una cantidad aleatoria de
        //elementos aleatorios, con la mision de reducir el tiempo de datos de entrada.
        contadorPares=contadorImpares=0;
        cantidad=generador.nextInt(25)+1;
        enterosGenerados=new int[cantidad];
        enterosPares=new int[cantidad];
        enterosImpares=new int[cantidad];
        for(int i=0;i<cantidad;i++){
            auxiliar=generador.nextInt(1000);
            enterosGenerados[i]=auxiliar;
            if(auxiliar%2==0){
                enterosPares[contadorPares]=auxiliar;
                contadorPares++;
            }
            else{
                enterosImpares[contadorImpares]=auxiliar;
                contadorImpares++;
            }
        }
        
        
        //ordenamos las listas generadas
        
        //Ordenamos la lista de los enteros pares utilizando el metodo de seleccion
        int menor;
        for(int i=0;i<contadorPares-1;i++){
            menor=enterosPares[i];
            for(int j=i+1;j<contadorPares;j++){
                if(menor>enterosPares[j]){
                    auxiliar=menor;
                    menor=enterosPares[j];
                    enterosPares[j]=auxiliar;
                }
            
            }
        }
        
        //Ordenamos la lista de los enteros Impares utilizando el metodo de la burbuja
        
        for(int i=0;i<contadorImpares-1;i++){
            for(int j=contadorImpares-1;j>i;j--){
                if(enterosImpares[j]<enterosImpares[j-1]){
                    auxiliar=enterosImpares[j-1];
                    enterosImpares[j-1]=enterosImpares[j];
                    enterosImpares[j]=auxiliar;
                }
            
            }
        }
        
        
        //Informamos los resultados
        
        System.out.println("Se muestran las listas: ");
        System.out.println("Lista de "+cantidad+" elementos generada: ");
        for(int i=0;i<cantidad;i++) System.out.print("["+enterosGenerados[i]+"]");
        System.out.println();
        
        //Contrtolamos que hayan elementos en las dos listas
        
        if(contadorPares>0){
            System.out.println("Lista Ordenada, de Pares: ");
            for(int i=0;i<contadorPares;i++)  System.out.print("["+enterosPares[i]+"]");
            System.out.println();
        }
        else System.out.println("Ningun elemento de la lista es Par");
        
        if(contadorImpares>0){
                System.out.println("Lista Ordenada, de Impares: ");
                for(int i=0;i<contadorImpares;i++)    System.out.print("["+enterosImpares[i]+"]");
                System.out.println();
        }
        else System.out.println("Ningun elemento de la lista es impar");
            
            
            System.out.println("Fin del programa");
    }

    
}
