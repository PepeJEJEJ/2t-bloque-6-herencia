package NetfliCorrec;

public class Catalogo {
    private Pelicula[] peliculas;
    private Serie[] series;
    private Documental[] documentales;
    private int contadorPel = 0;
    private int contadorSer = 0;
    private int contadorDoc = 0;

    public Catalogo() {
        this.peliculas = new Pelicula[100];
        this.series = new Serie[100];
        this.documentales = new Documental[100];
    }

    // Sobrecarga de añadirContenido (tres versiones)
    public void añadirContenido(Pelicula pel) {
        this.peliculas[contadorPel++] = pel;
    }

    public void añadirContenido(Serie ser) {
        this.series[contadorSer++] = ser;
    }

    public void añadirContenido(Documental doc) {
        this.documentales[contadorDoc++] = doc;
    }

    // Método mostrarCatalogo (requerido)
    public void mostrarCatalogo() {
        System.out.println("===== CATÁLOGO DE PELÍCULAS =====");
        for (int i = 0; i < contadorPel; i++) {
            System.out.println(peliculas[i]);
        }
        System.out.println("===== CATÁLOGO DE SERIES =====");
        for (int i = 0; i < contadorSer; i++) {
            System.out.println(series[i]);
        }
        System.out.println("===== CATÁLOGO DE DOCUMENTALES =====");
        for (int i = 0; i < contadorDoc; i++) {
            System.out.println(documentales[i]);
        }
    }
}