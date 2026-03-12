public class Alumno extends Persona {
    private String ciclo;
    private double notaMedia;

    public Alumno(String nombre, String apellidos, String dni, String email,
                  String ciclo, double notaMedia) {
        super(nombre, apellidos, dni, email);
        this.ciclo = ciclo;
        this.notaMedia = notaMedia;
    }

    public boolean estaAprobado() {
        return notaMedia >= 5.0;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Ciclo: " + ciclo +
               ", Nota media: " + notaMedia +
               ", Aprobado: " + (estaAprobado() ? "sí" : "no");
    }

    @Override
    public String mostrarDetalles() {
        return nombre + " " + apellidos +
               " cursa " + ciclo +
               " con una nota media de " + notaMedia +
               " y está " + (estaAprobado() ? "aprobado" : "suspenso") + ".";
    }
}