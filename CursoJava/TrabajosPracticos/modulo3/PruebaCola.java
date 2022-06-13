package modulo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class PruebaCola {
	public static void colaYArchivo(){
		try {
	        Queue<String> cola = new PriorityQueue<>();
	        File miArchivo;
	        FileReader flujoLector;
	        BufferedReader bufferLector;
	        String ruta="recursos/ArchivoPruebaCola.txt",linea;
	        
	    
	        System.out.println("Abriendo archivo...");
	        miArchivo=new File(ruta);
	        flujoLector=new FileReader(miArchivo);
	        bufferLector=new BufferedReader(flujoLector);
	        System.out.println("Leyendo archivo...");	        

	        System.out.println("Administrando Cola...");
	        System.out.println("Mostrando y agregando valores...\n");
	        while ((linea=bufferLector.readLine())!=null) {
	            System.out.println("["+linea+"]");  
	            cola.offer(linea);
	        }
	        System.out.println();
	        bufferLector.close();
	        System.out.println("Cantidad de elementos " + cola.size());
	        System.out.println();
	        System.out.println("Retirando y mostrando valores");
	        while (cola.peek()!=null) {
	            System.out.println("["+cola.poll()+"]");          
	        }
	        System.out.println();
	        System.out.println("cantidad elementos: " + cola.size());
	        System.out.println("Programa finalizado");
		}
		catch(Exception e) {
			System.err.println("Error capturado: "+e.getLocalizedMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colaYArchivo();
	}

}
