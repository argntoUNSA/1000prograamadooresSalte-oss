package modulo2Clase1y2;

public class Cuenta {
private String nombreDelCliente,numeroDeCuenta;
private double tipoDeInteres,saldo;

public Cuenta(String nombre,String nroCta,double tipoInteres,double saldo){
  setNombreCte(nombre);
  setNumeroCta(nroCta);
  setTipoInteres(tipoInteres);
  setSaldo(saldo);
}
public Cuenta(){
  setNombreCte("");
  setNumeroCta("");
  setTipoInteres(0);
  setSaldo(0);
}
public Cuenta(Cuenta otro){
  setNombreCte(otro.getNombreCte());
  setNumeroCta(otro.getNroCta());
  setTipoInteres(otro.getTipoInteres());
  setSaldo(otro.getSaldo());
}

public void setNombreCte(String nuevo){
  this.nombreDelCliente=nuevo;
}
public void setNumeroCta(String nuevo){
  this.numeroDeCuenta=nuevo;
}
public void setTipoInteres(double nuevo){
  this.tipoDeInteres=nuevo;
}
public void setSaldo(double nuevo){
  this.saldo=nuevo;
}
public String getNombreCte(){
  return this.nombreDelCliente;
}
public String getNroCta(){
  return this.numeroDeCuenta;
}
public double getTipoInteres(){
  return this.tipoDeInteres;
}
public double getSaldo(){
  return this.saldo;
}

public boolean ingreso(double monto){
  if(monto>0){
    setSaldo(getSaldo()+monto);
    return true;
  }
  else return false;
}
public boolean reintegro(double monto){
  double saldoActualizado;
  if(monto>=0){
    saldoActualizado=getSaldo()-monto;
    if(saldoActualizado>=0){
      setSaldo(saldoActualizado);
      return true;
    }
    else return false;
  }
  else return false;
}
public boolean transferencia(Cuenta ctaDestino,double importe){
  double saldoActualizado;
  if(importe>0){
    saldoActualizado=getSaldo()-importe;
    if(saldoActualizado>=0){
      ctaDestino.ingreso(importe);
      reintegro(importe);
      return true;
    }
    else return false;
  }
  else return false;
}
}
