package EscapeCuarto;

public class Misterio extends Sala {
    private int pistasExtra;

    public Misterio(String nombre, int pistasExtra) {
        super(nombre);
        this.pistasExtra = pistasExtra;
    }

    @Override
    public int calcularDificultad(int jugadores) {
        return 60 - jugadores + pistasExtra * 5;
    }
}
