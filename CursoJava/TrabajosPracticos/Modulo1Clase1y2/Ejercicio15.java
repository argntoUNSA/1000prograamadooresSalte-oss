package CursoJavaModulo1;


/**
 * Será posible almacenar un tipo de dato char en un tipo entero? De ser posible explique
 * con comentarios el porque.
 */
public class Ejercicio15
{
    public static void main(String[] args)
    {
        char caracter;
        int entero;
        
        
        //Asigno valor al caracter y copio ese valor al entero
        caracter='A';
        entero=caracter;
        
        System.out.println("Valor del caracter: "+caracter);
        System.out.println("Valor del entero: "+entero);
        
        /*
         * Observamos que el valor almacenado en la variable "entero", es el valor unicode del caracter A.
         * Al parecer la variable de tipo char se representaaria con un nro desde 0 a FFFF por lo cual 
         * cuando lo asigno a una variable entera no tiene inconvenientes en almacenarla ya que en 
         * realidad su valor no es el caracter en si, si no mas bien el codigo unicod asociado al caracter
           */
    }
}
