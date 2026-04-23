package Netflix;

public class Usuario {
    private String username;
    private boolean esPremium;
    private Contenido[] favoritos;
    private int contadorFav;

    public Usuario(String username, boolean esPremium, int maxFav) {
        this.username = username;
        this.esPremium = esPremium;
        this.favoritos = new Contenido[maxFav];
        this.contadorFav = 0;
    }

    public void marcarComoFavorito(Contenido c) {
        if (contadorFav < favoritos.length) {
            favoritos[contadorFav] = c;
            contadorFav++;
        }
    }
}
