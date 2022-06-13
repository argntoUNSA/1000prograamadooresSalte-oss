package modulo3;

import java.util.LinkedList;
import java.util.Scanner;

public class PruebaListaEnteros {
	@SuppressWarnings("resource")
	public static int menu1(){
		int opcion;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("0-Salir");
			System.out.println("1-Ingresa otro");
			System.out.print("Ingrese opcion: ");
			opcion=scan.nextInt();
			System.out.println();
		}while(opcion<0 || opcion>1);
		return opcion;
	}
	public static int menu2() {
		int opcion;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("0-Salir");
			System.out.println("1-Mostrar original");
			System.out.println("2-Mostrar al reves");
			System.out.print("Ingrese opcion: ");
			opcion=scan.nextInt();
			System.out.println();
		}while(opcion<0 && opcion>2);
		return opcion;
		
	} 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elemento,cant,opcion;
		Scanner scan=new Scanner(System.in);
		LinkedList<Object> miLista=new LinkedList<Object>();
		
		System.out.println("Ingrese sus elementos");
		cant=0;
		do {
			opcion=menu1();
			if(opcion==1) {
				System.out.println("Nro "+(cant+1)+": ");
				elemento=scan.nextInt();
			
				miLista.add(elemento);
				System.out.println("Se muestra la Lista: \n\t"+miLista.toString());
				cant++;
			}
		}while(opcion==1);
		
		if(cant>0) {
			do {
				opcion=menu2();
				switch (opcion) {
					case 1:{
						for(int i=0;i<cant;i++){
							miLista.get(i);
						}
						break;
						}
					case 2:{
						for(int i=cant;i>0;i--){
							miLista.get(i);
						}
						break;
						}
				}
			}while(opcion!=0);
		}
		else {
			System.out.println("Lista vacia");
		}
		scan.close();
	}

}
