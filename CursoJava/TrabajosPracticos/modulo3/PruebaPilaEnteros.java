package modulo3;

import java.util.Scanner;

public class PruebaPilaEnteros {
	@SuppressWarnings("resource")
	public static int menu(Scanner scan) {
		int op;
		scan=new Scanner(System.in);
	
		do {
			
			System.out.println("0-Terminar");
			System.out.println("1-Insertar");
			System.out.println("2-Retirar");
			System.out.println("3-Mirar cima");
			System.out.println("4-¿Esta llena?");
			System.out.println("5-¿Esta vacia?");
			System.out.println("6-Limpia pila");
			System.out.println("7-Tamanio Pila");
			op=scan.nextInt();
		}while(op<0 || op>7);
		
//		scan.close();
		return op;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		PilaEnteros miPila=new PilaEnteros(10);
		int op;
		
		do {
			op=menu(scan);
			switch (op) {
			case 1:{
				System.out.println("Ingrese entero: ");
				int entero;
				scan=new Scanner(System.in);
				entero=scan.nextInt();
//				scan.close();
				System.out.println("Ingresando entero...");
				miPila.insertar(entero);
				break;
				}
			case 2:{
				System.out.println("Retirando cima... ");
				System.out.println("Mirando cima...\n\tContenido: ");
				System.out.println("\t\t"+
						miPila.cimaPila().toString());
				miPila.retirar();
				System.out.println("Cima mirada y retirada");
				
				
				
				System.out.println("Cima retirada");
				break;
				}
			case 3:{
				System.out.println("Mirando cima...\n\tContenido: ");
				System.out.println("\t\t"+
						miPila.cimaPila().toString());
				System.out.println("Cima mirada ");
				break;
				}
			case 4:{
				String cadena;
				if(miPila.pilaLlena()) {
					cadena="Si";
				}
				else {
					cadena="No";
				}
				System.out.println("¿Esta llena?:  "+cadena);
				System.out.println("Respondido");
				break;
				}
			case 5:{
				String cadena;
				if(miPila.pilaVacia()) {
					cadena="Si";
				}
				else {
					cadena="No";
				}
				System.out.println("¿Esta vacia?:  "+cadena);
				System.out.println("Respondido");
				break;
				}
			case 6:{
				System.out.println("Limpiando pila...:  ");
				miPila.limpiarPila();
				System.out.println("Limpieza completa");
				break;
				}
			case 7:{
				System.out.println("Tamanio pila:  "+miPila.tamanioPila());
				System.out.println("Tamanio dicho");
				break;
				}
			default:{
				System.out.println("Menu Terminado.");
				op=0;
				break;
				}
			}
		}while(op!=0);
		scan.close();
	}

}
