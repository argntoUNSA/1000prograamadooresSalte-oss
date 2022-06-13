package model.herencia;

import java.util.Random;

public class TestHerenciaPersona extends TestHerencia{

  public static void main(String[] args) {
    int cantPersonas,j;
    Alumno[] misAlumnos=new Alumno[6];
    Profesor[] misProfesores=new Profesor[6];
    
    Persona[] misPersonas;
    cantPersonas=0;
    for(int i=0;i<6;i++){
      misAlumnos[i]=new Alumno();
      misProfesores[i]=new Profesor();
      
      //metodos de clase Padre
      
      
      misAlumnos[i].setNombre(generaString());
      misProfesores[i].setNombre(generaString());
      
      misAlumnos[i].setApellido(generaString());
      misProfesores[i].setApellido(generaString());
      
      misAlumnos[i].setDNI(generaLong());
      misProfesores[i].setDNI(generaLong());
      
      misAlumnos[i].setMateriasEnCurso(generaMaterias());
      misProfesores[i].setMateriasACargo(generaMaterias());
      
      cantPersonas+=2;
      }
    j=0;
    misPersonas=new Persona[cantPersonas];
    for(int i=0;i<cantPersonas;i+=2){
      misPersonas[i]=misAlumnos[j];
      misPersonas[i+1]=misProfesores[j];
      j++;
    }
    for(int i=0;i<cantPersonas;i++){
       misPersonas[i].mostrarDatos();
       System.out.println();
    }
  }
  
  public static String[] generaMaterias(){
	    Random genera=new Random();
	    String[] materiasPosibles={"Matematicas","Cs Naturales","Cs Sociales","Lengua","Historia"};
	    String[] materiasElegidas=new String[materiasPosibles.length];
	    for(int i=0;i<3;i++) {
	    	materiasElegidas[i]=materiasPosibles[genera.nextInt(materiasPosibles.length)];
	    }
	    return materiasElegidas;
	    
	  }
  

}
