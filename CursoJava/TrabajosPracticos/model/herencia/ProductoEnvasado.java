package model.herencia;

public class ProductoEnvasado extends ProductoAmpliado{
private String tipoEnvasado;

public ProductoEnvasado(String id,String nombre,double precio,double peso,String tipo){
  super(id,"",precio,0,nombre);
  this.tipoEnvasado=tipo;
}
public ProductoEnvasado(String id,String tipo){
  this(id,"",0,0,tipo);
}
public ProductoEnvasado(){
  this("","");
}
public void setTipoEnvasado(String nuevoTipo){
  this.tipoEnvasado=nuevoTipo;
}

public String getTipoEnvasado(){
  return this.tipoEnvasado;
}
public void mostrarDatos(){
  super.mostrarDatos();
  System.out.println("Tipo\t:"+getTipoEnvasado());
}

}

