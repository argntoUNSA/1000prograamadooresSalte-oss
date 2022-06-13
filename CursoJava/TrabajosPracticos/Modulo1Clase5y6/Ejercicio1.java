
package CursoJavaModulo1Clase5y6;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {
  
  public static void main(String[] args) {
    ArrayList<Integer> listaEnteros=new ArrayList<Integer>(10);
    ingresaElementos(listaEnteros);
    muestraElementos(listaEnteros);
  }
  
  public static void ingresaElementos(ArrayList<Integer> lista){
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese sus "+10+" numeros");
    for(int i=0;i<10;i++){
      System.out.print("["+(i+1)+"]:");
      lista.add(scan.nextInt());
      System.out.println();
    }
    scan.close();
  }
  
  public static void muestraElementos(ArrayList<Integer> lista){
    for(int i=0;i<10;i++){
      System.out.println("["+i+"]="+lista.get(i));
    }
  }

}
