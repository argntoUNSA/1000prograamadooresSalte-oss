package modulo2Clase5y6;

public class Manzana extends Fruta{
  public Manzana(double peso){
    super(peso);
  }
  public double hacerJugo(){
    return getPeso()*(0.30);
  }
}
