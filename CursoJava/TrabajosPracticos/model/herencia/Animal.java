package model.herencia;

public class Animal {

private String nombreCientifico,nombreComun;
private int edad;

public Animal(String vNombreComun,String vNombreCientifico,int vEdad){
  this.nombreComun=vNombreComun;
  this.nombreCientifico=vNombreCientifico;
  this.edad=vEdad;
}
public Animal(){
  this("","",0);
}

public void setNombreComun(String nuevoNombre){
  this.nombreComun=nuevoNombre;
}
public void setNombreCientifico(String nuevoNombre){
  this.nombreCientifico=nuevoNombre;
}
public void setEdad(int nuevaEdad){
  this.edad=nuevaEdad;
}
public String getNombreComun(){
  return this.nombreComun;
}
public String getNombreCientifico(){
  return this.nombreCientifico;
}
public int getEdad(){
  return this.edad;
}
public void grita(){
  System.out.println("soy animal");
}


}
