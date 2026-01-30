// Clase abstracta Zona
public abstract class Zona {
    protected String nombreZona;

    public Zona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    // Cada zona implementa su propia forma de consultar el estado
    public abstract String consultarEstado();
}
