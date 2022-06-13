package modulo2Clase3y4;
import java.util.Scanner;
public class TestAgenda {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    AgendaTelefonica miAgenda=new AgendaTelefonica();
    int opcion;
    System.out.println("Iniciando Agenda");
    do{
      opcion=menu();
      switch(opcion){
        case 1:{
          String nombre,telefono;
          System.out.println("Ingrese datos");
          System.out.print("Nombre:");
          nombre=scan.next();
          scan.nextLine();
          System.out.print("Telefono:");
          telefono=scan.next();
          miAgenda.agregaContacto(new Contacto(nombre,telefono));
          break;
        }
        case 2:{
          String nombre;
          System.out.println("Ingrese datos");
          System.out.print("Nombre:");
          nombre=scan.next();
          scan.nextLine();
                       miAgenda.eliminarContacto(nombre);
          break;
        }
        case 3:{
          String nombre;
          int posicion;
          Contacto encontrado;
          System.out.println("Ingrese datos");
          System.out.print("Nombre:");
          nombre=scan.next();
          scan.nextLine();
          posicion=miAgenda.buscarContacto(nombre);
          if(posicion!=-1){
            System.out.print("Contacto encontrado:"); encontrado=miAgenda.getContacto(posicion);
           System.out.print("["+posicion+"]"); System.out.print(encontrado.getNombre()+"\t");
            System.out.println(encontrado.getNroTelefono());
            }
            else System.out.println("Contacto no encontrado");
          break;
        }
        case 4:{
          miAgenda.listarContactos();
          break;
        }
        case 5:{
          System.out.println("Cantidad de contactos libres:"+miAgenda.contactosLibres());
          break;
        }
        default:{
          System.out.print("No se ingreso opcion correcta");
        }
      }
      System.out.print("ingrese 1 para regresar al menu o 0 para terminar:");
      opcion=scan.nextInt();
    }while(opcion==1);
    System.out.print("Agenda cerrada");
    scan.close();
  }
  public static int menu(){
    Scanner scan=new Scanner(System.in);
    int opcion;
    System.out.println("1-Agregar contacto");
    System.out.println("2-Eliminar contacto");
    System.out.println("3-Buscar contacto");
    System.out.println("4-Listar contactos");
    System.out.println("5-Contactos libres");
    do{
      System.out.print("Ingrese opcion correcta:");
      opcion=scan.nextInt();
      System.out.println();
      }while(opcion<1 || opcion>5);
    scan.close();
    return opcion;
  }

}
