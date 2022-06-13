package CursoJavaModulo1Clase3y4;
import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int k,primo,divisor;
    double raiz;
    //Sys
    //Fijarme si 9731 o 1379 es primo
    do{
      //Sys
      k=scan.nextInt();
    }while (k<=10);
    System.out.print("Se mostraran los primos menores a "+k+": ");
    
    
    
    for(int i=3;i<k;i+=2){
      primo=i;
      raiz=Math.sqrt(primo);
      divisor=2;
      while(divisor<raiz && primo%divisor!=0){
        divisor++;
      }
      if(divisor>=raiz) System.out.print(primo+" ");
      
      //bloque que determina si es primo
      
    }
    scan.close();
    
  }

}
