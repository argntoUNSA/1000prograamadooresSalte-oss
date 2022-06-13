package modulo3;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prueba");
		HashMap<String,Auto> miMap=new HashMap<String,Auto>();

		Auto miAuto=new Auto();
		
		for(int i=0;i<3;i++) {
			miMap.put("matricula "+i, miAuto.generaAuto());
			
		}
		
//		System.out.println("Resultado:");
//		for(int i=0;i<miMap.size();i++)
//			System.out.println("\n"+miMap.get("matricula "+i));
		
	}

}
