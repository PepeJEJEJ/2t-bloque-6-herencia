package Profes;
public class Departamento {
    private String Nombre;
    private int Presupuesto;
    private String Sede;

    public Departamento(String Nombre, int Presupuesto, String Sede) {
        this.Nombre = Nombre;
        this.Presupuesto = Presupuesto;
        this.Sede = Sede;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public String toString() {
        return Nombre + " - " + Sede;
    }
}
