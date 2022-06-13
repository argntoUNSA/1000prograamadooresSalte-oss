package model.herencia;

import java.util.Random;

public class TestHerenciaPerro extends TestHerencia{

  public static void main(String[] args) {
    int cantPerros,j;
    Caniche[] misCaniches=new Caniche[6];
    Salchicha[] misSalchichas=new Salchicha[6];
    
    Perro[] misPerros;
    cantPerros=0;
    for(int i=0;i<6;i++){
      misCaniches[i]=new Caniche();
      misSalchichas[i]=new Salchicha();
      
      //metodos de clase Padre
      misCaniches[i].setSexo(generaString());
      misSalchichas[i].setSexo(generaString());
      
      misCaniches[i].setNombre(generaString());
      misSalchichas[i].setNombre(generaString());
      
      misCaniches[i].setVariedad(generaVariedad());
      misSalchichas[i].setTipoPelo(generaString());
      
      cantPerros+=2;
      }
    j=0;
    misPerros=new Perro[cantPerros];
    for(int i=0;i<cantPerros;i+=2){
      misPerros[i]=misCaniches[j];
      misPerros[i+1]=misSalchichas[j];
      j++;
    }
    for(int i=0;i<cantPerros;i++){
       misPerros[i].mostrarDatos();
    }
  }
  
  public static String generaVariedad(){
    Random genera=new Random();
    String[] envasesPosibles={"Toy","Medium","Standar","Sache"};
    return envasesPosibles[genera.nextInt(envasesPosibles.length)];
    
  }
  

}
