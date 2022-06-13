package model.herencia;

public class Colectivo {

	private double cantGansolina;
	private int	cantRuedas,cantAsientos,cantPasajeros;
	private String id;

	
	public Colectivo(
			double vCantGansolina,
			int vCantRuedas,
			int vCantAsientos,
			int vCantPasajeros,
			String vId)
	{
		setId(vId);
		setCantGansolina(vCantGansolina);
		setCantPasajeros(vCantPasajeros);
		setCantRuedas(vCantRuedas);
		setCantAsientos(vCantAsientos);
		
	}
	
	public void setId(String id) {this.id = id;}
	public void setCantGansolina(double cantGansolina) {this.cantGansolina = cantGansolina;}
	public void setCantPasajeros(int cantPasajeros) {this.cantPasajeros = cantPasajeros;}
	public void setCantRuedas(int cantRuedas) {this.cantRuedas = cantRuedas;}
	public void setCantAsientos(int cantAsientos) {this.cantAsientos = cantAsientos;}

	public String getId() {return id;}
	public double getCantGansolina() {return cantGansolina;}
	private int getCantPasajeros() {return cantPasajeros;}
	public int getCantRuedas() {return cantRuedas;}
	public int getCantAsientos() {return cantAsientos;}
	
	public void muestraDatos() {
		System.out.println("Id: "+getId());
		System.out.println("\tGasolina: "+getCantGansolina());
		System.out.println("\tRuedas: "+getCantRuedas());
		System.out.println("\tPasajeros: "+getCantPasajeros());
		System.out.println("\tAsientos: "+getCantAsientos());		
	}

}
