package model.herencia;

public class ProductoLacteo extends ProductoAmpliado{
private double cantLeche,temperaturaRef;

public ProductoLacteo(String id,String nombre,double precio,double peso,double cantLeche,double temperarura){
  super(id,"",precio,0,nombre);
  this.setCantLeche(cantLeche);
  this.setTemperaturaRef(temperarura);
}
public ProductoLacteo(String id,double cantLeche,double temperatura){
  this(id,"",0,0,cantLeche,temperatura);
}
public ProductoLacteo(){
  this("",0,0);
}
public void setCantLeche(double nuevaCant){
  this.cantLeche=nuevaCant;
}
public void setTemperaturaRef(double nuevaTemp){
  this.temperaturaRef=nuevaTemp;
}
public double getCantLeche(){
  return this.cantLeche;
}
public double getTemperaturaRef(){
  return this.temperaturaRef;
}
public void mostrarDatos(){
  super.mostrarDatos();
  System.out.print("Cant:\t"+getCantLeche());
  System.out.println("Temp:\t"+getTemperaturaRef());
}
}
