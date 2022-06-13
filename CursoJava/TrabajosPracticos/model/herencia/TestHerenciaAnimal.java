package model.herencia;
import java.util.Random;

public class TestHerenciaAnimal {

  static public void main(String args[]) {
   Animal[] misAnimales;
   Animal miAnimal;
   Random genera=new Random();
   //Perro miPerro;
   //Gallo miGallo;
   //Gato miGato;
   misAnimales=new Animal[10];
   for(int i=0;i<10;i++){
     switch(genera.nextInt(2)+1){
       case 1:{
         miAnimal=new Perro();
         miAnimal.setNombreComun(generaString());
         miAnimal.setEdad(genera.nextInt(25));
         misAnimales[i]=miAnimal;
         break;
       }
       case 2:{
         
         miAnimal=new Gato(generaString(),generaString(),genera.nextInt(25));
         misAnimales[i]=miAnimal;
         break;  
       }
       case 3:{
         miAnimal=new Gallo(generaString(),generaString(),genera.nextInt(25));
         misAnimales[i]=miAnimal;
         break;
       }
       
     }
     
   }
   
   for(int i=0;i<10;i++){
     misAnimales[i].grita();
   }
   
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

}
