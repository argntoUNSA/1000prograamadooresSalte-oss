package model.herencia;

public class Salchicha extends Perro{
private String tipoPelo;

public Salchicha(String vNombre,String vSexo,double vPeso,double vAltura,double vLargo,String vTipoPelo){
  super(vNombre,vSexo,vPeso,vAltura,vLargo);
  this.tipoPelo=vTipoPelo;
}
public Salchicha(String vNombre,String vTipoPelo){
  this(vNombre,"",0,0,0,vTipoPelo);
}
public Salchicha(){
  this("","");
}

public String getTipoPelo(){return this.tipoPelo;}
public void setTipoPelo(String nuevoTipoPelo){
  this.tipoPelo=nuevoTipoPelo;
}
}
