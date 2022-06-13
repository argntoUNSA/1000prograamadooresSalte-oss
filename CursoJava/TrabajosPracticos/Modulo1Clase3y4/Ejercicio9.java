package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

/**
 *Dados tres números, mostrarlos ordenados ascendentemente
 */

public class Ejercicio9
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int numero1,numero2,numero3,aux,bandera;
        System.out.println("Ingrese 3 numeros enteros");
        
        System.out.println("Ingrese el primer numero");
        numero1=scan.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2=scan.nextInt();
        
        System.out.println("Ingrese el tercer numero");
        numero3=scan.nextInt();
        
        aux=numero1;
        if(numero1<=numero2 && numero1<=numero3) 
        {
            System.out.println("menor: \t"+numero1);
            if(numero2<=numero3)
            {
                System.out.println("mediano: \t"+numero2);
                System.out.println("mayor: \t"+numero3);
            }
            else
            {
                System.out.println("mediano: \t"+numero3);
                System.out.println("mayor: \t"+numero2);
            }
        }
        else 
        {
            if(numero1<=numero2)
            {
                System.out.println("menor: \t"+numero3);
                System.out.println("mediano: \t"+numero1);
                System.out.println("mayor: \t"+numero2);
            }
            else
            {
                if(numero1<=numero3)
                {
                    System.out.println("menor: \t"+numero2);
                    System.out.println("mediano: \t"+numero1);
                    System.out.println("mayor: \t"+numero3);
                }
                else
                {
                    if(numero2<=numero3)
                    {
                        System.out.println("menor: \t"+numero2);
                        System.out.println("mediano: \t"+numero3);
                    }
                    else
                    {
                        System.out.println("menor: \t"+numero3);
                        System.out.println("mediano: \t"+numero2);
                    }
                    System.out.println("mayor: \t"+numero1);
                }
            }
        }
            
            
        
        
        
        
    }
}
