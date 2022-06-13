package CursoJavaModulo1Clase3y4;


/**
 * Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el menor.
 */
public class Ejercicio3
{
    public static void main(String[] args)
    {
        int entero1,entero2,entero3,mayor,menor;
        entero1=1;
        entero2=2;
        entero3=3;
        mayor=menor=entero1;
        if(mayor<entero2)
        {
            mayor=entero2;
            if(mayor<entero3)
            {
                mayor=entero3;
            }
        
        }
        else
        {
            if(mayor<entero3)
            {
                mayor=entero3;
            }
        }
        System.out.println("El mayor es: "+mayor);
        if(menor>entero2)
        {
            menor=entero2;
            if(menor>entero3)
            {
                menor=entero3;
            }
        
        }
        else
        {
            if(menor<entero3)
            {
                menor=entero3;
            }
        }
        System.out.println("El menor es: "+menor);
    }
}
