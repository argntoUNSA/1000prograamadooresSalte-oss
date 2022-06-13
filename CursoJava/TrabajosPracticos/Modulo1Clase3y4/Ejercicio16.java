package CursoJavaModulo1Clase3y4;
import java.util.Scanner;
/**
Dado un numero natural n mostrar sus digitos indivudualmente.

*/
public class Ejercicio16 {

  public static void main(String[] args) {
  //Declaramos las variables correspondientes
  Scanner sc=new Scanner(System.in);
  int n,aux;
  String numeroN;
  System.out.println("Ingrese su numero natural n. ");
  do
  {
    System.out.println(" n natural, n > 1: ");
    n=sc.nextInt();
    
  }while(n<=1);
  
  
  //Despues de ingresarlo imprimire sus digitos desde el menos al mas significativo
  //Para esto urilizamos la operacion resto entre el numero y 10.
  //Para no perder el numero original ocupamos una copia
  System.out.println("Forma de mostrar nro1");
  aux=n;
  while(aux>=1){
    System.out.print((aux%10)+" ");
    aux/=10;
  }
  System.out.println();
  
  
  System.out.println("Forma de mostrar nro2");
  //Otra manera podria ser 
  numeroN="";
  numeroN+=n;
  aux=numeroN.length();
  for(int i=0;i<aux;i++)
  {
    System.out.print(numeroN.charAt(i)+" ");
  }
  System.out.println("Fin del programa");
  sc.close();
  }

}
