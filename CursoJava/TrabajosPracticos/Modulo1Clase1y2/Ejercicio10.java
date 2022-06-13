package CursoJavaModulo1;


/**
 * Muestre en un ejemplo cómo se usan los operadores incremento y decremento.
 */
public class Ejercicio10
{
    
    public static void main(String[] args)
    {
        //Se declaran las variables a incrementar/decrementar
        int i,j;
        Double aux;
        //Se declaran las variables a incrementar/decrementar
        i=22;
        j=-11;
        
        /*
         * La variable i se decrementara
         * La variable j se incrementara
         * Se repetiran las acciones hasta que alguna de las dos varianbles valga 0
           */
        while(i*j!=0)
        {
            i--;
            j++;
        
        }
        /*Determinamos que variable llego a cero.
         *Por ende tambien, cual de las dos deberia aun decrementar o incrementar
         */
        if (i==0) while(j!=0) j++;
        else while(i!=0) i--;
        System.out.println("Hola mundo :)");
    }
}
