package modulo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class LeeFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader flujoArchivo;
		BufferedReader buffer;
		File mi_archivo;
		char c,lista[];
		int indice=-1,aux;
		
		try {
			mi_archivo=new File("recursos/ArchivoTextoPrueba.txt");
			flujoArchivo=new FileReader(mi_archivo);
			buffer=new BufferedReader(flujoArchivo);
			lista=new char[1000];
			if(buffer.ready()) {
				while((aux=buffer.read())>=0) {
					c=(char)aux;
					if(c!=' ') {
						indice++;
						lista[indice]=c;
					}
				}
			}
			else {
				System.err.println("No esta listo para leer");
			}
			System.out.println("Contenido sin espacio:");
			System.out.println(String.copyValueOf(lista));
			flujoArchivo.close();
		}
		catch(Exception e) {
			System.err.println("Error capturado");
			System.err.println(e.getMessage());
			
		}
	}

}
