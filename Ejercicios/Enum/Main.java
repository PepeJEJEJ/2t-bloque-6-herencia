package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String nombre = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        System.out.print("Nivel de acceso (ADMIN, USUARIO, INVITADO): ");
        String nivel = sc.nextLine().toUpperCase();

        NivelAcceso nivelAcceso = NivelAcceso.valueOf(nivel);

        Usuario u = new Usuario(nombre, email, pass, nivelAcceso);

        System.out.println("\nDatos del usuario registrado:");
        u.mostrarDatos();
    }
}
