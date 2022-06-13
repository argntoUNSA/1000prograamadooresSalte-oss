package modulo2Clase5y6;
//import java.util.Scanner;
import java.util.Random;
public class TestFruta {

  public static void main(String[] args) {
    Fruta[] listaFrutas;
    Random genera=new Random();
    //Scanner scan=new Scanner(System.in);
    int cantidad;
    //double peso;
    
    cantidad=genera.nextInt(100)+1;
    listaFrutas=new Fruta[cantidad];
    System.out.println("Tipo\tPeso\t%del peso");
    for(int i=0;i<cantidad;i++){
      listaFrutas[i]=creaFruta();
      System.out.print(listaFrutas[i].getClass().getSimpleName()+"\t");
      System.out.print(listaFrutas[i].getPeso()+"\t");
      System.out.println(listaFrutas[i].hacerJugo());
    }
    
    
  }
  public static Fruta creaFruta(){
    Fruta auxiliar;
    Random genera=new Random();
    double peso=genera.nextDouble()*100;
    int opcion=genera.nextInt(3)+1;
    switch(opcion){
      case 1:{
        auxiliar=new Manzana(peso);
        break;
      }
      case 2:{
        auxiliar=new Pera(peso);
        break;
      }
      case 3:{
        auxiliar=new Naranja(peso);
        break;
      }
      default: auxiliar=null;
    }
    return auxiliar;
  }

}
