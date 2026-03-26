package EscapeCuarto;

public class Terror extends Sala {
    private int nivelSustos;

    public Terror(String nombre, int nivelSustos) {
        super(nombre);
        this.nivelSustos = nivelSustos;
    }

    @Override
    public int calcularDificultad(int jugadores) {
        return 60 - jugadores * 2 - nivelSustos * 3;
    }
}
