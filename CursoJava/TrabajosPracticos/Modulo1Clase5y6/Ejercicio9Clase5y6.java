package CursoJavaModulo1Clase5y6;
import java.util.Random;
public class Ejercicio9Clase5y6 {

  public static void main(String[] args) {
    System.out.println("Inicio del programa");
    Random generador=new Random();
    int[][] matriz = new int[3][3];
    
    //Cargamos la matriz
    System.out.println("Creamos la matriz...");
    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
        matriz[i][j]=generador.nextInt(8)+1;
        
    //Mostramos la matriz
    System.out.println("Matriz creada: ");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++)
        System.out.print("["+matriz[i][j]+"]");
      System.out.println();
    }
    System.out.println("Fin del programa");
  }

}
