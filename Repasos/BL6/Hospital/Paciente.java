package Hospital;

public class Paciente {
    private String Nombre;
    private int nSS;
    private String Dolencia;
    public Paciente(String nombre, int nSS, String Dolencia){
        this.Nombre=nombre;
        this.nSS=nSS;
        this.Dolencia=Dolencia;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getnSS() {
        return nSS;
    }
    public void setnSS(int nSS) {
        this.nSS = nSS;
    }
    public String getDolencia() {
        return Dolencia;
    }
    public void setDolencia(String dolencia) {
        Dolencia = dolencia;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}