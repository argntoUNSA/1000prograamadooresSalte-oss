package model.herencia;

public class ColectivoLarga extends Colectivo {
	private double capacidad;
	
	public ColectivoLarga(
			double vCantGansolina,
			int vCantRuedas,
			int vCantAsientos,
			int vCantPasajeros,
			String vId,
			double vCapacidad) {
		super(vCantGansolina, vCantRuedas, vCantAsientos, vCantPasajeros, vId);
		setCapacidad(vCapacidad);
		// TODO Auto-generated constructor stub
	}
	public ColectivoLarga() {
		this(0,0,0,0,"",0);
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	public void muestraDatos() {
		super.muestraDatos();
		System.out.println("\tCapacidad: "+this.getCapacidad());
	} 
	

}
