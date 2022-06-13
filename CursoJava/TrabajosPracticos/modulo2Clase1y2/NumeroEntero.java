package modulo2Clase1y2;

public class NumeroEntero {
private long valor;

public NumeroEntero(long valor){
  setValor(valor);
}
public void setValor(long nuevo){
  this.valor=nuevo;
}
public long getValor(){
  return this.valor;
}
public long suma(NumeroEntero otro){
  return getValor()+otro.getValor();
}
public long resta(NumeroEntero otro){
  return getValor()-otro.getValor();
}
public long multiplicacion(NumeroEntero otro){
  return getValor()*otro.getValor();
}
public long division(NumeroEntero otro){
  if(otro.getValor()!=0)
    return getValor()/otro.getValor();
  else return 0;
}
}
