public class Profesor extends Persona {
    private String materia;
    private String ciclo;
    private int numeroDeHoras; // semanales

    public Profesor(String nombre, String apellidos, String dni, String email,
                    String materia, String ciclo, int numeroDeHoras) {
        super(nombre, apellidos, dni, email);
        this.materia = materia;
        this.ciclo = ciclo;
        this.numeroDeHoras = numeroDeHoras;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Materia: " + materia +
               ", Ciclo: " + ciclo +
               ", Horas semanales: " + numeroDeHoras;
    }

    @Override
    public String mostrarDetalles() {
        return nombre + " " + apellidos +
               " imparte " + materia +
               " en el ciclo " + ciclo +
               " con " + numeroDeHoras + " horas semanales.";
    }
}
