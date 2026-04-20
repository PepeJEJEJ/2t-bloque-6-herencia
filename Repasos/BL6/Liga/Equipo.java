package Liga;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int nSocios;
    private int presupuesto;
    public Equipo(String nombre, String ciudad, int nSocios, int presupuesto){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.nSocios=nSocios;
        this.presupuesto=presupuesto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    public int getnSocios() {
        return nSocios;
    }
    public void setnSocios(int nSocios) {
        this.nSocios = nSocios;
    }
    @Override
    public String toString() {
        return "Nombre del Equipo: "+nombre+" Ciudad: "+ciudad+" Numero de Socios: "+nSocios+" Presupuesto anual de: "+presupuesto;
    }
}
