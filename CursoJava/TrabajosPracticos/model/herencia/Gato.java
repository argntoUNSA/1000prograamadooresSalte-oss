package model.herencia;

public class Gato extends Animal{
  
  public Gato(String vNombreComun,String vNombreCientifico,int vEdad){
    super(vNombreComun,vNombreCientifico,vEdad);
  }
  public Gato(){
    this("","",0);
  }
  
  
  public void grita(){
    System.out.println("Miau. Soy un/a gato/a");
  }
  
  
}
