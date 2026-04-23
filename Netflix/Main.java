package Netflix;

public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo(10);

        Pelicula p1 = new Pelicula(1, "El Club de la Pelea", 148, "No se", "No se", true);
        Pelicula p2 = new Pelicula(2, "Torrente Presidente", 195, "Humor", "Santiago Segura", false);

        Serie s1 = new Serie(3, "Breaking Bad", 50, "Crimen", 5, true);
        Serie s2 = new Serie(4, "Better Call Saul", 25, "Crimen", 20, true);

        Documental d1 = new Documental(5, "Docu sobre Paquito", 60, "Historia", "Historia", "No se");

        catalogo.anadirContenido(p1);
        catalogo.anadirContenido(p2);
        catalogo.anadirContenido(s1);
        catalogo.anadirContenido(s2);
        catalogo.anadirContenido(d1);

        System.out.println("=== CATÁLOGO COMPLETO ===");
        catalogo.mostrarCatalogo();

        Usuario u1 = new Usuario("Pc202", true, 5);

        u1.marcarComoFavorito(p1);
        u1.marcarComoFavorito(s1);

        System.out.println("\n=== REPRODUCIENDO ===");
        p1.reproducir();
        s1.reproducir();

        System.out.println("\n=== FILTRAR POR GÉNERO: Drama ===");
        catalogo.filtrarPorGenero("Drama");
    }
}