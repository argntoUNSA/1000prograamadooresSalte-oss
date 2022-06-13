package modulo2Clase1y2;
import java.util.Scanner;
public class TestEj5C5y6 {

  public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  Cuenta ctaOrigen,ctaDestino,ctaVacia,ctaCopia;
  double importe;
  
  /*Crear 3 cuentas: 1 con datos por defecto 1 con datos copiados y 2 con datos que ingrese el usuario  */
  
  //Inicializo cta vacia
  ctaVacia=new Cuenta();
  //pido datos al usuario sobre Cuenta Origen
  ctaOrigen=creaCuenta();
  //pido datos al usuario sobre Cuenta Destino
  ctaDestino=creaCuenta();
  //Creo una copia de seguridad
  ctaCopia=new Cuenta(ctaOrigen);
  //Se mostraran todas las cuentas
  System.out.println("Cuenta Vacia");
  mostrarCuenta(ctaVacia);
  System.out.println("Cuenta Copia");
  mostrarCuenta(ctaCopia);
  System.out.println("Cuenta Origen");
  mostrarCuenta(ctaOrigen);
  System.out.println("Cuenta Destino");
  mostrarCuenta(ctaDestino);
  
  
  //Realizamos una transferencia de origen a destino
  System.out.println("Inicio de transferencia desde \'origen\' a \'destino\'");
 //Solicitud de importe
 System.out.println("Importe a transferir:");
 importe=scan.nextDouble(); if(ctaOrigen.transferencia(ctaDestino,importe)){
   System.out.println("Fin de transferencia");
 }
 else
   System.out.println("Error de transferencia. Impprte negativo o mayor al saldo de la cuwnta \"origen\"");
  System.out.println("Cuentas \"origen\" y \"destino\" despues de transferencia");
  System.out.println("Cuenta Copia");
  mostrarCuenta(ctaCopia);
  System.out.println("Cuenta Origen");
  mostrarCuenta(ctaOrigen);
  System.out.println("Cuenta Destino");
  mostrarCuenta(ctaDestino);
  scan.close();
  }
  public static Cuenta creaCuenta(){
    Scanner scan=new Scanner(System.in);
    String nombCte,nroCta;
    double interes,saldo;
    Cuenta cuentaNueva;
  
    System.out.println("Ingrese datos de la cuenta:");
    System.out.print("Nombre del Cliente:");
    nombCte=scan.nextLine();
    System.out.print("Nro de Cuenta:");
    nroCta=scan.nextLine();
    System.out.print("Tipo de interes:");
    interes=scan.nextDouble();
    System.out.print("Saldo:");
    saldo=scan.nextDouble();
    scan.close();
    cuentaNueva=new Cuenta(nombCte,nroCta,interes,saldo);
    return cuentaNueva;
  }
  public static void mostrarCuenta(Cuenta cuenta){
    System.out.println("Nombre del Cliente:"+cuenta.getNombreCte());
    System.out.println("Nro de Cuenta:"+cuenta.getNroCta());
    System.out.println("Tipo de interes:"+cuenta.getTipoInteres());
    System.out.println("Saldo:"+cuenta.getSaldo());
  }
  
}
