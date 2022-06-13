package modulo2Clase3y4;

public class Contacto {
private String nombre,nroTelefono;

public Contacto(String Nombre,String Telefono){
  setNombre(Nombre);
  setNroTelefono(Telefono);
}
public Contacto(){
  this("","");
}

public void setNombre(String nuevo){
  this.nombre=nuevo;
}
public void setNroTelefono(String nuevo){
  this.nroTelefono=nuevo;
}
public String getNombre(){
  return this.nombre;
}
public String getNroTelefono(){
  return this.nroTelefono;
}
public boolean esIgual(Contacto otro){
  if(getNombre().compareTo(otro.getNombre())==0){
    return true;
  }
 else return false;
}
}
