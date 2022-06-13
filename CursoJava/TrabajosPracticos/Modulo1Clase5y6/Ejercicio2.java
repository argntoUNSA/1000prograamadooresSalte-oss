package CursoJavaModulo1Clase5y6;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2{

  public static void main(String[] args) {
    ArrayList<Double> listaPesos = new ArrayList<Double>(20);
    
    ingresaLista(listaPesos);
    muestraMenor(listaPesos);
    muestraMayor(listaPesos);
    muestraMedio(listaPesos);
    mostrarMensaje(listaPesos);
    
  }
  public static void ingresaLista(ArrayList<Double> lista){
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese sus 20 pesos (kg)");
    for(int i=0;i<20;i++){
      System.out.print("["+(i+1)+"]: ");
      lista.add(scan.nextDouble());
      System.out.println();
    }
    scan.close();
  }
  
  
  public static void muestraMenor(ArrayList<Double> lista){
    double men,otro;
    int tam=lista.size();
    if(tam>0){
      men=lista.get(0);
      for(int i=1;i<tam;i++){
        otro=lista.get(i);
        if(otro<men) men=otro;
      }
      System.out.println("El menor peso ingresado es: "+men);
    }
    else System.out.println("La lista esta vacia");
  }
  
  
  
  public static void muestraMayor(ArrayList<Double> lista){
    double may,otro;
    int tam=lista.size();
    if(tam>0){
      may=lista.get(0);
      for(int i=1;i<tam;i++){
        otro=lista.get(i);
        if(may<otro) may=otro;
      }
      System.out.println("El mayor peso ingresado es: "+may);
    }
    else System.out.println("La lista esta vacia");
  }
  
  
  public static void muestraMedio(ArrayList<Double> lista){
    double acum,promedio;
    int tam=lista.size();
    acum=0;
    if(tam>0){
      for(int i=0;i<tam;i++){
        acum+=lista.get(i);
      }
      promedio=acum/tam;
      System.out.println("El peso promedio es: "+promedio);
      
    }
    else System.out.println("La lista esta vacia"); 
  }
  
  public static void mostrarMensaje(ArrayList<Double> lista){
    int tam=lista.size();
    double peso;
    if(tam>0){
      System.out.println("Se buscaran pesos mayores a 100kg: ");
      System.out.println("Se inicia la busqueda: ");
      for(int i=0;i<tam;i++){
        peso=lista.get(i);
        if(peso>100) System.out.println("posicion: "+i+" peso: "+peso);
      }
      System.out.println("Se finaliza la busqueda: ");
    }
    else System.out.println("Lista vacia");
    
    
    
  
  }
}
