package modulo3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class EscribeArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File mi_archivo=new File("recursos/numEnteros.txt");
			FileWriter escritor=new FileWriter(mi_archivo);
			BufferedWriter texto=new BufferedWriter(escritor);
			for(int i=0;i<10;i++) {
				System.out.println("Paso "+i);
				for(int j=1;j<=10;j++) {
					texto.append(String.valueOf(10*i+j)+" ");
//					texto.flush();
				}
				texto.newLine();
				texto.flush();
			}
//			escritor.write(texto.);
			texto.close();
			
		}
		catch(Exception e) {
			System.err.println("Error capturado");
		}
		
	}

}
