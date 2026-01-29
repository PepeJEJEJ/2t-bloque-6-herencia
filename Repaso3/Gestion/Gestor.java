package Gestion;

public class Gestor {

    private String nombre;
    private String telefono;
    private String email;

    public Gestor(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " (" + telefono + ", " + email + ")";
    }
}
