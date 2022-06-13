package modulo2Clase1y2;

public class Persona {
private String nombre,apellido,domicilio;
private long dni;

public Persona(String nombre, String apellido, long dni, String domicilio){
  this.nombre=nombre;
  this.apellido=apellido;
  this.dni=dni;
  this.domicilio=domicilio;
}
public void mostrarInfo(){
  System.out.println("Nombre:"+getNombre());
  System.out.println("Apellido:"+getApellido());
  System.out.println("DNI:"+getDNI());
  System.out.println("Domicilio:"+getDomicilio());
  
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
}
