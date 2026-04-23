package NetflixHumano;

public class Catalogo {
    private Pelicula[] peliculas;
    private Serie[] series;
    private Documental[] documentales;
    private int contaorPel = 0;
    private int contaorSer = 0;
    private int contaorDoc = 0;

    public Catalogo() {
        this.peliculas = new Pelicula[100];
        this.series = new Serie[100];
        this.documentales = new Documental[100];

    }

    public void ponerPelicula(Pelicula pel) {
        this.peliculas[contaorPel++] = pel;
    }

    public void ponerSerie(Serie ser) {
        this.series[contaorSer++] = ser;
    }

    public void ponerDocumental(Documental doc) {
        this.documentales[contaorDoc++] = doc;
    }

    public void verCatPelis() {
        for (int i = 0; i < contaorPel; i++) {
            if (peliculas[i] != null) {
                System.out.print(peliculas[i]);
            } else {
                System.out.println("NEL");
            }
        }
    }

    public void verCatSerie() {
        for (int i = 0; i < contaorSer; i++) {
            if (series[i] != null) {
                System.out.print(series[i]);
            } else {
                System.out.println("NEL");
            }
        }
    }

    public void verCatDocus() {
        for (int i = 0; i < contaorDoc; i++) {
            if (documentales[i] != null) {
                System.out.print(documentales[i]);
            } else {
                System.out.println("NEL");
            }
        }
    }
}
