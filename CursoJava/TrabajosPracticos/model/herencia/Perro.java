package model.herencia;

public class Perro extends Animal{
private String nombre,sexo;
private double peso,altura,largo;


public Perro(String vNombre,String vSexo,double vPeso,double vAltura,double vLargo){
  this.nombre=vNombre;
  this.sexo=vSexo;
  this.peso=vPeso;
  this.altura=vAltura;
  this.largo=vLargo;
}
public Perro(String vNombre,String vSexo){
  this(vNombre,vSexo,0,0,0);
}
public Perro(){
  this("","");
  super.setNombreComun("");
  super.setNombreCientifico("");
  
}
public String getNombre(){return this.nombre;}
public String getSexo(){return this.sexo;}
public double getPeso(){return this.peso;}
public double getAltura(){return this.altura;}
public double getLargo(){return this.largo;}
public void setNombre(String nuevoNombre){this.nombre=nuevoNombre;}
public void setSexo(String nuevoSexo){this.sexo=nuevoSexo;}
public void setPeso(double nuevoPeso){this.peso=nuevoPeso;}
public void setAltura(double nuevaAltura){this.altura=nuevaAltura;}
public void setLargo(double nuevoLargo){this.largo=nuevoLargo;}

public void mostrarDatos(){
  System.out.println("Nombre:/t"+this.getNombre());
  System.out.println("\tSexo:/t"+this.getSexo());
  System.out.println("\tPeso:/t"+this.getPeso());
  System.out.println("\tSexo:/t"+this.getSexo());
}
//metodo usado en model.herencia.TestHerenciaAnimal;
public Perro(String vNombre,String vNombreCientiico,int vEdad) {
	super(vNombre,vNombreCientiico,vEdad);
}
}
