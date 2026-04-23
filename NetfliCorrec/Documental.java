package NetfliCorrec;

public class Documental extends Contenido{
    private String tematica;
    private String investigador;
    public Documental(int idContenido, String titulo, int DuracionMin, String genero, boolean visto,String investigador,String tematica) {
        super(idContenido, titulo, DuracionMin, genero, visto);
        this.tematica=tematica;
        this.investigador=investigador;
    }
    public String getTematica() {
        return tematica;
    }
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    public String getInvestigador() {
        return investigador;
    }
    public void setInvestigador(String investigador) {
        this.investigador = investigador;
    }
    @Override
    public void reproducir() {
        System.out.println("Visualizando documental: " + getTitulo()+" de "+tematica+", hecho por el investigador "+investigador);
    }
}
