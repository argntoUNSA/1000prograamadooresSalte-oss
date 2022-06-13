package modulo2Clase1y2;

public class Contador {
private int cont;
public Contador(){
  setValor(0);
}
public Contador(int nuevo){
  if(nuevo<=0)
    setValor(0);
  else
    setValor(nuevo);
}
public Contador(Contador contador){
  setValor(contador.getValor());
}

public void setValor(int nuevo){
  this.cont=nuevo;
}
public int getValor(){
  return this.cont;
}
public void incrementar(){
  setValor(getValor()+1);
}
public void decrementar(){
  if(getValor()>0) 
    setValor(getValor()-1);
}
}
