package NfliSimple;

public class Pelicula extends Contenido {
    private String director;
    private boolean tienePostCreditos;

    public Pelicula(int id, String titulo, int duracion, String genero, String director, boolean tienePostCreditos) {
        super(id, titulo, duracion, genero);
        this.director = director;
        this.tienePostCreditos = tienePostCreditos;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + getTitulo());
    }
}

