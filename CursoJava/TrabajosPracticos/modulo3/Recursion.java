package modulo3;
import java.util.ArrayList;
import java.util.Random;
//111111001010010000101010101
//111010110111100110100010110001
import java.util.Scanner;

public class Recursion {
	public static void convertirBinario(int numero) {
		if(numero<2) {
			System.out.print(numero);
		}
		else {
			int resto=numero%2;
			convertirBinario(numero/2);
			System.out.print(resto);
		}
	}
	public static double potencia(double base,int exponente) {
		if(exponente==1) {
			return base;
		}
		else {
			return(base*potencia(base,exponente-1));
		}
	}
	public static long factorial(int numero) {
		if(numero<2) {
			return 1;
		}
		else {
			int anterior=numero-1;
			return(numero*factorial(anterior));
		}
	}
	public static boolean pertenece(ArrayList<Integer> conjunto,int buscado) {
		
		if(conjunto.size()==0) {
				return false;
		}
		else if(conjunto.get(0)==buscado) {
			return true;
		}
		else {
			conjunto.remove(0);
			return(pertenece(conjunto,buscado));
		}
	}
	public static long fibonacci(int numero) {
		if(numero<2) {
			return 1;
		}
		else {
			return(fibonacci(numero-1)+fibonacci(numero-2));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		int numero;
//		do {
//			System.out.println("Ingrese un nro entero:");
//			numero=scan.nextInt();
//		}while(numero<0);
//		System.out.println("Numero ingresado: "+numero);
//
//		System.out.print("Numero binario:");
//		convertirBinario(numero);
		
//		double base;
//		int exponente;
//		
//		System.out.println("Ingrese base: ");
//		base=scan.nextDouble();
//		System.out.println("Ingrese exponente: ");
//		exponente=scan.nextInt();
//		
//		System.out.println("base^exponente: "+potencia(base,exponente));

//		int numero;
//		System.out.println("Ingrese natural menor a 20: ");
//		numero=scan.nextInt();
//		
//		System.out.println("Factorial("+numero+")="+factorial(numero));

//		Random generador=new Random();
//		ArrayList<Integer> conj=new ArrayList<Integer>();
//		int cant=generador.nextInt(10)+1,buscado;
//		for(int i=0;i<cant;i++) {
//			conj.add(generador.nextInt(200)+1);
//			System.out.print("["+conj.get(i)+"]");
//		}
//		System.out.println("\nIngrese entero a buscar: ");
//		buscado=scan.nextInt();
//		if(pertenece(conj,buscado)) {
//			System.out.println("Pertenece");
//		}
//		else {
//			System.out.println("No pertenece");
//		}
//		
//		for(int i=0;i<conj.size();i++) {
//			System.out.print("["+conj.get(i)+"]");
//		}
		
		
		int numero;
		do {
			System.out.println("Ingrese un natural:");
			numero=scan.nextInt();
		}while(numero<0);
		System.out.println("Fibonacci("+numero+")="+fibonacci(numero));

		scan.close();
	}
	

}
