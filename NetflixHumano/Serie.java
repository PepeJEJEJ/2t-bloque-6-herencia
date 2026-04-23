package NetflixHumano;

public class Serie extends Contenido{
    private int nTemporadas;
    private boolean terminada;

    public Serie(int idContenido, String titulo, int DuracionMin, String genero, boolean visto, int nTemporadas, boolean terminada) {
        super(idContenido, titulo, DuracionMin, genero, visto);
        this.nTemporadas=nTemporadas;
        this.terminada=terminada;
    }
    public int getnTemporadas() {
        return nTemporadas;
    }
    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }
    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + getTitulo()+" con "+nTemporadas+" Temporadas ");
    }
}
