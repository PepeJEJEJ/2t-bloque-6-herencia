package NetflixHumano;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1=new Pelicula(1, "La Carretera", 250, "Post-Apocaliptica", false, false);
        Serie serie1=new Serie(2, "Breaking Bad", 23, "Crimen", true, 13, true);
        Documental documental1=new Documental(3, "Tartesos", 40, "Arqueologia", false, "Varios", "Historia");
        System.out.println(pelicula1);
        System.out.println(serie1);
        System.out.println(documental1);
        Catalogo catalogo = new Catalogo();
        catalogo.ponerPelicula(pelicula1);
    }
}
