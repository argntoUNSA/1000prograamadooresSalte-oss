package modulo2Clase5y6;
import java.util.Scanner;
public class TestTCredito {
  public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
    double precio,balanceAux;
    TCredito JPTarjeta=new  TCredito("666","JPerez","BcoPatagonia",2000,10000);
    TCredito DMTarjeta=new TCredito("777","DMartin","BcoGalicia",5000,10000);
    JPTarjeta.muestraDatos();
    System.out.print(JPTarjeta.getNombre()+"Quiere comprar una notebook.\n Ingrese su precio: ");
    precio=scan.nextDouble();
    System.out.println("Inicio de la compra");
    balanceAux=JPTarjeta.getBalance();
    if(JPTarjeta.puedoComprar(precio)){
      System.out.println("Puede hacerlo. Se procede a comprar");
      System.out.println("Balance antes de la compra:"+balanceAux);
      System.out.println("Balance actual "+JPTarjeta.getBalance());
      
    }
    else
      System.out.println("No se pudo realizar la compra");
      System.out.println("Fin de la compra");
      // 
    System.out.println("Inicio del aumento de limite");
    System.out.print("¿Cuanto desea aumentar?:"); 
    balanceAux=scan.nextDouble();
    System.out.println("Datos de Juan Perez anteriores:");
    JPTarjeta.muestraDatos();
    JPTarjeta.aumentarLimite(balanceAux);
    System.out.println("Datos de Juan Perez actualizados:");
    JPTarjeta.muestraDatos();
    System.out.println("Fin del aumento de limite");
    System.out.println("Inicio del pago");
    System.out.println("Datos antes del pago");
    DMTarjeta.muestraDatos();
    System.out.println("Datos despues del pago");
    DMTarjeta.pagarTarjeta(1500);
    DMTarjeta.muestraDatos();
    scan.close();
    System.out.print("Fin del pago");
    
  }
}


