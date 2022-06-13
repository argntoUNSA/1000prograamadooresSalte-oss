package modulo2Clase3y4;

public class Empleado extends Persona{
private int horasTrabajadas;
private double sueldoBasico;

public Empleado(){
  super("","",0,"");
  setHorasTrabajadas(0);
  setSueldoBasico(0);
}
public Empleado(String Nombre,String Apellido, long DNI,String Domicilio, int HorasTrabajadas,double SueldoBasico){
  super(Nombre,Apellido,DNI,Domicilio);
  setHorasTrabajadas(HorasTrabajadas);
  setSueldoBasico(SueldoBasico);
}
public void setHorasTrabajadas(int nuevo){
  this.horasTrabajadas=nuevo;
}
public void setSueldoBasico(double nuevo){
  this.sueldoBasico=nuevo;
}
public int getHorasTrabajadas(){
  return this.horasTrabajadas;
}
public double getSueldoBasico(){
  return this.sueldoBasico;
}

public double calculoSueldo(){
  return getSueldoBasico()*getHorasTrabajadas();
}
public void verEmpleado(){
  System.out.println("Informacion del Empleado:");
  mostrarInfo();
  System.out.println("Horas trabajadas:"+getHorasTrabajadas());
  System.out.println("Sueldo Basico:"+getSueldoBasico());
  System.out.println("Sueldo Total:"+calculoSueldo());
   
}
}
