package CursoJavaModulo1;



/**
 * Realizar un programa en donde se muestren los diferentes operadores que existen en
 * Java. Utilizar bloques de comentarios para estructurar el mismo.
 */
public class Ejercicio5
{
    public static void main(String[] args)
    {
        System.out.println("Inicio del programa");
        
        
        int numEntero1,numEntero2;
        numEntero1=10;
        numEntero2=22;
               
        //Operadores algebraicos
        System.out.println("Operacion:  "+numEntero1+"+"+numEntero2+"="+(numEntero1+numEntero2));
        System.out.println("Operacion:  "+numEntero1+"-"+numEntero2+"="+(numEntero1-numEntero2));
        System.out.println("Operacion:  "+numEntero1+"*"+numEntero2+"="+(numEntero1*numEntero2));
        if(numEntero1*numEntero2!=0) 
        {
            System.out.println("Operacion:  "+numEntero1+"/"+numEntero2+"="+(numEntero1/numEntero2));
            System.out.println("Operacion:  "+numEntero1+"%"+numEntero2+"="+(numEntero1%numEntero2));
            
        }
        
        //Operadores Relacionales
        System.out.println("Operacion:  "+numEntero1+"<"+numEntero2+" --> "+(numEntero1<numEntero2));
        System.out.println("Operacion:  "+numEntero1+"<="+numEntero2+" --> "+(numEntero1<=numEntero2));
        System.out.println("Operacion:  "+numEntero1+">"+numEntero2+" --> "+(numEntero1>numEntero2));
        System.out.println("Operacion:  "+numEntero1+">="+numEntero2+" -->  "+(numEntero1>=numEntero2));
        System.out.println("Operacion:  "+numEntero1+"=="+numEntero2+" --> "+(numEntero1==numEntero2));
        System.out.println("Operacion:  "+numEntero1+"!="+numEntero2+" --> "+(numEntero1!=numEntero2));
       
        //Operadores logicos
        if(numEntero1%2==0 && numEntero1!=0)
               System.out.println("El numero "+numEntero1+" es par");
        if(numEntero2%2==1 || numEntero1%2!=0)
               System.out.println("al menos uno es impar");
        if(!(numEntero1%5==0))
               System.out.println("El numero "+numEntero1+" no es multiplo de 5");
        
        
               
        
        System.out.println("Fin del programa");
    }
}
