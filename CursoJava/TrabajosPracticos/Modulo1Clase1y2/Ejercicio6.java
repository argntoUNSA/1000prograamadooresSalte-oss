package CursoJavaModulo1;


/**
 * Utilizar el tipo de dato entero para crear al menos 5 variables con numeros octales y
 * hexadecimales.
 * 
 * 
 * 
 * 
 * Hay que depurar el programa, ya que sin utilizar listas se podrian convertir n numeros
 * con n natural ingresado por el usuario, donde se almacenen los respectivos numeros en 
 * 3 listas diferentes. o podrian no almacenarse y no serian necesarias las listas. Hay que
 * analizar el problema.
 */
public class Ejercicio6
{
    public static void main(String[] args)
    {
        System.out.println("Inicio del programa");
        
        
        int numEnteroH1,numEnteroH2,numEnteroH3,numEnteroO1,numEnteroO2,numEnteroO3;
        String numOctal,numHexa;
        
        //Almacenare en una lista de enteros, los valores. Hasta ahora no son ingresados por el usuario.
        
        int[] listaEnterosOctales=new int[3];
        int[] listaEnterosHexadec=new int[3];
        
        listaEnterosOctales[0]=1;
        listaEnterosOctales[1]=1;
        listaEnterosOctales[2]=1;
        
        listaEnterosHexadec[0]=1;
        listaEnterosHexadec[1]=1;
        listaEnterosHexadec[2]=1;
        
        /*
         * Convertire los numeros enteros desde la base decimal a:
           * Base octal
           * Base hexadecimal
         * Utilizaremos la conversion a partir de la division reiterada. 
           */
          
          
        for(int i=0;i<3;i++)
        {
            int auxiliar;
            numOctal="";
            auxiliar=listaEnterosOctales[i];
            while(auxiliar>=8)
            {
                numOctal=(auxiliar%8)+numOctal;
                auxiliar=auxiliar/8;
            }
            numOctal=auxiliar+numOctal;
            
            
            System.out.println("Nro decimal:"+listaEnterosOctales[i]+" su equivalente octal:"+numOctal);
        
            int resto;
            
            numHexa="";
            auxiliar=listaEnterosHexadec[i];
            while(auxiliar>=16)
            {
                resto=auxiliar%16;
                
                if(resto>=10)
                {   
                    System.out.println("Entreo resto mayor hexadecimal: ");
                    char c;
                    switch(resto)
                    {
                        case 10:    c='A';break;
                        case 11:    c='B';break;
                        case 12:    c='C';break;
                        case 13:    c='D';break;
                        case 14:    c='E';break;
                        case 15:    c='F';break;
                        default:    c=' ';break;
                    }
                    System.out.println("deberia ser equivalente a :"+c);
       
                    numHexa=c+numHexa;
                }
                else    
                    numHexa=resto+numHexa;
                
                auxiliar=auxiliar/16;
            }
            
            numHexa=String.valueOf(auxiliar)+numHexa;
            System.out.println("Nro decimal:"+listaEnterosOctales[i]+" su equivalente hexadecimal:"+numHexa);
        }
               
        
        System.out.println("Fin del programa");
    }
}
