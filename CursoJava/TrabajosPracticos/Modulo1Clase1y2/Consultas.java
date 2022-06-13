package CursoJavaModulo1;
import java.util.Scanner;
/**
 * Write a description of class Consultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Consultas
{
    
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
        double i,j,aux;
        int posComa,cantDecFinal;
        String numAux,parteDecimal,parteDecimalAcotada,parteEntera;
		
		
        //podrian los valores cargarse por consola
		//i=Double.valueOf(args[0]);
        //j=Double.valueOf(args[1]);
		
		//Pido  y cargo los nros desde Scanner, ttambien la cantidad de decimales que quiero mostrar
		System.out.println("Se calculara la division entre nroA y nroB");
		//Pido nroA
		System.out.println("Ingrese numero A: ");
		//Cargo nroA
        i=sc.nextDouble();
		//Pido nroB !=0
		do
		{
			System.out.println("Ingrese numero B distinto de 0: ");
			//Cargo nroB
			j=sc.nextDouble();
		}
		while(j==0);
		
		
		//Ambos nros seran de tipo double
		//No se realizaron controles sobre los nros ingresados
		//Se utilizaron metodos de la Clase String, aux sera una variable auxiliar de este tipo
        
		
		//inicio del proceso
		
        System.out.println("inicio del programa");
        System.out.println("Manejando la cantidad de numeros decimales");
		System.out.println("Se calcula: "+i+"/"+j);
		
		//Se  calcula una operacion algebraica, en este ejemplo la division real. Obteniendo asi un nro real
        //Se muestra el numero original, por decirlo de alguna manera
		aux=i/j;
		
		System.out.println("Rdo:"+aux);
		
		/*
			Se deefinen  las partes de interes teniendo en cuenta los sgtes parametros:
				-Saber en que posicion se encuentra la coma
				-Saber cuantos decimales posee
			*/
		//Se transforma el tipo de variable, aux es double pero numAux es un String.Todo esto se hace por desconocimiento de metodo que acote parte decimal
		//tenemos el rdo de la division en numAux, la variable numAux es de tipo String
		numAux=String.valueOf(aux);
		//Como se considerara que numAux ahora es una cadena de caracteres (String), cada caracter o es un numero o es una coma. quizas un simbolo negativo
		//Consideremos que se tomara en cuenta la posicion de la coma como referencia		
		
		posComa=numAux.indexOf(".");
		
        //Se toma una subcadena del numero ya que es una cadena de caracteres, de la cual se puede tomar subcadenas
		//Primero toma la parte entera, y esto es: desde el inicio del nro, hasta la posicion antes de la coma
		parteEntera=numAux.substring(0,posComa);
        
		//Segundo toma la parte decimal y esto es: desde el primer decimal hasta la posicion que el usuario ingresa.
		//Aca se presento un error y es que, si mi numero no tiene un nro de decimales tal que:
		//	siendo n: nro de decimales del numero resultado de la division
		//	Siendo m: numero de decimales que el usuario quiere mostrar
		//	Debe cumplisrse que n>=m, para que no haya errores
		
		//Determina n:
		parteDecimal=numAux.substring(posComa+1,numAux.length());
		
		//Determina m:
		//Comprobare que el dato ingresado m sea valido mientras es ingresado
		int longitudParteDec=parteDecimal.length();
        //Pido cantDec
		do
		{
			System.out.println("Ingrese cantidad de decimales que quiere mostrar (0;"+longitudParteDec+"): ");
			//Cargo cantDec
			cantDecFinal=sc.nextInt();
		}
		while(cantDecFinal<0  || cantDecFinal>longitudParteDec);
		
		
		//Se muestra sus partes, entera y decimal.
		System.out.println("\tParte entera obtenida:"+parteEntera);
		System.out.println("\tParte decimal obtenida:"+parteDecimal);
		
		
		//Se decide como mostrar el nro acotado, si el usuario decidio ingresar 0 cero) se muestra la parte entera nada mas
		if(cantDecFinal!=0)
			parteDecimalAcotada="."+numAux.substring(posComa+1,posComa+cantDecFinal+1);
		else
			parteDecimalAcotada="";

		//Se muestra la parte decimal acotada y el numero final acotado
		System.out.println("\tParte decimal acotada obtenida:"+parteDecimalAcotada);
		System.out.println("\tNro acotado: "+parteEntera+parteDecimalAcotada);
		System.out.println("presione cualquier letra y luego enter.");
		String mantieneAbierto=sc.next();
		sc.close();
    }
}
