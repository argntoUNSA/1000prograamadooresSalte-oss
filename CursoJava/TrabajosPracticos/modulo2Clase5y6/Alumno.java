package modulo2Clase5y6;
import modulo2Clase3y4.Persona;
import java.util.Random;
//import java.util.Scanner;

public class Alumno extends Persona{
private int[] notas;

public Alumno(String nombre,String apellido,long dni,String domicilio,int[] notas){
  super(nombre,apellido,dni,domicilio);
  setNotas(notas);
}
public Alumno(String nombre){
  this(nombre,"",0,"",new int[3]);
}
public void generarNotas(){
  Random genera=new Random();
  int[] aux=new int[3];
  for(int i=0;i<3;i++){
    aux[i]=genera.nextInt(10)+1;
  }
  setNotas(aux);
}
public void mostrarNotas(){
  System.out.println("Informacion del alumno:");
  mostrarInfo();
  System.out.println("Notas:");
  System.out.println("Matematica:"+getNotas()[0]);
  System.out.println("Lengua:"+getNotas()[1]);
  System.out.println("Historia:"+getNotas()[2]);
}
public void setNotas(int[] nuevasNotas){
  this.notas=nuevasNotas;
}
public int[] getNotas(){
  return this.notas;
}
}
