package TarjetasRegalo;

public class Tarjeta {
    private String nombreCliente;
    private int saldo;
    private int numero;
    public Tarjeta(String nombreCliente,int saldo,int numero){
        this.nombreCliente=nombreCliente;
        this.saldo=saldo;
        this.numero=numero;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void gastar(int g){
        if (saldo>g) {
            saldo-=g;
        } else {
            System.out.println("NO PUEDES GASTAR ESO");
        }
    }
    public void recargar(int r){
        saldo += r;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public int getMemoria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMemoria'");
    }
}
