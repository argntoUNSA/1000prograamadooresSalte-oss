package model.herencia;
import java.util.Random;
public class TestHerenciaProducto{
  public static void main(String[] args){
    System.out.println("Inicio del programa");
    //Variables Principales
    ProductoLacteo[] misPL;
    ProductoEnvasado[] misPE;
    
    //Variables Auxiliares
    //Random genera=new Random();   
 
    misPL=new ProductoLacteo[6];
    misPE=new ProductoEnvasado[6];  
    
    for(int i=0;i<6;i++){
      misPL[i]=new ProductoLacteo();
      misPE[i]=new ProductoEnvasado();
      
      //metodos de clase Padre
      misPL[i].setId(generaId());
      misPE[i].setId(generaId());
      
      misPL[i].setNombre(generaString());
      misPE[i].setNombre(generaString());
      
      misPL[i].setCategoria(generaId()+generaString());
      misPE[i].setCategoria(generaId()+generaString());
      //metodos de clase hijo
      //hijo1
      misPL[i].setCantLeche(10*generaDouble());
      misPL[i].setTemperaturaRef((-10)*generaDouble());
      //hijo2
      misPE[i].setTipoEnvasado(generaTipo());
      
      
      //muestra los productos en cada iteracion
      misPL[i].mostrarDatos();
      System.out.println();
      misPE[i].mostrarDatos();
      System.out.println();
    }
    System.out.println("Fin del programa");
  }
  
  public static String generaId(){
   Random genera=new Random();
   String letrasPosibles;
   StringBuilder sb=new StringBuilder(); letrasPosibles="0123456789";
    for(int i=0;i<6;i++){
      sb.append(letrasPosibles.charAt(genera.nextInt(10)));
    }
    return sb.toString();
  }
  
  public static String generaString(){
   Random genera=new Random();
   String letrasPosibles;
   StringBuilder sb=new StringBuilder(); letrasPosibles="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
    for(int i=0;i<6;i++){
      sb.append(letrasPosibles.charAt(genera.nextInt(54)));
    }
    return sb.toString();
  
  }
  public static double generaDouble(){
    Random genera=new Random();
    return genera.nextDouble();
  }
  public static String generaTipo(){
    Random genera=new Random();
    String[] envasesPosibles={"Bolsa","Caja","Lata","Sache"};
    return envasesPosibles[genera.nextInt(envasesPosibles.length)];
    
  }
}