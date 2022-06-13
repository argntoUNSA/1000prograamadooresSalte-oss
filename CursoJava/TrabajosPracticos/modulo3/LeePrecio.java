package modulo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeePrecio {
	final static double IVA=0.105;
	public static void main(String[] args) {

		System.out.println("Inicio del programa");
		System.out.print("Ingrese precio del producto \'x\'");
		InputStreamReader flujoEntrada;
		BufferedReader tecladoEnEspera;
		double precio,precioConIVA;
		boolean error;
		do {
			try {
				error=false;
				flujoEntrada=new InputStreamReader(System.in);
				tecladoEnEspera=new BufferedReader(flujoEntrada);
				precio=Double.parseDouble(tecladoEnEspera.readLine());
				precioConIVA=precio*(1+IVA);
				System.out.println("Precio ingresado: "+precio);
				
				System.out.println("IVA: "+(precio*IVA));
	
				System.out.println("Precio+IVA: "+precioConIVA);
			}
			catch(Exception e) {
				System.err.println("Error en la entrada de precio\n"
						+ "Intente otra vez");
				error=true;
			}
		}while(error);
		System.out.println("Fin del programa");
	}
}
