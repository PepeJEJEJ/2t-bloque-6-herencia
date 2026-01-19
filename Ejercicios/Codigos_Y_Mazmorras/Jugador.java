package Codigos_Y_Mazmorras;

public class Jugador extends Heroe {
    private int fuerza;

    public Jugador(int id, String nombre, int vida, int daño, int fuerza) {
        super(id, nombre, vida, daño, fuerza);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }
}