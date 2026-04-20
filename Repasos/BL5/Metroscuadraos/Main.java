
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Propietario");
        String nomprop = sc.nextLine();
        System.out.println("Valor:");
        int valor = sc.nextInt();
        System.out.println("Direccion");
        String direccion = sc.nextLine();
        System.out.println("numero de Habitaciones");
        int nHabs = sc.nextInt();

        Vivienda Vivienda1 = new Vivienda(nomprop, valor, direccion, nHabs);
        for (int i = 0; i < nHabs; i++) {
            System.out.println("Nombre Habitacion " + i + ":");
            String nombre = sc.nextLine();
            System.out.println("Lado 1 de la habitacion " + i + ":");
            int lado1 = sc.nextInt();
            System.out.println("Lado 2 de la habitacion " + i + ":");
            int lado2 = sc.nextInt();
            Habitacion hab = new Habitacion(nombre, lado1, lado2);
            Vivienda1.Habs[i] = hab;
        }
        System.out.println("El area total es " + Vivienda1.areatotal());
    }
}