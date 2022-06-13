package CursoJavaModulo1Clase3y4;


/**
 *Declare un variable de tipo entero y asigne un valor cualquiera, determine si el numero es
 *par o impar y muestre un mensaje con esa informacion. mensaje: "El numero... es (par o
 *impar)"
 */
public class Ejercicio5
{
    public static void main(String[] args)
    {
        int numero=2536;
        String cadena="El numero "+numero+" es ";
        if(numero%2==0) System.out.println(cadena+"par.");
        else System.out.println(cadena+"impar.");
    }
}
