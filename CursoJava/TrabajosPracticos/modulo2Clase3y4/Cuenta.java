package modulo2Clase3y4;

public class Cuenta {
private Persona titular;
private double cantidad;

public Cuenta(Persona titular,double cantidad){
  setTitular(titular);
  setCantidad(cantidad);
}
public Cuenta(Persona titular){
  setTitular(titular);
  setCantidad(0);
}
public double getCantidad(){
  return this.cantidad;
}
public Persona getTitular(){
  return this.titular;
}
public void setCantidad(double nuevo){
  this.cantidad=nuevo;
}
public void setTitular(Persona nuevo){
  this.titular=nuevo;
}
public void mostrar(){
  String cadena="";
  System.out.println("Datos del titular:\n");
  getTitular().mostrarInfo();
  System.out.println("Cantidad:\n"+getCantidad());
  System.out.println(cadena);
}
public void ingresar(double importe){
  if(importe>0)
    setCantidad(getCantidad()+importe);
}
public void retirar(double importe){
  setCantidad(getCantidad()-importe);
}

}
