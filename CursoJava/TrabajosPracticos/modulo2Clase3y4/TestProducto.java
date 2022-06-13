package modulo2Clase3y4;
import java.util.Scanner;
public class TestProducto {

  public static void main(String[] args) {
    Producto[] listaProductos;
    double[] listaPagos;
    int cantidadProductos,cantidadUnidades;
    cantidadUnidades=5;
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese cantidad de productos diferentes que desea comprar:");
    cantidadProductos=scan.nextInt();
    listaProductos=new Producto[cantidadProductos];
    listaPagos=new double[cantidadProductos];
    for(int i=0;i<cantidadProductos;i++){
      System.out.println("Producto nro "+i+": ");
      listaProductos[i]=ingresaProducto();
       listaPagos[i]=listaProductos[i].calcula(cantidadUnidades);
    }
    scan.close();
    for(int i=0;i<cantidadProductos;i++){
      System.out.println("Producto: "+listaProductos[i].getNombre());
      System.out.println("Precio:"+listaPagos[i]);
    }
  }
public static Producto ingresaProducto(){
  Scanner scan=new Scanner(System.in);
  String nombreProd,fechaVto;
  double precioProd;
  Producto nuevo;
  System.out.println("Nombre:");
  nombreProd=scan.nextLine();
  System.out.println("Precio:");
  precioProd=scan.nextDouble();
  System.out.println("Si no es perecedero ingrese N:");
  System.out.println("Vencimiento(AAAA-MM-DD):");
  scan.nextLine();
  fechaVto=scan.nextLine();
  scan.close();
  nuevo=new Producto(nombreProd,precioProd,fechaVto.toUpperCase());
  return nuevo;
}
}
