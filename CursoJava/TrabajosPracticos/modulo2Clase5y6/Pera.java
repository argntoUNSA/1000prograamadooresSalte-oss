package modulo2Clase5y6;

public class Pera extends Fruta{
  public Pera(double peso){
    super(peso);
  }
  public double hacerJugo(){
    return getPeso()*(0.6);
  }
}
