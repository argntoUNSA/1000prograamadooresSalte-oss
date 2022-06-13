package modulo2Clase3y4;

public class AgendaTelefonica {
private int cantidadContactos,cantidadMaxima;
private Contacto[] listaContactos;

public AgendaTelefonica(int cantidadMaxima){
  setAgenda(new Contacto[cantidadMaxima]);
  setCantidadContactos(0);
  setCantidadMaxima(cantidadMaxima);
}
public AgendaTelefonica(){
  this(10);
}

public void setAgenda(Contacto[] nuevo){
  this.listaContactos=nuevo;
}
public void setCantidadMaxima(int nuevo){
  this.cantidadMaxima=nuevo;
}
public void setCantidadContactos(int nuevo){
  this.cantidadContactos=nuevo;
}
public Contacto[] getAgenda(){
  return this.listaContactos;
}
public int getCantidadMaxima(){
  return this.cantidadMaxima;
}
public int getCantidadContactos(){
  return this.cantidadContactos;
}
public boolean agendaLlena(){
  if(contactosLibres()==0)
    return true;
  else return false;
}
private boolean estaVacia(){
  return getCantidadContactos()==0;
}
private void setContacto(int posicion,Contacto nuevo){
  if(posicion>=0 && posicion<getCantidadContactos())
    this.listaContactos[posicion]=nuevo;
}
public Contacto getContacto(int posicion){
  if(!estaVacia() && posicion<getCantidadContactos() && posicion>=0) 
    return getAgenda()[posicion];
  else
    return null;
}
public void agregaContacto(Contacto nuevo){
  int indice;
    if(!agendaLlena() && !existeContacto(nuevo)){
      setCantidadContactos(getCantidadContactos()+1);
      indice=getCantidadContactos()-1;
      setContacto(indice,nuevo);      
      System.out.println("Contacto añadido");
    }
    else System.out.println("No se pudo añadir ");
}
public boolean existeContacto(Contacto contacto){
  if(buscarContacto(contacto.getNombre())==-1) return false;
  else return true;
}
private int compara(Contacto contactoA,Contacto contactoB){
  if(contactoA.esIgual(contactoB)) return 0;
  else return -1;
}
public int buscarContacto(String nombreBuscado){
  if(!estaVacia()){
    int posicion=0;
    Contacto buscado=new Contacto(nombreBuscado,"");
    while(posicion<getCantidadContactos() &&   compara(getContacto(posicion),buscado)==-1)
      posicion++;
    if(posicion<getCantidadContactos())
      return posicion;
    else
      return -1;
  }
  else{
    System.out.println("Agenda vacia");
    return -1;
  }
}
public void listarContactos(){
  if(!estaVacia()){
  for(int i=0;i<getCantidadContactos();i++){
    System.out.println("");
    System.out.print("["+i+"] ");
    System.out.print(getContacto(i).getNombre()+"\t");
    System.out.print(getContacto(i).getNroTelefono());
  }
  System.out.println();
  }
  else System.out.println("Agenda vacia");
}
public void eliminarContacto(String nombreContacto){
  if(!estaVacia()){
    int posicion,cantidad;
    posicion=buscarContacto(nombreContacto);
    cantidad=getCantidadContactos();
    if(posicion!=-1){
      for(int i=posicion;i<cantidad-1;i++){
        setContacto(i,getContacto(i+1));
      }
    setCantidadContactos(cantidad-1);
    System.out.println("Elemento eliminado");
    }
    else
      System.out.println("El elemento no esta en la lista");
  }
  else System.out.println("Agenda vacia");
}
public int contactosLibres(){
  return getCantidadMaxima()-getCantidadContactos();
}

}
