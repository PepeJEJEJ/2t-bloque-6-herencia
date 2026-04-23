package Netflix;

public abstract class Contenido {
    private int idContenido;
    private String titulo;
    private int duracionMinutos;
    private String genero;
    private boolean visto;

    public Contenido(int idContenido, String titulo, int duracionMinutos, String genero) {
        this.idContenido = idContenido;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
        this.visto = false;
    }

    public int getIdContenido() {
        return idContenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public String toString() {
        return "ID: " + idContenido + " - " + titulo + " (" + genero + ")";
    }

    public abstract void reproducir();
}