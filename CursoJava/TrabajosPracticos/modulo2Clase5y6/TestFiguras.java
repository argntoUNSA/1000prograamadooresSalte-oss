package modulo2Clase5y6;
import java.util.Scanner;
import java.util.Random;
public class TestFiguras {

  public static void main(String[] args) {
    Figura[] listaFiguras;
    Scanner scan=new Scanner(System.in);
    int cantidad;
    
    //Syso
    System.out.println("Ingrese Cantidad de figuras a crear:");
    cantidad=scan.nextInt();
    listaFiguras=new Figura[cantidad];
    for(int i=0;i<cantidad;i++){
      listaFiguras[i]=creaFigura();
      listaFiguras[i].calculaArea();
    }
    scan.close();
    for(int i=0;i<cantidad;i++){
      listaFiguras[i].mostrarDatos();
    }
  }
  public static Figura creaFigura(){
    Random genera=new Random();
    Figura auxiliar;
    int opcion=genera.nextInt(90)+1;
    if(opcion<=30){
      auxiliar=new Circulo(genera.nextDouble()*100);
    }
    else if(opcion<=60){
      auxiliar=new Triangulo(genera.nextDouble()*100,genera.nextDouble()*100);
    }
    else{
     auxiliar=new Rectangulo(genera.nextDouble()*100,genera.nextDouble()*100);
    }
    return auxiliar;
  }

}
