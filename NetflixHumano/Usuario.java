package NetflixHumano;

public class Usuario {
    private String NombreUsuario;
    private boolean esPremium;
    private boolean Favorito;
    public Usuario(String NombreUsuario, boolean esPremium, boolean Favorito){
        this.NombreUsuario=NombreUsuario;
        this.esPremium=esPremium;
        this.Favorito=Favorito;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }
    public void setFavorito(boolean favorito) {
        Favorito = favorito;
    }
    public String marcarFavorito(){
        if (Favorito==true) {
            return " Favorit@ ";
        } else {
            return "";
        }
    }
}
