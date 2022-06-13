package modulo2Clase5y6;

public abstract class Figura {
private double area,perimetro;
public Figura(double area,double perimetro){
  setArea(area);
  setPerimetro(area);
}
public Figura(){
  this(0,0);
}
public void setArea(double nuevaArea){
  this.area=nuevaArea;
}
public void setPerimetro(double nuevoPerimetro){
  this.perimetro=nuevoPerimetro;
}
public double getArea(){
  return this.area;
}
public double getPerimetro(){
  return this.perimetro;
}
public void calculaArea() {
	this.area=0;
}
public void mostrarDatos() {
System.out.println();
}
}
