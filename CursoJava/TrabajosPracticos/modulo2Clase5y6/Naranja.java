package modulo2Clase5y6;

public class Naranja extends Fruta{
  public Naranja(double peso){
    super(peso);
  }
  public double hacerJugo(){
    return getPeso()*(0.8);
  }
}
