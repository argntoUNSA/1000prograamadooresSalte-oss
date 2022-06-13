package modulo2Clase3y4;

public class Taxi {
  private String id;
  private int nroTaxi,bajadaBandera,tipoTarifa;
  
  public Taxi(String id,int nroTaxi,int tipoTarifa){
    setId(id);
    setNroTaxi(nroTaxi);
    setTipoTarifa(tipoTarifa);
    if(getTipoTarifa()==1)
      setBajadaBandera(58);
    else
      setBajadaBandera(70);
  }
  public Taxi(String id){
    this("",1,58);
  }

  public void setId(String nuevoId){
    this.id=nuevoId;
  }
  public void setNroTaxi(int nuevoNroTaxi){
    this.nroTaxi=nuevoNroTaxi;
  }
  public void setTipoTarifa(int nuevoTipoTarifa){
    this.tipoTarifa=nuevoTipoTarifa;
  }
  public void setBajadaBandera(int nuevoBajadaBandera){
    this.bajadaBandera=nuevoBajadaBandera;
  }
  public String getId(){
    return this.id;
  }
  public int getNroTaxi(){
    return this.nroTaxi;
  }
  public int getTipoTarifa(){
    return this.tipoTarifa;
  }
  public int getBajadaBandera(){
    return this.bajadaBandera;
  }
  public void cambiarTarifa(){
    if(getTipoTarifa()==1){
      setTipoTarifa(2);
      setBajadaBandera(70);
    }
    else{
      setTipoTarifa(1);
      setBajadaBandera(58);
    }
  }
  public double calcularTotalAPagar(int metrosRecorridos){
    int precioXMetro,total;
    total=getBajadaBandera();
    if(getTipoTarifa()==1){
      precioXMetro=5;
    }
    else{
      precioXMetro=8;
    }
    total+=precioXMetro*metrosRecorridos;
    return total;
  }
  
}
