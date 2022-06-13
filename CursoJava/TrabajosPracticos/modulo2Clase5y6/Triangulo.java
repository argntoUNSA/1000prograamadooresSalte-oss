package modulo2Clase5y6;

public class Triangulo extends Figura{
	private double lado;
  private double base,altura;
    public Triangulo(double base,double altura){
    super(0,0);
    setBase(base);
    setAltura(altura);
    
  }
  public Triangulo(){
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
    area=(getBase()*getAltura())/2;
    setArea(area);
    //System.out.println("Area:"+area);
  }
  public void mostrarDatos(){
	    System.out.println("Triangulo Equilatero:"
	    		+ "\tBase::"+this.getBase()
	    		+ "\tAltura:"+this.getAltura()
	    		+ "\tPerimetro:"+this.getPerimetro()
	    		+ "\tArea:"+this.getArea());
	  }
  
  //Metodo usado para model.herencia.Figura, Se presupone equilatero
//  public Triangulo(double vLado) {
//	  this();
//	  this.lado=vLado;
//  }
  
  public void calculaPerimetro(){
	    double perimetro;
	    this.setLado(this.getBase());
	    perimetro=this.getLado()*3;
	    setPerimetro(perimetro);
	    //System.out.println("Area:"+area);
	  }
public double getLado() {
	return this.lado;
}
public void setLado(double vLado){
	this.lado=vLado;
}
}
