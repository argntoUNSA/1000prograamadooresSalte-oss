package modulo2Clase5y6;

public class TCredito{
   private String numero;
   private String nombre;
   private String banco;
   private double balance;
   private double limite;
   
   public TCredito(String vnumero, String vnombre, String vbanco, double vbalance, double vlimite){
     numero=vnumero;
     nombre=vnombre;       
     banco=vbanco;       
     balance=vbalance;     
     limite=vlimite;  
     }
   public void setNumero(String nuevoNumero){this.numero=nuevoNumero;}
   public void setNombre(String nuevoNombre){this.nombre=nuevoNombre;}
   public void setBalance(double nuevoBalance){this.balance=nuevoBalance;}
   public void setLimite(double nuevoLimite){this.limite=nuevoLimite;}
   public String getNumero(){return numero;}
   public String getNombre(){return nombre;}
   public String getBanco(){return banco;}
   public double getBalance(){return balance;}
   public double getLimite(){return limite;}
   public boolean puedoComprar(double vprecio){
     if(vprecio+balance>limite){return false;}
     else{
       balance+=vprecio;
       return true;
       }
     }
   public void aumentarLimite(double aumento){
     if(aumento>0){
       setLimite(getLimite()+aumento);
     }
     
   }
   public void pagarTarjeta(double vmonto){balance-=vmonto;}
   public void muestraDatos(){
     System.out.println("numero = "+getNumero());
     System.out.println("nombre = "+getNombre());
     System.out.println("banco = "+getBanco());
     System.out.println("balance = "+getBalance());
     System.out.println("limite = "+getLimite());
     }
   } 