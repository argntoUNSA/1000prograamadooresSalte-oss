package CursoJavaModulo1Clase5y6;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1Consulta
 {
  
  public static void main(String[] args) {
    //ArrayList<Integer> listaEnteros=new ArrayList<Integer>(10);
    //ingresaElementos(listaEnteros);
    
    //muestraElementos(listaEnteros);
    int[] lista=new int[5];
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese sus 10 numeros");
    for(int i=0;i<5;i++){
      System.out.print("["+(i+1)+"]:");
      lista[i]=scan.nextInt();
      System.out.println();
    }
    scan.close();
    
    System.out.println("Se muestra la lista ingresada:");
    for(int i=0;i<lista.length;i++){
      System.out.println("pos: "+i+" elem: "+lista[i]);
    }
    seleccion(lista);
    System.out.println("Se muestra la lista ingresada ordenada:");
    for(int i=0;i<lista.length;i++){
      System.out.println("pos: "+i+" elem: "+lista[i]);
      }
  }
  
  public static void ingresaElementos(ArrayList<Integer> lista){
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese sus 10 numeros");
    for(int i=0;i<10;i++){
      System.out.print("["+(i+1)+"]:");
      lista.add(scan.nextInt());
      System.out.println();
    }
    scan.close();
    
    
  }
  public static void muestraElementos(ArrayList<Integer> lista){
    for(int i=0;i<10;i++){
      System.out.println("pos: "+i+" elem: "+lista.get(i));
      
      
    }
  }
  public static void seleccion(int[] lista){
      int i,j,p,auxiliar,limit;
      limit=lista.length-1;
    for(i=0;i<limit;i++){
        p=i;
        for(j=i+1;j<=limit;j++){
            if(lista[p]>lista[j]) p=j;
        }
        if(p!=j){
            auxiliar=lista[p];
            lista[p]=lista[i];
            lista[i]=auxiliar;
        }
      
    }
  }
}
