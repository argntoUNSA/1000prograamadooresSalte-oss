package CursoJavaModulo1;
import java.util.Scanner;
public class Ejercicio12 {

  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
   boolean expresionLogica;
   int numAux;
   //Primer uso: Operador and &&
   //Ingresa un valor para el numero
   System.out.println("Ingrese nro entero");
   numAux=sc.nextInt();
   expresionLogica=numAux>0 && numAux%2==0;
   while(expresionLogica)
   {
     
     System.out.println("Entro al ciclo y se mermo el valor del numero");
     numAux-=100;
     expresionLogica=numAux>0 && numAux%2==0;
     }
   
   
    //Segundo uso: Operador or ||
   //Ingresa un valor para el numero
   System.out.println("Ingrese nro entero");
   numAux=sc.nextInt();
   expresionLogica=numAux>0 || numAux<-200;
   if(expresionLogica) System.out.println("Ingreso un numero fuera del intervalo [-200;0]");
   else System.out.println("Ingreso un numero dentro del intervalo [{}-200;0]");
   
   
   
   //Tercer uso: Operador not !
   //Ingresa un valor para el numero
   System.out.println("Ingrese nro entero");
   numAux=sc.nextInt();
   expresionLogica=numAux%6==1 || numAux%6==5;
   if(!expresionLogica) System.out.println("Ingreso un numero que no es primo");
   else System.out.println("Ingreso un numero que posiblemente sea primo");
    
   String vAux=sc.next();
   sc.close();
}
}