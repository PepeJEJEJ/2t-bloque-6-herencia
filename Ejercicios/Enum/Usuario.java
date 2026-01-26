package Enum;

public class Usuario {

    private String nombreUsuario;
    private String email;
    private String password;
    private NivelAcceso nivelAcceso;

    public Usuario(String nombreUsuario, String email, String password, NivelAcceso nivelAcceso) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.nivelAcceso = nivelAcceso;
    }

    public void mostrarDatos() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Email: " + email);
        System.out.println("Nivel de acceso: " + nivelAcceso);
    }
}