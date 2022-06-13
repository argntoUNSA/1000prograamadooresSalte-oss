package modulo2Clase3y4;

public class Raices {
private double a,b,c;

public Raices(double a,double b,double c){
  setA(a);
  setB(b);
  setC(c);
}
public void setA(double nuevo){
  this.a=nuevo;
}
public void setB(double nuevo){
  this.b=nuevo;
}
public void setC(double nuevo){
  this.c=nuevo;
}
public double getA(){
  return this.a;
}
public double getB(){
  return this.b;
}
public double getC(){
  return this.c;
}
public double getDeterminante(){
  double d=Math.pow(getB(),2)-4*getA()*getC();
  return d;
  
}
public boolean tieneRaices(){
  if(getDeterminante()>0) return true;
  else return false;
}
public void obtenerRaices(){
  double raiz1,raiz2;
    raiz1=(-getB()+getDeterminante())/(2*getA());
    raiz2=(-getB()-getDeterminante())/(2*getA());
    System.out.print("x1="+raiz1);
    System.out.print("\tx2="+raiz2);
  
}
public boolean tieneRaiz(){
  if(getDeterminante()==0) return true;
  else return false;
}
public void obtenerRaiz(){
  double raiz;
  raiz=(-1/2)*(getB()/getA());
  System.out.println("x="+raiz);
}
public void calcula(){
  if(tieneRaiz()){
    System.out.println("Existe una unica raiz");
    obtenerRaiz();
  }
  else if(tieneRaices()) {
    System.out.println("Existen 2 raices diferentes");
    obtenerRaices();
  }
  else{
    System.out.println("No existe solucion en los reales");
  }
}
public void muestraEcuacion(){
  String cadena=getA()+"x^2";
  if(getB()>0)
    cadena="+"+cadena+"x";
  else
    cadena+=cadena+"x";
  if(getC()>0)
    cadena="+"+cadena+"x";
  else
    cadena+=cadena+"x";
}

}
