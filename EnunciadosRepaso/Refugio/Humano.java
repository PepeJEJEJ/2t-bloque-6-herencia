package Refugio;

public class Humano extends Habitante {
    private double peso;
    private double actividad;

    public Humano(String nombre, double peso, double actividad) {
        super(nombre);
        this.peso = peso;
        this.actividad = actividad;
    }

    @Override
    public double consumoOxigeno() {
        return peso * 0.03 + actividad * 0.5;
    }
}