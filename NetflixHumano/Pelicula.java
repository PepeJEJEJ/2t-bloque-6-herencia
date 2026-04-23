package NetflixHumano;

public class Pelicula extends Contenido{
    private String director;
    private boolean postCreditos;
    public Pelicula(int idContenido, String titulo, int DuracionMin, String genero, boolean visto, boolean postCreditos) {
        super(idContenido, titulo, DuracionMin, genero, visto);
        this.postCreditos=postCreditos;
    }
    public void setPostCreditos(boolean postCreditos) {
        this.postCreditos = postCreditos;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String PostCred(){
        if (postCreditos==true) {
            return"Tiene Postcreditos";
        } else {
            return "";
        }
    }
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo peli: " + getTitulo()+" Dirigida por "+director);
    }
}
