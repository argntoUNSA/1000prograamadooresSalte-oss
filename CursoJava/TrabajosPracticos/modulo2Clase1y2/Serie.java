package modulo2Clase1y2;

public class Serie {
private String titulo,genero,creador;
private int temporadas;

public Serie(String titulo,String genero,String creador,int temporadas){
  setTitulo(titulo);
  setGenero(genero);
  setCreador(creador);
  setTemporadas(temporadas);
}
public void setTitulo(String nuevo){
  this.titulo=nuevo;
}
public void setGenero(String nuevo){
  this.genero=nuevo;
}
public void setCreador(String nuevo){
  this.creador=nuevo;
}
public void setTemporadas(int nuevo){
  this.temporadas=nuevo;
}
public String getTitulo(){
  return this.titulo;
}
public String getGenero(){
  return this.genero;
}
public String getCreador(){
  return this.creador;
}
public int getTemporadas(){
  return this.temporadas;
}

public void mostrarTodo(){
  System.out.println("Titulo:"+getTitulo());
  System.out.println("Genero:"+getGenero());
  System.out.println("Creador:"+getCreador());
  System.out.println("Temporadas:"+getTemporadas());
}

public void cambiarTodo(String titulo,String genero,String creador,int temporadas){
  setTitulo(titulo);
  setGenero(genero);
  setCreador(creador);
  setTemporadas(temporadas);
}
}
