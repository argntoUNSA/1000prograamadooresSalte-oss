package modulo2Clase5y6;

public class Circulo extends Figura{
  private double radio;
  public Circulo(double radio){
    super(0,0);
    setRadio(radio);
  }
  public Circulo(){
    this(0);
  }
  public void setRadio(double nuevoRadio){
    this.radio=nuevoRadio;
  }
  public double getRadio(){
    return this.radio;
  }
  public void calculaArea(){
    double area;
    area=Math.PI*Math.pow(getRadio(),2);
    setArea(area);
    //System.out.println("Area:"+area);
  }
  public void muestraArea(){
    System.out.println("Circulo de radio r="+getRadio());
    System.out.println("Area:"+getArea());
  }
  
  //Metodo utilizado para otro contexto
  public void calculaPerimetro(){
	    double perimetro;
	   perimetro=Math.PI*Math.pow(getRadio(),2);
	    setArea(perimetro);
	  }
  
  
}
