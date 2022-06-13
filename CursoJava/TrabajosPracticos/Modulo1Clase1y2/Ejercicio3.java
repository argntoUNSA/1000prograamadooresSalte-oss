package CursoJavaModulo1;


/**
 * Crear un programa en donde se declaren, al menos 3 identi�cadores validos y 3 invalidos,
 * a estos poner en comentarios el por que son incorrectas.
 */
public class Ejercicio3
{
    public static void main(String[] args)
    {
        System.out.println("Inicio del programa");
        
        //Declaraciones validas
        int numero1;
        String cadena;
        char caracter;
        
        //Declaraciones invalidas
        int numero_1; //Invalida porque no se admiten guiones bajo como separador de palabras
        int Numero1; //Invalida porque todas las variables deben comenzar por una letra minuscula
        int numero2=390396865; //Invalida porque no son del mismo tipo de dato.
        
        System.out.println("Fin del programa");
    }
}
