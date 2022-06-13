package modulo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;

public class PruebaPila {
	public static void pilaYArchivo(){
		try {
	        Stack<Object> pila = new Stack<>(),pilaExtraidos=new Stack<>();
	        String ruta="recursos/numEnteros.txt",valorAux;
	        File mi_archivo=new File(ruta);
	        FileReader flujoLector;
	        BufferedReader bufferLector;
	        
	        
	        System.out.println("Definimos Pila a partir del contenido de un archivo"
	        		+ "\nAgregando valores desde:"
	        		+ "\n\tDireccion: "+mi_archivo.getAbsolutePath()
	        		+"\n\tNombre: "+mi_archivo.getName());
	        
	        
	        flujoLector=new FileReader(mi_archivo);
	        bufferLector=new BufferedReader(flujoLector);
	        for (int i = 0;(valorAux=bufferLector.readLine())!=null; i++) {
	            pila.push(valorAux);
	            System.out.println("\tValor: " +i+": "+valorAux );
	        }
	        bufferLector.close();

	        System.out.println("Cantidad elementos: " + pila.size()
						+"\n\tRetirando ultimo valor..."
						+"\n\tValor: " + pila.pop());	  
            
	        System.out.println("Cantidad elementos: " + pila.size()
        				+"\n\tRetirando valores..."
        				+ "\n\tCreando Pila de elementos retirados...");
	        while (!pila.isEmpty()) {
	        	Object extraido=pila.pop();
	            System.out.println("\tExtrayendo... "
	            		+"\nCantidad elementos: " + pila.size());    
	            pilaExtraidos.add(extraido);
	        }
	        System.out.println("Cantidad almacenados: " + pila.size()
	        			+"\nCantidad extraidos: " + pilaExtraidos.size());
	        
		}
		catch(Exception e) {
			System.err.println("Error Capturado: "+e.getMessage());
		}
    }
    public static void main(String[] args) throws Exception {
//        lista();
//        cola();
        pilaYArchivo();
    }
       

}
