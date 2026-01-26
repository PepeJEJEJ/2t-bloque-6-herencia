package Balatreate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Carta> cartas = new ArrayList<>();

        System.out.print("¿Cuántas cartas quieres crear? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nCreando carta " + (i + 1));
            System.out.print("Tipo de carta (ESPAÑOLA / FRANCESA): ");
            String tipo = sc.nextLine().toUpperCase();

            if (tipo.equals("ESPAÑOLA")) {

                System.out.print("Palo (oros, copas, espadas, bastos): ");
                String palo = sc.nextLine();

                System.out.print("Número (1-12): ");
                int numero = sc.nextInt();
                sc.nextLine();

                System.out.print("¿Es especial? (true/false): ");
                boolean especial = sc.nextBoolean();
                sc.nextLine();

                cartas.add(new CartaEspanola(palo, numero, especial));

            } else if (tipo.equals("FRANCESA")) {

                System.out.print("Palo (corazones, picas, tréboles, diamantes): ");
                String palo = sc.nextLine();

                System.out.print("Número (1-13): ");
                int numero = sc.nextInt();
                sc.nextLine();

                System.out.print("Color (rojo/negro): ");
                String color = sc.nextLine();

                cartas.add(new CartaFrancesa(palo, numero, color));

            } else {
                System.out.println("Tipo no válido. Repite esta carta.");
                i--; // repetir iteración
            }
        }

        System.out.println("\n=== LISTADO DE CARTAS CREADAS ===");
        for (Carta c : cartas) {
            c.mostrarCarta();
        }
    }
}