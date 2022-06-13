package CursoJavaModulo1Clase3y4;
import java.util.Scanner;
/**
Dado un numero natural K determinar si es capicua. Nota: un numero capicua es aquel que se lee igual de derecha a izquierda y de izquierda a derecha.
*/
public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String copia;
    int numero,ini,fin;
    //boolean capicua;
    System.out.println("Ingrese su numero natural k. ");
    
    do
    {
      System.out.println("k>0");
      numero=scan.nextInt();
    }while(numero<=0);
    
    System.out.println("Numero ingresado: "+numero);
    
    //capicua=true;
    copia="";
    copia+=numero;
    ini=0;
    fin=copia.length()-1;
    while(ini<fin && copia.charAt(ini)==copia.charAt(fin))
    {
       ini++;
       fin--;
    }
    if(ini<fin)
    {
      System.out.println("No es capicua: ");
      System.out.println("Posiciones de la primer diferencia: "+ini+", "+fin);
      System.out.println(copia.charAt(ini)+" es diferente a: "+copia.charAt(fin));
      
    }
    else System.out.println("Es capicua");
      
    
    
    
    
    
    
    System.out.println("Fin del programa. ");
    scan.close();

  }

}
