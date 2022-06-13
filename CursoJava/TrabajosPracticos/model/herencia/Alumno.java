package model.herencia;

public class Alumno extends Persona{

  private String[] materiasEnCurso;
  private int cantMateriasEnCurso,cantMaxima;
  
  public Alumno(String nombre,String apellido,long dni,String domicilio,String genero,int cantMateriasEnCurso){
    super(nombre,apellido,dni,domicilio,genero);
    if(cantMateriasEnCurso>0){
      this.materiasEnCurso=new String[cantMateriasEnCurso];
      this.cantMaxima=cantMateriasEnCurso;
      
      }
    else{
      this.materiasEnCurso=new String[10];
      this.cantMaxima=10;
      }
    this.cantMateriasEnCurso=0;
  }
  public Alumno(String nombre,int cantMateriasEnCurso){
    this(nombre,"",0,"","",cantMateriasEnCurso);
  }
  public Alumno(int cantMateriasEnCurso){
    this("",cantMateriasEnCurso);
  }
  public Alumno(){
    this("",0);
  }
  public void setMateriasEnCurso(String[] materias){
	int cantidad=0; 
    this.materiasEnCurso=materias;
    while(cantidad<materias.length && materias[cantidad]!=null)
    	cantidad++;
    if(cantidad<materias.length)
    	this.cantMateriasEnCurso=cantidad;
    else
    	this.cantMateriasEnCurso=materias.length;
  }
  public String[] getMateriasEnCurso(){
    return this.materiasEnCurso;
  }
  public void setMateria(int posicion,String materia){
    this.materiasEnCurso[posicion]=materia; 
  }
  public String getMateria(int posicion){
    if(posicion>=0 && posicion<cantMateriasEnCurso)
      return this.materiasEnCurso[posicion];
    else
      return "";
  }
  public boolean estaLlena(){
    return(this.cantMateriasEnCurso==this.cantMaxima);
  }
  public void agregarMateria(String materia){
    if(!estaLlena()){
    setMateria(this.cantMateriasEnCurso,materia);
    this.cantMateriasEnCurso++;
    }
  }
  
    public void mostrarDatos(){
      int cantidad=cantMateriasEnCurso;
      super.mostrarDatos();
      System.out.println("Materias asignadas");
      for(int i=0;i<cantidad;i++){
        System.out.print("[" +getMateriasEnCurso()[i]+"]");
    }
    System.out.println();
    }
}
