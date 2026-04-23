package NetfliCorrec;

public class Main {
    public static void main(String[] args) {
        // Crear contenido (Pelicula, Serie, Documental)
        Pelicula pelicula1 = new Pelicula(1, "La Carretera", 250, "Post-Apocaliptica", false, false, "John Hillcoat");
        Serie serie1 = new Serie(2, "Breaking Bad", 23, "Crimen", true, 13, true);
        Documental documental1 = new Documental(3, "Tartesos", 40, "Arqueologia", false, "Varios", "Historia");

        // Crear catálogo y añadir contenido (polimorfismo + sobrecarga)
        Catalogo catalogo = new Catalogo();
        catalogo.añadirContenido(pelicula1);
        catalogo.añadirContenido(serie1);
        catalogo.añadirContenido(documental1);

        // Mostrar todo el catálogo
        catalogo.mostrarCatalogo();

        // Crear usuario y marcar favoritos
        Usuario usuario = new Usuario("ana_lopez", true);
        usuario.marcarComoFavorito(pelicula1);
        usuario.marcarComoFavorito(serie1);
        usuario.mostrarFavoritos();

        // Probar el método reproducir de cada contenido
        pelicula1.reproducir();
        serie1.reproducir();
        documental1.reproducir();
    }
}