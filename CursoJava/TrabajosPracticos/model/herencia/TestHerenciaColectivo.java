package model.herencia;
import model.herencia.TestHerencia;

public class TestHerenciaColectivo extends TestHerencia{

	public static void main(String[] args){
		int cantMax,cantColes;
		Colectivo[] misColectivos;
		ColectivoMedia miColeM=new ColectivoMedia();
		ColectivoLarga miColeL=new ColectivoLarga();
		
		cantMax=100;
		cantColes=0;
		misColectivos=new Colectivo[cantMax];
		
		for(int i=0;i<5;i++) {
			miColeM.setId(generaId());
			miColeL.setId(generaId());
			
			miColeM.setCantRuedas(generaInt(4,6));
			miColeL.setCantRuedas(generaInt(6,8));
			

			miColeM.setCantAsientos(generaInt(20,25));
			miColeL.setCantAsientos(generaInt(25,30));
			
			miColeM.setCantPasajeros(generaInt(20,25));
			miColeL.setCantPasajeros(generaInt(25,30));
			
			
			miColeL.setCapacidad(generaInt(25,30));
			
			misColectivos[cantColes]=miColeM;
			cantColes++;
			misColectivos[cantColes]=miColeL;
			cantColes++;
			}
		for(int i=0;i<cantColes;i++) {
			misColectivos[i].muestraDatos();
		}
	}

}
