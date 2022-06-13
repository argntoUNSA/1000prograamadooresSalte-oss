package modulo2Clase5y6;

public class Rectangulo extends Figura{
  private double base,altura;
  public Rectangulo(double base,double altura){
    super(0,0);
    setBase(base);
    setAltura(altura);
  }
  public Rectangulo(){
    this(0,0);
  }
  public void setBase(double nuevaBase){
    this.base=nuevaBase;
  }
  public void setAltura(double nuevaAltura){
    this.altura=nuevaAltura;
  }
  public double getBase(){
    return this.base;
  }
  public double getAltura(){
    return this.altura;
  }
  public void calculaArea(){
    double area;
    area=getBase()*getAltura();
    setArea(area);
    //System.out.println("Area:"+area);
  }
  public void mostrarDatos(){
    System.out.println("Rectangulo:"
    		+ "\tBase::"+this.getBase()
    		+ "\tAltura:"+this.getAltura()
    		+ "\tPerimetro:"+this.getPerimetro()
    		+ "\tArea:"+this.getArea());
  }
  
  //Metodo usado en model.herencia;
  public void calculaPerimetro(){
	    double perimetro;
	    perimetro=getBase()*2+getAltura()*2;
	    setPerimetro(perimetro);
	    //System.out.println("Area:"+area);
	  }
  
}
