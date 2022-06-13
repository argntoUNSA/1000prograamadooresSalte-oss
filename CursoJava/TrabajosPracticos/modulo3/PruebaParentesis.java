package modulo3;

import java.util.Scanner;
import java.util.Stack;

public class PruebaParentesis {
	public static int menu() {
		int opcion;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("El menu se mostrara hasta detectar una respuesta valida");
//		scan=scan.reset();
		do {
			System.out.println("¿Desea Ingresar otra expresion?"
					+ "\n0-Salir del programa"
					+ "\n1-ingresar otra expresion");
			
			//while(scan.next().compareTo("\n")==0);
			try {
				
				while(System.in.available()>0)
					scan.next();
				System.out.print("Rta valida:");
				opcion=scan.nextInt();
			}catch (Exception e) {
				System.err.println("Ingrese nro entero:");
				opcion=0;
			}
		}while(opcion<0 || opcion>1);
//		
//			
//			
//		}
//		catch(Exception e) {
//			scan=new Scanner(System.in);
//			System.err.print("Error capturado"
//					+ "\ningrese de nuevo su opcion:");
//			
//		}
		return opcion;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicia programa\n"
				+ "Se contorlaran los parentesis de una expresion ingresada.\n");
		
		Scanner scan=new Scanner(System.in);
		String cadena;
		int tam,b=1,opcion;
		char miCaracter;
		Stack<Character> miPilaCaracteres;
		
		
		miPilaCaracteres=new Stack<Character>();
		do {
			System.out.print("Ingrese su expresion:");
			cadena=scan.nextLine();
			tam=cadena.length();
			//Ejemplo Entrada: {x+(y–[a+b]})*c–[(d+e)]/(h–(j–(k–[l-n])))
			for(int i=0;i<tam && b==1;i++) {
				miCaracter=cadena.charAt(i);
				if(miCaracter=='{' || miCaracter=='[' || miCaracter=='(') {
					miPilaCaracteres.push(new Character(miCaracter));
				}
				else if(miCaracter==')' || miCaracter==']' || miCaracter=='}'){
					if(!miPilaCaracteres.empty()) {
						char auxiliar;
						if(miCaracter==')') {
							auxiliar='(';
						}
						else if(miCaracter==']') {
							auxiliar='[';
						}
						else {
							auxiliar='{';
						}
						
						
						if(miPilaCaracteres.peek().equals((Character)auxiliar)) {
							miPilaCaracteres.pop();
						}
						else {
							b=0;
						}
					}
					else b=0;
					
				}
				
				
				
				
			}
			if(!miPilaCaracteres.empty() || b==0) {
				System.out.println("Resultado:"
						+ "\nSimbolos desequilibrados");
			}
			else {
				System.out.println("Resultado:"
						+ "\nSimbolos equilibrados\n");
			}
			
			opcion=menu();
		}while(opcion!=0);	
		System.out.println("Programa terminado");
		scan.close();
	}
}
//			
//			
//			
//			if((int)miCaracter<48 || (int)miCaracter>57) {
//				switch(miCaracter) {
//				
//					case '}':{
//						if(!miPilaCaracteres.empty() && miPilaCaracteres.peek()==((Character)'{')) {
//							miPilaCaracteres.pop();
//						}
//						else {
//							b=0;
//						}
//						break;
//					}
//					
//					case ']':{
//						if(!miPilaCaracteres.empty() && miPilaCaracteres.peek()==((Character)'[')) {
//							miPilaCaracteres.pop();
//						}
//						else {
//							b=0;
//						}
//						break;
//					}
//					case ')':{
//						if(!miPilaCaracteres.empty() && miPilaCaracteres.peek()==((Character)'(')) {
//							miPilaCaracteres.pop();
//						}
//						else {
//							b=0;
//						}
//						break;
//					}
//					default:{
//						if(miCaracter=='(' || miCaracter=='[' || miCaracter=='{') {
//							miPilaCaracteres.push(new Character(miCaracter));
//						}
//						break;
//					}
//				}				
//			}
//		}
//		
//		if(miPilaParentesis.empty() && b==1) {
//			System.out.println("Parentesis Equilibrados");
//		}
//		else {
//			System.out.println("Parentesis Desequilibrados");
//		}
//		
//		
//	}
//
//}
