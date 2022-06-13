package model.herencia;

public class Caniche extends Perro{
private String variedad;

public Caniche(String vNombre,String vVariedad){
  super(vNombre,"");
  setVariedad(vVariedad);
}
public Caniche(){
  this("","");
}
public String getVariedad(){return this.variedad;}
public void setVariedad(String nuevaVariedad){
  this.variedad=nuevaVariedad;
}
}
