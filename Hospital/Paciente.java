// Clase Paciente
public class Paciente {
    private String nombreCompleto;
    private String numeroSeguridadSocial;
    private String dolencia;

    public Paciente(String nombreCompleto, String numeroSeguridadSocial, String dolencia) {
        this.nombreCompleto = nombreCompleto;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.dolencia = dolencia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }
}
