package modulo2Clase1y2;
import java.util.Scanner;


public class TestEj3C5y6 {

  public static void main(String[] args) {
    NumeroEntero n1,n2;
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese sus numeros");
    
    System.out.print("A:");
    n1=new NumeroEntero(scan.nextLong());
    System.out.print("B:");
    n2=new NumeroEntero(scan.nextLong());
    scan.close();
    System.out.println("Se realizaran las operaciones:");
    System.out.println(n1.getValor()+"+"+n2.getValor()+"="+n1.suma(n2));
    System.out.println(n1.getValor()+"-"+n2.getValor()+"="+n1.resta(n2));
    System.out.println(n1.getValor()+"*"+n2.getValor()+"="+n1.multiplicacion(n2));
    System.out.println(n1.getValor()+"/"+n2.getValor()+"="+n1.division(n2));
  }

}
