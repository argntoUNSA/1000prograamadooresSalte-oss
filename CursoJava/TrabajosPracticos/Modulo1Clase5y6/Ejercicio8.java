package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio8 {

  public static void main(String[] args) {
    System.out.println("Inicio del programa");
    Scanner scan=new Scanner(System.in);
    String[] vectorNombres=new String[10];
    String buscado;
    int indice;
    
    System.out.println("Ingrese 10 nombres-");
    for(int i=0;i<10;i++){
      System.out.print("Nombre["+i+"]: ");
      do{
       // System.out.println("No ingrese palabra vacia");
        vectorNombres[i]=scan.nextLine();
      }while(vectorNombres[i].length()<1);
      
    }
    
    
    //Solicitamos el nombre a buscar
    System.out.println("Ingrese el nombre a buscar: ");
    do{
        System.out.println("No ingrese nombre vacio");
        buscado=scan.nextLine();
      }while(buscado.length()<1);
      
      
    //procedemos a buscar
    indice=0;
    while(indice<10 && vectorNombres[indice].compareTo(buscado)!=0) indice++;
    if (indice<10) System.out.println("Se encontro el nombre en la pos: "+indice);
    else System.out.println("No se encontro el nombre");
    scan.close();
    System.out.println("Fin del programa");
  }

}
