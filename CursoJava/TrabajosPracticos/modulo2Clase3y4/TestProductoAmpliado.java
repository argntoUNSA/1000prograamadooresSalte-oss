package modulo2Clase3y4;
import java.util.Scanner;
import java.util.Random;
public class TestProductoAmpliado {

  public static void main(String[] args) {
    Random genera=new Random();
    ProductoAmpliado miProducto=new ProductoAmpliado("Alimentos",genera.nextInt(200)+1,genera.nextInt(100)+1);
    miProducto.setNombre("Fideos");
    Scanner scan=new Scanner(System.in);
    int opcion,cantidad;
    System.out.println("Inicio de la Prueba\nSe creo el siguiente producto:");
    miProducto.mostrarDatos();
    
    do{
      opcion=menu();
      switch(opcion){
        case 1:{
          System.out.print("Se procede a comprar\n¿Cuantas unidades desea comprar?:");
          cantidad=scan.nextInt();
          miProducto.comprar(miProducto.getCategoria(),cantidad);
          break;
        }
        case 2:{
          System.out.print("Se procede a vender\n¿Cuantas unidades desea vender?:");
          cantidad=scan.nextInt();
          miProducto.vender(miProducto.getCategoria(),cantidad);
          break;
        }
        case 3:{
          System.out.println("Se procede a mostrar los datos:");
          miProducto.mostrarDatos();
          break;
        }
        default:{
          System.out.println("Se procede a verificar el stock.");
          if(miProducto.validarStock()) System.out.print("Si hay stock");
          else System.out.print("No hay stock");
        }
      } System.out.println("0-Terminar\n1-Continuar\n");
      opcion=scan.nextInt();
    }while(opcion!=0);
    scan.close();
    System.out.println("Fin de la Prueba");
  }
  
  public static int menu(){
    Scanner scan=new Scanner(System.in);
    int opcion;
     System.out.println("1-Comprar\n2-Vender\n3-Mostrar datos\n4-Validar stock");
    do{
      System.out.print("Ingrese opcion correcta:");
      opcion=scan.nextInt();
    }while(opcion<1 || opcion>4);
    scan.close();
    return opcion;
  }
}
