package CursoJavaModulo1;


/**
 * Siguiendo en ejercicio anterior, mezclar sumas con numeros enteros y decimales, que
 * sucede? Describa el resultado mediante comenatrios.
 */
public class Ejercicio9
{
    public static void main(String[] args)
    {
        //Declaramos las variables enteras y decimales
        int numEntero,rdoEntero1,rdoEnter2,rdoEntero3,rdoEntero4,rdoEntero5;
        double numDecimal;
        
        //Asignamos valores a las variables enteros y decimales
        numEntero=Integer.parseInt(args[0]);
        numDecimal=Integer.parseInt(args[1]);
               
        /*Operaciones basicas entre enteros y decimales
         * Primero se haran con el sgte orden: (entero(+,-,*,/)decimal)
         * Comentarios:
         *        -Todos los  ressultados de las operaciones son de tipo doouble (o decimal).
         *        -En la operacion resto("%") se calcula el resto de la division entera.
         *        - 
        */
        System.out.println("Operacion:  "+numEntero+"+"+numDecimal+"="+(numEntero+numDecimal));
        System.out.println("Operacion:  "+numEntero+"-"+numDecimal+"="+(numEntero-numDecimal));
        System.out.println("Operacion:  "+numEntero+"*"+numDecimal+"="+(numEntero*numDecimal));
        if(numDecimal==0)
        {
            System.out.println("Operacion:  "+numEntero+"/"+numDecimal+": no es posibleDivision por cero no valida");
            System.out.println("Operacion:  "+numEntero+"%"+numDecimal+": no es posibleDivision por cero no valida");
        }
        else 
        {
            System.out.println("Operacion:  "+numEntero+"/"+numDecimal+"="+(numEntero/numDecimal));
            System.out.println("Operacion:  "+numEntero+"%"+numDecimal+"="+(numEntero%numDecimal));
        }
           
        //Seguiremos utilizando las variables anteriores
        //Operaciones basicas entre decimales y enteros (decimal(+,-,*,/)entero):
        System.out.println("Operacion:  "+numDecimal+"+"+numEntero+"="+(numDecimal+numEntero));
        System.out.println("Operacion:  "+numDecimal+"-"+numEntero+"="+(numDecimal-numEntero));
        System.out.println("Operacion:  "+numDecimal+"*"+numEntero+"="+(numDecimal*numEntero));
        
        if(numEntero==0)
        {
            System.out.println("Operacion:  "+numDecimal+"/"+numEntero+": No es posible - Division por cero no valida");
            System.out.println("Operacion:  "+numDecimal+"%"+numEntero+": No es posible - Division por cero no valida");
        
        }
        else
        {
            System.out.println("Operacion:  "+numDecimal+"/"+numEntero+"="+(numDecimal/numEntero));
            System.out.println("Operacion:  "+numDecimal+"%"+numEntero+"="+(numDecimal%numEntero));
    
        }
        
            
        
        
        
    }
}
