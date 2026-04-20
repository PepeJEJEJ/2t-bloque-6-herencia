package Hospital;

public abstract class Zona {
    private String nombreZona;
    Zona (String nombreZona){
        this.nombreZona=nombreZona;
    }
    public String getNombreZona() {
        return nombreZona;
    }
    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
    public abstract String consultarEstado();
}