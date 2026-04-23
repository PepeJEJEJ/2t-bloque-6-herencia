package Netflix;

public class Documental extends Contenido {
    private String tematica;
    private String investigadorPrincipal;

    public Documental(int id, String titulo, int duracion, String genero, String tematica,
            String investigadorPrincipal) {
        super(id, titulo, duracion, genero);
        this.tematica = tematica;
        this.investigadorPrincipal = investigadorPrincipal;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo documental: " + getTitulo());
    }
}
