package NetfliCorrec;

abstract class Contenido {
    private int idContenido;
    private String titulo;
    private int DuracionMin;
    private String genero;
    private boolean visto;
    public Contenido (int idContenido,String titulo, int DuracionMin, String genero, boolean visto){
        this.idContenido=idContenido;
        this.titulo=titulo;
        this.DuracionMin=DuracionMin;
        this.genero=genero;
        this.visto=visto;
    }
    public int getIdContenido() {
        return idContenido;
    }
    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracionMin() {
        return DuracionMin;
    }
    public void setDuracionMin(int duracionMin) {
        DuracionMin = duracionMin;
    }
    public void setVisto(boolean visto) {
        this.visto = visto;
    }
    public abstract void reproducir();
    @Override
    public String toString() {
        return "ID: "+idContenido+" Titulo: "+titulo+" Duracion: "+DuracionMin+" Genero: "+genero+" La has visto: "+visto;
    }
}
