package CursoJavaModulo1;
import java.util.Scanner;
/**
 * Conversión de tipos. Realizar un programa que muestre la conversion de tipos uppcasting y 
 * downcasting. Usar tipos enteros y decimales.
   */
public class Ejercicio14 {

  public static void main(String[] args) {
  //Declaramos las variables correspondientes
  Scanner sc=new Scanner(System.in);
  int variableE=1001101;
  short variableEC=155;
  long variableEL=39047186;
  float variableRF=2.45F;
  double variableRFD=1234.3456;
  
  //Ejemplo de upcasting
  //Donde se castea con una subclase a una clase padre, abuelo, bis...
  System.out.println("Upcasting de "+variableEC+": desde short a float "+((float)variableEC));
  System.out.println("Upcasting de "+variableEC+": desde short a double "+((double)variableEC));
  System.out.println("Upcasting de "+variableE+": desde int a float "+((float)variableE));
  System.out.println("Upcasting de "+variableE+": desde int a double "+((double)variableE));
  System.out.println("Upcasting de "+variableEL+": desde large a float "+((float)variableEL));
  System.out.println("Upcasting de "+variableEL+": desde large a double "+((double)variableEL));
  
  
  //Ejemplo de downcasting
  //Donde se castea con una superclase a una clase hijo, nieto,bis...
  System.out.println("Downcasting de "+variableRF+": desde float a long "+((long)variableRF));
  System.out.println("Downcasting de "+variableRF+": desde float a short "+((short)variableRF));
  System.out.println("Downcasting de "+variableRF+": desde float a int "+((int)variableRF));
  System.out.println("Downcasting de "+variableRFD+": desde double a long "+((long)variableRFD));
  System.out.println("Downcasting de "+variableRFD+": desde double a short "+((short)variableRFD));
  System.out.println("Downcasting de "+variableRFD+": desde double a int "+((int)variableRFD));
  
  /*
   * En ambos casos no hablamos de Clases si no de datos primtivos
   * pero la definicion de upcasting y downcasting sigue siendo valida ya que
   * la relacion se da en la manera de representar internamente los tipos de datos
   * 
     */
  sc.close();
  }

}
