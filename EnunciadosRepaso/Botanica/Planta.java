package Botanica;

public abstract class Planta {
    protected String nombre;

    public Planta(String nombre) {
        this.nombre = nombre;
    }

    public abstract int necesidadRiego(int temperatura);
}
