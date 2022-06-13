package modulo2Clase1y2;

public class TestEj4C5y6 {

  public static void main(String[] args) {
    Contador c1=new Contador(12);
    Contador c2=new Contador();
    Contador c3=new Contador(c1);
    
    System.out.println("Los valores iniciales son:");
    System.out.println("contador1:"+c1.getValor());
    System.out.println("contador2:"+c2.getValor());
    System.out.println("contador3:"+c3.getValor());
    
    for(int i=0;i<10;i++){
      c2.incrementar();
      c1.decrementar();
    }
    
    System.out.println("Los valores finales son:");
    System.out.println("contador1:"+c1.getValor());
    System.out.println("contador2:"+c2.getValor());
    System.out.println("contador3:"+c3.getValor());
  }

}
