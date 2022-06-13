package CursoJavaModulo1Clase5y6;
import java.util.Scanner;

public class Ejercicio10Clase5y6 {

  public static void main(String[] args) {
    System.out.println("Inicio del programa");
    Scanner scan=new Scanner(System.in);
    int filas,columnas,valor;
    int[][] matrizA,matrizB,matrizC;
    
    System.out.println("Se cargaran las dimensiones y los datos de las matrices...");
    
    //Pedimos m
    System.out.println("Ingrese cantidad de filas de las matrices: m");
    do{
      System.out.print("m>0: ");
      filas=scan.nextInt();
    }while(filas<=0);
    System.out.println();
    
    //Pedimos n
    System.out.println("Ingrese cantidad de columnas de las matrices: n");
    do{
      System.out.print("n>0: ");
      columnas=scan.nextInt();
    }while(columnas<=0);
    System.out.println("Se cargaron las dimensiones de las matrices");
    
    //Se reserva la memoria correspondiente
    matrizA=new int[filas][columnas];
    matrizB=new int[filas][columnas];
    
    //Se llenan las matrices A y B
    System.out.println("Ingrese los datos de las matriz A: ");
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        System.out.print("A["+i+";"+j+"]: ");
        matrizA[i][j]=scan.nextInt();
        System.out.println();
        }
    }
    System.out.println("Se cargaron los datos de las matriz A: ");
    
    System.out.println("Ingrese los datos de las matriz B: ");
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        System.out.print("B["+i+";"+j+"]: ");
        matrizB[i][j]=scan.nextInt();
        System.out.println();
        }
    }
    System.out.println("Se cargaron los datos de las matriz B");
    
    //Se llena la matriz resultado
    matrizC=new int[filas][columnas];
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
      }
    }
    
    //Se informan los resultados
    System.out.println("Matriz A: ");
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        System.out.print("["+matrizA[i][j]+"]");
      }
      System.out.println();
    }
    System.out.println("Matriz B: ");
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        System.out.print("["+matrizB[i][j]+"]");
      }
      System.out.println();
    }
    System.out.println("Matriz C: ");
    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        System.out.print("["+matrizC[i][j]+"]");
      }
      System.out.println();
    }
    
    scan.close();
    System.out.println("Fin del programa");

  }

}
