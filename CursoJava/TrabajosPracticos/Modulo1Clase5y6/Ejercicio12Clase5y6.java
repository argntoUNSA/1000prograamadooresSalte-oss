package CursoJavaModulo1Clase5y6;
import java.util.Scanner;
public class Ejercicio12Clase5y6 {

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    float[] notasAlumno=new float[4];
    float promedio;
    System.out.println("Ingrese las 4 notas del alumno:");
    for(int i=0;i<4;i++){
      System.out.print("["+i+"]"+":");
      notasAlumno[i]=scan.nextFloat();
    }
    scan.close();
    System.out.println("Ya fueron ingresadas las 4 notas");
    System.out.println("Las notas son:");
    muestraNotas(notasAlumno);
    promedio=promedioNotas(notasAlumno);
    System.out.println("La nota promedio:"+promedio);
    
  }
  public static float promedioNotas(float[] notas){
    int tam;
    float acum,promedio;
    acum=0;
    tam=notas.length;
    for(int i=0;i<tam;i++){
      acum+=notas[i];
    }
    promedio=acum/tam;
    return promedio;
    
  }
   public static void muestraNotas(float [] notas){
    int tam=notas.length;
     for(int i=0;i<tam;i++)
        System.out.print("["+notas[i]+"]");
    System.out.println();
  }

}
