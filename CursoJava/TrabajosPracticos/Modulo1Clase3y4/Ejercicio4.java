package CursoJavaModulo1Clase3y4;


/**
 *Declarar dos variables, asignar un valor cualquiera y realizar las siguientes operaciones:    
 *  Mostrar la suma
 *  Mostrar la multiplicacion
 *  Mostrar la resta
 *  Mostrar Division
 */
public class Ejercicio4
{
    public static void main(String[] args)
    {
        int numero1;
        long numero2,resultado;
        numero1=5;
        numero2=39038254;
        
        System.out.println("Los valores de las variables son:");
        System.out.println("variable1:"+numero1+"variable2:"+numero2);
        System.out.println("Los valores de las operaciones son:");
        resultado=numero1+numero2;
        System.out.println("    *Suma:"+resultado);
        resultado=numero1-numero2;
        System.out.println("    *Resta:"+resultado);
        resultado=numero1*numero2;
        System.out.println("    *Multiplicacion:"+resultado);
        if(numero1*numero2!=0)
        {
            resultado=numero1/numero2;
            System.out.println("    *Division (num1/num2):"+resultado);
            System.out.println("    *Division (num2/num1):"+resultado);
            
        }
    }
}
