package CursoJavaModulo1Clase3y4;


/**
 * Declare dos variables de tipo entero una con el nombre divisor y la otra dividendo. Asigne
 * a dividendo el valor 25 y a la variable divisor el valor 10. muestre el resto (%) de la division
 * entre dividendo y divisor. Luego a dividendo asigne el valor 25/10. Y vuelva a mostrar el
 * resto entre dividendo y divisor.
 */
public class Ejercicio7
{
    public static void main(String args)
    {
        int resto,divisor,dividendo;
        
        divisor=10;
        dividendo=25;
        
        resto=dividendo%divisor;
        System.out.println("Primer resto: "+resto);
        
        dividendo=dividendo/divisor;
        resto=dividendo%divisor;
        System.out.println("Segundo resto: "+resto);
    }
}
