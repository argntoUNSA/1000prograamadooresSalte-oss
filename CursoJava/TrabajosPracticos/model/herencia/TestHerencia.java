package model.herencia;

import java.util.Random;

public class TestHerencia {
	
	public static String generaString(){
		   Random genera=new Random();
		   String letrasPosibles;
		   StringBuilder sb=new StringBuilder(); letrasPosibles="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
		    for(int i=0;i<6;i++){
		      sb.append(letrasPosibles.charAt(genera.nextInt(54)));
		    }
		    
		    return sb.toString();
		  
		  }
	public static int generaInt(int limiteMin,int limiteMax) {
		Random genera=new Random();
		return (genera.nextInt(limiteMax - limiteMin))+limiteMin+1;
		}
	public static Long generaLong(){
	    Random genera=new Random();
	    
	    return genera.nextLong();
	    
	  }
	public static String generaId() {
		   Random genera=new Random();
		   String letrasPosibles;
		   StringBuilder sb=new StringBuilder(); letrasPosibles="0123456789";
		    for(int i=0;i<6;i++){
		      sb.append(letrasPosibles.charAt(genera.nextInt(10)));
		    }
		    
		    return sb.toString();
		  
		  }
	public static double generaDouble(){
	    Random genera=new Random();
	    
	    return genera.nextDouble();
	    
	  }

}
