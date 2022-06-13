package CursoJavaModulo1;

import java.util.Scanner;
/**
 * Realizar un programa que muestre el uso del operador relacional. Pruebe al menos 5
 * ejemplos.
 */
public class Ejercicio11
{
    public static void main(String[] args)
    {
        
        //Determinaremos si un nro es par, multiplo de 4, mayor a cero, menor que 100
        //Declaro las varianbles necesarias
        Scanner sc=new Scanner(System.in);
        int entero;
        
        //Se pide y se almacena un nro entero
        System.out.println("Ingresa un nro entero");
        entero = sc.nextInt();
        
        //Suponiendo que se ingreso un nro valido continuamos
        
        //Veamos si es par
        if(entero!=0 && entero%2==0) System.out.println("Es par");
        else System.out.println("No es par");
        
        //Veamos si es divisible por 4
        if(entero%4!=0) System.out.println("No es multiplo de 4");
        else System.out.println("Es multiplo de 4");
        
        //Veamos si es positivo
        if(entero>0) System.out.println("Es positivo");
        else 
            if(entero==0) System.out.println("Es cero");
            else System.out.println("No es positivo");
        
        if(entero<=100) System.out.println("Es menor o igual a 100");
        else System.out.println("No es menor que 100");
        
    }
}
