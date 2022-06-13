package modulo3;

import java.util.Random;

public class Auto {

	private String color,marca;
	private int cantPuertas;
	private boolean encendido;
	
	public Auto(String vMarca,String vColor,int vCantPuertas,boolean vEncendido) {
		this.setMarca(vMarca);
		this.setColor(vColor);
		this.setCantPuertas(vCantPuertas);
		this.setEncendido(vEncendido);
	}
	public Auto() {
		this("","",0,false);
	}
	
	
	public Auto generaAuto() {
		Auto miAuto=new Auto();
		Random generador=new Random();
		int cantidad;
		String 	marca,color,
				marcas[]= {"BMW","VW","Fiat","Ford"},
				colores[]={"Azul","Blanco","Celeste","Gris","Rojo","Verde"};
		cantidad=generador.nextInt(4)+2;
		marca=marcas[generador.nextInt(4)];
		color=colores[generador.nextInt(6)];
		
		miAuto.setMarca(marca);
		miAuto.setColor(color);
		miAuto.setCantPuertas(cantidad);
		
		return miAuto;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
	public void encender() {
		if(!this.isEncendido()) {
			this.setEncendido(true);
		}
		else {
			System.out.println("Ya esta encendido.");
		}
	}
	public void moverse() {
		String cadena;
		if(this.isEncendido()) {
			cadena="Ya esta encendido: "
					+ "\nMoviendose...";
		}
		else{
			cadena="No esta encendido, se procede a encender:"
					+ "\nMoviendose...";
		}
		System.out.println(cadena);
	}
	public void mostrar() {
		System.out.println
		("Marca:"+this.getMarca()
		+ "\nColor:"+this.getColor()
		+ "\nCant Puertas:"+this.getCantPuertas()
		+ "\nEncendido:"+this.isEncendido());
	}
	public String toString() {
		String cadena=
				"Marca:"+this.getMarca()
				+ "\nColor:"+this.getColor()
				+ "\nCant Puertas:"+this.getCantPuertas()
				+ "\nEncendido:"+this.isEncendido()
				+"\n";
		return cadena;
	}
}
