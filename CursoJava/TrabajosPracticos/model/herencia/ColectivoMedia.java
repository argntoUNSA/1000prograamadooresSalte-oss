package model.herencia;

public class ColectivoMedia extends Colectivo {

	private String chofer;
	
	public ColectivoMedia(
			double vCantGansolina,
			int vCantRuedas,
			int vCantAsientos,
			int vCantPasajeros,
			String vId,
			String vChofer) {
		super(vCantGansolina, vCantRuedas, vCantAsientos, vCantPasajeros, vId);
		setChofer(vChofer);
		// TODO Auto-generated constructor stub
	}
	public ColectivoMedia() {
		this(0,0,0,0,"","");
		// TODO Auto-generated constructor stub
	}
	
	public void setChofer(String vChofer) {
		this.chofer=vChofer;
	}
	public String getChofer() {
		String vChofer=this.chofer;
		return vChofer;
	}
	
	public void muestraDatos() {
		super.muestraDatos();
		System.out.println("\tChofer: "+this.getChofer());
	}
	
	
}
