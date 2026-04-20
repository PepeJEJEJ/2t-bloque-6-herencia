
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Autor1", "España");
        Autor a2 = new Autor("Autor2", "Francia");

        Editorial e1 = new Editorial("Ed1", "España", 10);
        Editorial e2 = new Editorial("Ed2", "Italia", 20);

        Libro l1 = new Libro("Libro1", a1, e1, 1);
        Libro l2 = new Libro("Libro2", a2, e2, 2);
        Libro l3 = new Libro("Libro3", a1, e1, 3);
        Libro l4 = new Libro("Libro4", a2, e2, 4);
        Libro l5 = new Libro("Libro5", a1, e2, 5);
        Libro[] lista = { l1, l2, l3, l4, l5 };

        for (Libro l : lista) {//VER LA LISTA
            System.out.println(l);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Código del libro a reservar:");
        int codigo = Integer.parseInt(sc.nextLine());

        for (Libro l : lista) {
            if (l.getCodigo() == codigo) {// VER SI COINCIDE EL CODIGO DE LA LISTA CON OTRO CODIGO IGUAL
                if (l.reservar()) {
                    System.out.println("Reservado correctamente");
                } else {
                    System.out.println("No se puede reservar");
                }
            }
        }
    }
}