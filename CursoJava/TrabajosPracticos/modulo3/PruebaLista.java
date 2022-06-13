package modulo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PruebaLista {
	public static void listaYArchivo(){
       try {
			List<Object> lista,listaInvertida;
	
	        // Añadimos elementos a partir del archivo
	        String linea,ruta="recursos/ArchivoPruebaLista.txt";
	        File miArchivo=new File(ruta);
	        FileReader flujoLector;
	        BufferedReader bufferLector;
	        
	        flujoLector=new FileReader(miArchivo);
	        bufferLector=new BufferedReader(flujoLector);
	        System.out.println("Agregando elementos");
	        lista = new ArrayList<Object>();
	        while((linea=bufferLector.readLine())!=null) {
	        	lista.add(linea);
	        }
	        System.out.println("Se agregaron"+lista.size()+" elementos");
	        bufferLector.close();
	        
	        // Obtenemos un Iterador y recorremos la lista.
	        //Iterator<String> lista = new list.iterator();
	        Iterator<Object> iter = lista.iterator();
	        System.out.println("Se muestra la lista original");
	        while (iter.hasNext()) {
	            System.out.println(iter.next().toString());
	        }
	        
	        listaInvertida = new ArrayList<Object>();
	        for(int i=lista.size()-1;i>=0;i--) {
	        	listaInvertida.add(lista.get(i));
	        }
	        Iterator<Object> iter2 = listaInvertida.iterator();
	        System.out.println("Se muestra la lista invertida");
	        while (iter2.hasNext()) {
	            System.out.println(iter2.next().toString());
	        }
	        
        }
       catch(Exception e) {
    	   System.err.println("Error capturado: "+e.getMessage());
       }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaYArchivo();
	}

}
