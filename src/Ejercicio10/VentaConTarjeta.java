package Ejercicio10;

public class VentaConTarjeta extends Venta{
    private String numeroTarjeta;
    private int CantidadDeCuotas;
    public VentaConTarjeta(double monto,String numeroTarjeta){
        super(monto);
        this.numeroTarjeta =numeroTarjeta;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de tarjeta de credito"+ numeroTarjeta);

    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }



}
