package CursoJavaModulo1;


/**
 * Realizar un programa que realice las operaciones basicas de suma, resta, producto y
 * división de dos numeros. Hacer con numeros enteros, y decimales.
 */
public class Ejercicio8
{
    public static void main(String[] args)
    {
        //Declaramos las variables enteras y decimales
        int numEntero1,numEntero2;
        double numDecimal1,numDecimal2;
        
        //Asignamos valores a las variables enteros
        numEntero1=10;
        numEntero2=22;
               
        //Operaciones basicas con enteros
        System.out.println("Operacion:  "+numEntero1+"+"+numEntero2+"="+(numEntero1+numEntero2));
        System.out.println("Operacion:  "+numEntero1+"-"+numEntero2+"="+(numEntero1-numEntero2));
        System.out.println("Operacion:  "+numEntero1+"*"+numEntero2+"="+(numEntero1*numEntero2));
        if(numEntero1*numEntero2!=0) 
        {
            System.out.println("Operacion:  "+numEntero1+"/"+numEntero2+"="+(numEntero1/numEntero2));
            System.out.println("Operacion:  "+numEntero2+"/"+numEntero1+"="+(numEntero2/numEntero1));
        }
        else
            System.out.println("Al ser uno de los dos un 0(cero), se omite la division, ya que el rdo es o 0(cero) o \'indefinido\'");
        
        //Asignamos valores a las variables enteros
        numDecimal1=10;
        numDecimal2=22;
            
        //Operaciones basicas con decimales
        System.out.println("Operacion:  "+numDecimal1+"+"+numDecimal2+"="+(numDecimal1+numDecimal2));
        System.out.println("Operacion:  "+numDecimal1+"-"+numDecimal2+"="+(numDecimal1-numDecimal2));
        System.out.println("Operacion:  "+numDecimal1+"*"+numDecimal2+"="+(numDecimal1*numDecimal2));
        if(numDecimal1*numDecimal2!=0) 
        {
            System.out.println("Operacion:  "+numDecimal1+"/"+numDecimal2+"="+(numDecimal1/numDecimal2));
            System.out.println("Operacion:  "+numDecimal2+"/"+numDecimal1+"="+(numDecimal2/numDecimal1));
        }
        else
            System.out.println("Al ser uno de los dos un 0(cero), se omite la division, ya que el rdo es o 0(cero) o \'indefinido\'");
            
            
        
        
        
        }
}
