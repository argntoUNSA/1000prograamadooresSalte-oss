package CursoJavaModulo1Clase5y6;
import java.util.Scanner;

/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio3
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] vector=new int[10];
        int posicion,cantidad;
        System.out.println("Inicio del programa");
        System.out.println("Ingrese los 10 elementos: ");
        System.out.println("Pos    |    Elem");
        
        cantidad=10;
        for(int i=0;i<cantidad;i++){
            System.out.print(i+"\t|\t");
            vector[i]=scan.nextInt();
            System.out.println("");
        }
        //Se muestran los elementos ingresados
        System.out.println("Lista cargada: ");
        for(int i=0;i<cantidad;i++){
            System.out.print("["+vector[i]+"]");
        }
            System.out.println("");
        
        //Pido el ingreso de la posicion a eliminar
        //Nos aseguramos que sea una posicion valida
        do{
            System.out.print("Ingrese posicion a eliminar (0-"+(cantidad-1)+"): ");
            posicion=scan.nextInt();
        }while(posicion<0 || posicion>=10);
        if(posicion!=9) 
            for(int i=posicion;i<9;i++){
                vector[i]=vector[i+1];
            }
        cantidad--;
        System.out.println("Lista modificada: ");
        for(int i=0;i<cantidad;i++){
            System.out.print("["+vector[i]+"]");
        }
            System.out.println("Fin del programa");
        
    }
}
