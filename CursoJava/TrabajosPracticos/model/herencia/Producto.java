
package model.herencia;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Producto {

private String nombre,vencimiento;
private double precio;


public Producto(String Nombre,double Precio,String Vencimiento){
  setNombre(Nombre);
  setPrecio(Precio);
  setVencimiento(Vencimiento);
}
public Producto(){
  this("",-1,"");
}

public void setNombre(String nuevoNombre){
  this.nombre=nuevoNombre;
}
public void setPrecio(double nuevoPrecio){
  this.precio=nuevoPrecio;
}
public void setVencimiento(String nuevoVencimiento){
  this.vencimiento=nuevoVencimiento;
}
public String getNombre(){
  return this.nombre;
}
public double getPrecio(){
  return this.precio;
}
public String getVencimiento(){
  return this.vencimiento;
}
public boolean esPerecedero(){
  if(getVencimiento().compareTo("N")==0)
    return false;
  else return true;
}
public double calcula(int cantidad){
  double precioActual;
  LocalDate fechaVencimiento,fechaActual;
  int diferente;
  Period periodo;
  
  if(esPerecedero()){
  fechaVencimiento=LocalDate.parse(getVencimiento(),DateTimeFormatter.ISO_LOCAL_DATE);
    fechaActual=LocalDate.now(); diferente=fechaActual.compareTo(fechaVencimiento);
    precioActual=0;
    System.out.println("Diferente:"+diferente);
    if(diferente>=0){
      precioActual=-1;//Producto caducado
    }
    else{
      periodo=Period.between(fechaActual,fechaVencimiento);
      diferente=periodo.getDays();
      switch(diferente){
        case 1:{
          precioActual=calculoNormal(cantidad)/4;
          break;
        }
        case 2:{
          precioActual=calculoNormal(cantidad)/3;
          break;
        }
        case 3:{
          precioActual=calculoNormal(cantidad)/2;
          break;
        }
        default:{
          precioActual=calculoNormal(cantidad);
        }
      }
    }
  }
  else{
    precioActual=calculoNormal(cantidad);
  }
  return precioActual;
}
public double calculoNormal(int Cantidad){
  return getPrecio()*Cantidad;
}

}
