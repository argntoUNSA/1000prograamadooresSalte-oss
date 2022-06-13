package modulo3;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class EscribeArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] mi_array= {0,1,2,3,4,5,6,7,8,9};
		ByteArrayInputStream lector=new ByteArrayInputStream(mi_array);
		while(lector.available()>0) {
			int c=lector.read();
			System.out.print(c);
			if(lector.available()>0) 
				System.out.print(",");
		}
	}

}
