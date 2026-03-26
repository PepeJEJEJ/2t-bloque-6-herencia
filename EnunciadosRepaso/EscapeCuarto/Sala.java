package EscapeCuarto;

public abstract class Sala {
    protected String nombre;

    public Sala(String nombre) {
        this.nombre = nombre;
    }

    public abstract int calcularDificultad(int jugadores);
}