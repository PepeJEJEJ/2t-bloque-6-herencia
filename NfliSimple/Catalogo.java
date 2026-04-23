package NfliSimple;

public class Catalogo {
    private Contenido[] listado;
    private int contador;

    public Catalogo(int tamano) {
        listado = new Contenido[tamano];
        contador = 0;
    }

    public void anadirContenido(Contenido c) {
        if (contador < listado.length) {
            listado[contador] = c;
            contador++;
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listado[i].toString());
        }
    }

    public void filtrarPorGenero(String genero) {
        for (int i = 0; i < contador; i++) {
            if (listado[i].getGenero().equalsIgnoreCase(genero)) {
                System.out.println(listado[i].toString());
            }
        }
    }
}
