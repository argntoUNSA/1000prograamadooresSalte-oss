package modulo2Clase1y2;

public class TestEj2C5y6 {

  public static void main(String[] args) {
    Serie s1=new Serie("Los Simuladores","Ficcion","Szifron",2);
    s1.mostrarTodo();
    
    
    
    s1.cambiarTodo("Los Simpsons","Comedia","Matt Groening",35);
    System.out.println("Se realizaron los cambios");
    s1.mostrarTodo();
  }

}
