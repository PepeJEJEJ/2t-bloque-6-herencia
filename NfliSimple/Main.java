package NfliSimple;

public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo(10);

        Pelicula p1 = new Pelicula(2, "Torrente Presidente", 195, "Humor", "Santiago Segura", false);

        Serie s1 = new Serie(3, "Breaking Bad", 50, "Crimen", 5, true);

        Documental d1 = new Documental(5, "Docu sobre Paquito", 60, "Historia", "Historia", "No se");

        catalogo.anadirContenido(p1);
        catalogo.anadirContenido(s1);
        catalogo.anadirContenido(d1);

        System.out.println("=== CATÁLOGO ===");
        catalogo.mostrarCatalogo();

        Usuario u1 = new Usuario("Pc202", true, 5);
        u1.marcarComoFavorito(p1);

        System.out.println("\n=== REPRODUCIENDO ===");
        p1.reproducir();

        System.out.println("\n=== FILTRAR POR GÉNERO: No se ===");
        catalogo.filtrarPorGenero("No se");
    }
}
