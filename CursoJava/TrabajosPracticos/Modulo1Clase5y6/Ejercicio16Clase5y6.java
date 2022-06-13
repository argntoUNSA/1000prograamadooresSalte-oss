package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio16Clase5y6 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int opcion;
    menu();
    System.out.println("Ingresa una opcion");
    opcion=scan.nextInt();
    metodo(opcion);
    scan.close();
    
  
  }
  public static void menu(){
    System.out.println("1-Inicio");
    System.out.println("2-Dashboard");
    System.out.println("3-Home");
    System.out.println("4-Panel");
  }
  public static void metodo(int opcion){
    System.out.print("Ingreso: ");
    switch (opcion){
      case 1:{
        System.out.println("Inicio");
        break;
      }
      case 2:{
        System.out.println("Dashboard");
        break;
      }
      case 3:{
        System.out.println("Home");
        break;
      }
      case 4:{
        System.out.println("Panel");
        break;
      }
      default: {
        System.out.println("error");
        break;
      }
    }
  }
}
