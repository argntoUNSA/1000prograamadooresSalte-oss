package modulo2Clase3y4;

public class TestCuenta {

  public static void main(String[] args) {
    Cuenta c1=new Cuenta(new Persona("Nombre1","Apellido1",12345,"Domicilio1"));
    Cuenta c2=new Cuenta(new Persona("Nombre2","Apellido2",678910,"Domicilio2"),120000);
    
    System.out.println("Cuentas originales");
    c1.mostrar();
    c2.mostrar();
    while (c1.getCantidad()*c2.getCantidad()>=0){
    c1.ingresar(5000);
    c2.retirar(13000);
    }
    
    System.out.println("Cuentas alteradas");
    c1.mostrar();
    c2.mostrar();
  }

}
