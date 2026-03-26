package Refugio;

public abstract class Habitante {
    protected String nombre;

    public Habitante(String nombre) {
        this.nombre = nombre;
    }

    public abstract double consumoOxigeno();
}
