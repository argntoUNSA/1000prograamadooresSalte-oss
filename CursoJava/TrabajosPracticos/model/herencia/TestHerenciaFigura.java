package model.herencia;
import modulo2Clase5y6.*;

public class TestHerenciaFigura extends TestHerencia{
  public static void main(String[] args){
    Figura[] misFiguras;
    Circulo miCirculo;
    Rectangulo miRectangulo;
    Triangulo miTriangulo;
    int cantFiguras;
    
    cantFiguras=10;
    misFiguras=new Figura[cantFiguras];
    for(int i=0;i<5;i++){
      miCirculo=new Circulo();
      miRectangulo=new Rectangulo();
      miTriangulo=new Triangulo();
      
      miCirculo.setRadio(generaDouble()*100);
      
      miRectangulo.setBase(generaDouble()*100);
      miRectangulo.setAltura(generaDouble()*100);
      
      miTriangulo.setBase(generaDouble()*100);
      miTriangulo.setAltura(generaDouble()*100);
      
      miCirculo.calculaArea();
      miRectangulo.calculaArea();
      miTriangulo.calculaArea();
      
      miCirculo.calculaPerimetro();
      miRectangulo.calculaPerimetro();
      miTriangulo.calculaPerimetro();
      
      misFiguras[cantFiguras]=miCirculo;
      cantFiguras++;
      misFiguras[cantFiguras]=miRectangulo;
      cantFiguras++;
      misFiguras[cantFiguras]=miTriangulo;
      cantFiguras++;
      
    }
    for(int i=0;i<cantFiguras;i++){
      misFiguras[i].mostrarDatos();
    }
    
  }

}
