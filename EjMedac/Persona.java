public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;

    public Persona(String nombre, String apellidos, String dni, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Apellidos: " + apellidos +
               ", DNI: " + dni +
               ", Email: " + email;
    }

    public abstract String mostrarDetalles();// HACER UNA INTERFAZ
}
