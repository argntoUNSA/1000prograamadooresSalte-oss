package modulo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ordenaLineas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Ingrese ruta del archivo");
			String ruta;
			Object lineas[];
			
			Scanner scan=new Scanner(System.in);
			ruta=scan.nextLine();
//			ruta="recursos/ArchivoDesordenado.txt";
			
			File mi_archivo=new File(ruta);
			//lector
			FileReader flujoLector;
			BufferedReader bufferLector;
			
			//Escritor
			FileWriter flujoEscritor;
			BufferedWriter bufferEscritor;
			
			System.out.println(mi_archivo.getAbsolutePath());
//			lineas=new Object[(int)bufferLector.lines().count()];
			flujoLector=new FileReader(mi_archivo);
			bufferLector=new BufferedReader(flujoLector);
			lineas=bufferLector.lines().sorted().toArray();
			bufferLector.close();
			
			flujoEscritor=new FileWriter(mi_archivo);
			bufferEscritor=new BufferedWriter(flujoEscritor);
			for(int i=0;i<lineas.length;i++) {
				bufferEscritor.append(lineas[i].toString());
				bufferEscritor.newLine();
//				System.out.println("Contenido linea "+i+": "+lineas[i].toString());
			}
			System.out.println("Lineas en total: "+lineas.length);
			
			bufferEscritor.flush();
			
			bufferEscritor.close();
			scan.close();
		}
		catch(Exception e) {
			System.err.println("Error Capturado: "+e.getMessage());
		}
		
	}

}
