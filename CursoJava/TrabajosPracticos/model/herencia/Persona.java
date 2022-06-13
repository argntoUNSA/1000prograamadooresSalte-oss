package model.herencia;

public class Persona{

private String nombre,apellido,domicilio,genero;
private long dni;

public Persona(String nombre, String apellido, long dni, String domicilio,String genero){
  this.nombre=nombre;
  this.apellido=apellido;
  this.dni=dni;
  this.domicilio=domicilio;
  this.genero=genero;
}
public String getNombre(){
  return this.nombre;
}
public String getApellido(){
  return this.apellido;
}
public long getDNI(){
  return this.dni;
}
public String getDomicilio(){
  return this.domicilio;
}
public String getGenero(){
  return this.genero;
}
public void setNombre(String nuevo){
  this.nombre=nuevo;
}
public void setApellido(String nuevo){
  this.apellido=nuevo;
}
public void setDNI(long nuevo){
  this.dni=nuevo;
}
public void setDomicilio(String nuevo){
  this.domicilio=nuevo;
}
public void setGenero(String nuevo){
  this.genero=nuevo;
}

public void mostrarDatos(){
  System.out.println("Nombre:\t"+getNombre());
  System.out.println("Apellido:\t"+getApellido());
  System.out.println("DNI:\t"+getDNI());
  System.out.println("Domicilio:\t"+getDomicilio());
}

}
