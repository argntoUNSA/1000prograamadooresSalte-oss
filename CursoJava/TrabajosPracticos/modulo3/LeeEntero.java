package modulo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeeEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entero_ingresado;
		boolean error=false;
		do{
			error=false;
			System.out.println("Ingrese su numero entero:");
			InputStreamReader entrada = new InputStreamReader(System.in);
	        BufferedReader teclado = new BufferedReader(entrada);
	        String numero;
			
			
			try{
				numero = teclado.readLine();
				entero_ingresado=Integer.parseInt(numero);
				System.out.println("Numero ingresado: "+entero_ingresado);
				teclado.close();
				entrada.close();
			}
			catch(Exception e){
				error=true;
				System.err.println("Ingrese nro entero");
			}
		}while(error);
		System.out.println("Numero ingresado correctamente");
		
		
	}

}
