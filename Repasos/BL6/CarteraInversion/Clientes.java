package CarteraInversion;

public class Clientes {
    private String Nombre;
    private int DNI;
    private int IR;
    public Clientes (String Nombre,int DNI,int IR){
        this.Nombre=Nombre;
        this.DNI=DNI;
        this.IR=IR;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }
    public int getIR() {
        return IR;
    }
    public void setIR(int iR) {
        IR = iR;
    }
}
