package NetfliCorrec;

public class Usuario {
    private String nombreUsuario;
    private boolean esPremium;
    private Contenido[] favoritos;   // Composición: array de objetos Contenido
    private int numFavoritos;        // Cuántos favoritos hay actualmente

    public Usuario(String nombreUsuario, boolean esPremium) {
        this.nombreUsuario = nombreUsuario;
        this.esPremium = esPremium;
        this.favoritos = new Contenido[100];  // Tamaño fijo (máximo 100 favoritos)
        this.numFavoritos = 0;
    }

    // Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    // Método para marcar como favorito (requerido por el proyecto)
    public void marcarComoFavorito(Contenido c) {
        if (numFavoritos < favoritos.length) {
            favoritos[numFavoritos] = c;
            numFavoritos++;
            System.out.println("Añadido a favoritos: " + c.getTitulo());
        } else {
            System.out.println("No se pueden guardar más favoritos (límite alcanzado).");
        }
    }

    // Método extra para mostrar los favoritos (no obligatorio, pero útil)
    public void mostrarFavoritos() {
        System.out.println("Favoritos de " + nombreUsuario + ":");
        for (int i = 0; i < numFavoritos; i++) {
            System.out.println("- " + favoritos[i].getTitulo());
        }
    }
}