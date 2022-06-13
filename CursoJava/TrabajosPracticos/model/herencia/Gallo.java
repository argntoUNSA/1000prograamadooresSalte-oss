package model.herencia;

public class Gallo extends Animal{
public Gallo(String vNombreComun,String vNombreCientifico,int vEdad){
    super(vNombreComun,vNombreCientifico,vEdad);
  }
  public Gallo(){
    this("","",0);
  }
  
  
  public void grita(){
    System.out.println("Kikiriki. Soy un/a gallo/a");
  }
  
}
