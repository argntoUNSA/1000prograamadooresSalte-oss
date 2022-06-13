package modulo2Clase3y4;

public class ProductoAmpliado extends Producto{
private String id,categoria;
private int stock;

public ProductoAmpliado(String id,String categoria,double precio,int stock,String nombre){
  super(nombre,precio,"");  
  setId(id);
  setCategoria(categoria);
  setStock(stock);
}
public ProductoAmpliado(String categoria,double precio,int stock){
  this("",categoria,precio,stock,"");
}
public ProductoAmpliado(){
  this("",0,0);
}
public void setId(String nuevoId){
  this.id=nuevoId;
}
public void setCategoria(String nuevaCategoria){
  this.categoria=nuevaCategoria;
}
public void setStock(int nuevoStock){
  this.stock=nuevoStock;
}
public String getId(){
  return this.id;
}
public String getCategoria(){
  return this.categoria;
}
public int getStock(){
  return this.stock;
}

public boolean validarStock(){
  if(getStock()>0) return true;
  else return false;
}
public void vender(String categoria,int unidades){
  int auxiliar;
  if(validarStock() && getCategoria()==categoria){
    auxiliar=getStock()-unidades;
    if(auxiliar>=0){
      setStock(auxiliar);
      System.out.println("Se realizo la venta");
    }
    else
      System.out.println("No hay stock suficiente");
  }
  else if(getCategoria()==categoria)
    System.out.println("No hay stock");
  else System.out.println("No son de la misma categoria");
}
public void comprar(String categoria,int unidades){
  if(getCategoria()==categoria && getStock()<100){
    setStock(getStock()+unidades);
    System.out.println("Compra realizada");
    System.out.println("Se muestran los datos del producto:");
    mostrarDatos();
  }
  else if(getCategoria()==categoria)
    System.out.println("No hay stock minimo");
  else System.out.println("No son de la misma categoria");
  
}
public void mostrarDatos(){
  System.out.println("id\t:"+getId());
  System.out.println("Nombre\t:"+getNombre());
  System.out.println("Categoria\t:"+getCategoria());
  
  System.out.println("Precio\t:"+getPrecio());
  System.out.println("Stock:"+getStock());
}
}
