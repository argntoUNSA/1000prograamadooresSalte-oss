package modulo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader flujoentrada;
		BufferedReader teclado;
		char simbolos[],opcion;
		int indice;
		System.out.println("Inicio del programa");
		System.out.println("Ingreso al ciclo, 100");
		indice=-1;
		simbolos=new char[100]; 
		
		do {
			indice++;
			System.out.println("Ingrese el caracter, si ingresa mas solo se tomara el 1ero: ");				
			try {
				
				flujoentrada=new InputStreamReader(System.in);
				teclado=new BufferedReader(flujoentrada);
				simbolos[indice]=(char)teclado.read();
				
				System.out.println("Desea ingresar otro?: S/N");
				flujoentrada=new InputStreamReader(System.in);
				teclado=new BufferedReader(flujoentrada);
				opcion=(char)teclado.read();
				
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				System.err.println("Ingreso incorrecto, intente nuevamente");
				opcion='s';
			}
//			System.out.println("opcion elegida: "+opcion);

		}while(opcion=='s' || opcion=='S');
		System.out.println("Caracteres almacenados: ");
		for(int i=0;i<=indice;i++) {
			System.out.print("["+simbolos[i]+"]");	
		}
		
	}

}
