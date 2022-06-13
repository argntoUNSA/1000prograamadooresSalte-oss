package model.herencia;

public class Profesor extends Persona{
  private String[] materiasACargo;
  private int cantMateriasACargo,cantMaxima;
  
  public Profesor(String nombre,String apellido,long dni,String domicilio,String genero,int materiasACargo){
    super(nombre,apellido,dni,domicilio,genero);
    if(materiasACargo>0){
      this.materiasACargo=new String[materiasACargo];
      cantMaxima=materiasACargo;
      }
    else{
      this.materiasACargo=new String[10];
      cantMaxima=10;
      }
    this.cantMateriasACargo=0;
  }
  public Profesor(){
    this("","",0,"","",10);
  }
  public Profesor(int cantMaterias){
    this("","",0,"","",cantMaterias);
  }
  public void setMateriasACargo(String[] materias){
		int cantidad=0; 
	    this.materiasACargo=materias;
	    while(cantidad<materias.length && materias[cantidad]!=null)
	    	cantidad++;
	    if(cantidad<materias.length)
	    	this.cantMateriasACargo=cantidad;
	    else
	    	this.cantMateriasACargo=materias.length;
	  }
  public String[] getMateriasACargo(){return this.materiasACargo;}
  public void setMateria(int posicion,String materia){
    this.materiasACargo[posicion]=materia;
  }
  public String getMateria(int posicion){
    if(posicion>=0 && posicion<this.cantMateriasACargo)
      return this.materiasACargo[posicion];
    else
      return "";
  }
  
    public boolean estaLlena(){
    return(this.cantMateriasACargo==this.cantMaxima);
  }
  public void agregarMateria(String materia){
    if(!estaLlena()){
      setMateria(this.cantMateriasACargo,materia);
      this.cantMateriasACargo++;
    }
  }
  public void mostrarDatos(){
  int cantidad=cantMateriasACargo;
    super.mostrarDatos();
    System.out.println("Materias asignadas");
    for(int i=0;i<cantidad;i++){
      System.out.print("[" +getMateriasACargo()[i]+"]");
    }
    System.out.println();
  }
}
