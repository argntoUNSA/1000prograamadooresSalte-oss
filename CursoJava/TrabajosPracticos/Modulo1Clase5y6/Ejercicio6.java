package CursoJavaModulo1Clase5y6;
import java.util.Scanner;

/**
Determinar si una palabra (o frase) es o no un palindromo*/
public class Ejercicio6 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String cadenaIngresada,cadenaVolteada;
    int ini,fin;
    
    System.out.println("Ingrese su palabra");
    cadenaIngresada=scan.nextLine();
    ini=0;
    fin=cadenaIngresada.length()-1;
    
    
    //Verificamos si es o no palondromo;
    while(ini<fin && cadenaIngresada.charAt(ini)==cadenaIngresada.charAt(fin)){
      ini++;
      fin--;
    }
     
    if(ini>=fin){
      cadenaVolteada="";
      fin=cadenaIngresada.length();
      System.out.println("Es un palindromo");
      System.out.println("Cadena ingresada: "+cadenaIngresada);
      System.out.print("Cadena volteada: ");
      for(int i=fin-1;i>=0;i--){
        cadenaVolteada+=cadenaIngresada.charAt(i);
      }
      System.out.println(cadenaVolteada);
    }
    else{
      System.out.println("No es palindromo");
      System.out.println("Diferencia encontrada:");
      System.out.println(" posA:"+ini+" caracter:"+cadenaIngresada.charAt(ini));
      System.out.println(" posB:"+fin+" caracter:"+cadenaIngresada.charAt(fin));
    }
    scan.close();
    System.out.println("Fin del programa");
    
  }

}
