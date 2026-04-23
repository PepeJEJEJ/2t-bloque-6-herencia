package NfliSimple;

public class Serie extends Contenido {
    private int numTemporadas;
    private boolean finalizada;

    public Serie(int id, String titulo, int duracion, String genero, int numTemporadas, boolean finalizada) {
        super(id, titulo, duracion, genero);
        this.numTemporadas = numTemporadas;
        this.finalizada = finalizada;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + getTitulo());
    }
}
