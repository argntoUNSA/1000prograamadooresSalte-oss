package modulo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class SumaLineas {
	public static File Constructor_1(String ruta){
        // Crea un Objeto File asociado al fichero "fichero.txt" que se encuentra en el directorio de trabajo:
        File fichero = new File(ruta); //=>> "Fichero.txt se llama RUTA RELATIVA"
        //En este caso no se indica path. Se supone que el fichero se encuentra en el directorio actual de trabajo.
        //MOSTRAR EJEMPLO DE RUTA ABSOLUTA
        return fichero;
    }
	public static boolean esNumero(char c) {
		boolean r=false;
		if((int)c>=48 && (int)c<=57) {
			r=true;
		}
		return r;
	}
	public static int sumaArray(int[] lista,int cant) {
		int r=0;
		for(int i=0;i<cant;i++) {
			r+=lista[i];
		}
		return r;
	}
	public static void interpreta(String cadena) {
		int[] lista=new int[cadena.length()/2]; 
		char c;
		String aux="";
		int indice=0;
		for(int i=0;i<cadena.length();i++) {
			c=cadena.charAt(i);
			if((int)c!=44) {
				if(esNumero(c)) {
					aux+=c;
				}
				
			}
			else {
				lista[indice]=Integer.parseInt(aux);
//				System.out.println("Registra numero: "+lista[indice]+"del string: "+aux);
				indice++;
				aux="";
			}
		}
		lista[indice]=Integer.parseInt(aux);
		indice++;
		
		System.out.print(sumaArray(lista,indice));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Ingrese ruta del archivo");
			String ruta,cadena;
			Scanner scan=new Scanner(System.in);
			File mi_archivo;
			int nroLinea=0;
			
			
			ruta=scan.nextLine();
			mi_archivo=Constructor_1(ruta);
//			System.out.println("Tomo ruta y abrio archivo");
			scan.close();
			System.out.println("Procesando...");
			if(mi_archivo.canRead()) {
				FileReader flujo=new FileReader(mi_archivo);
				BufferedReader buffer=new BufferedReader(flujo);
				System.out.println("Empieza a leer archivo");
				while((cadena=buffer.readLine())!=null) {
					nroLinea++;
					System.out.print("linea "+nroLinea+": ");
					interpreta(cadena);
					System.out.println();
				}
				buffer.close();
			}
			System.out.println("Programa Terminado");
		}
		catch(Exception e) {
			System.err.println("Error capturado: "+e.getMessage());
				
		}
	}

}
