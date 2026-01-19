package Codigos_Y_Mazmorras;

/*
 * Ejercicio 4. Personajes de un juego.
 * Todos los personajes tienen un id, un nombre, una vida y un daño. En nuestro
 * juego hay personajes que controla el jugador, y enemigos que maneja la
 * máquina.
 * Los jugadores también tienen fuerza (se mide en 0-100).
 * Los enemigos también tienen poderMagico (0-1 con decimales).
 * Crea 2 jugadores y 3 enemigos.
 * //Ampliación implementa la clase Juego que tenga un método batalla() que
 * permita pasarle por parámetro un jugador y un enemigo, y nos indique quién
 * gana la batalla (gana quien tenga más fuerza/podermagico*100).
 */

public class Main {
    public static void main(String[] args) {
        Heroe heroe1=new Heroe(1, "Thiudabaldr", 33, 11, 220);
        Heroe heroe2=new Heroe(2, "Thiudaerikr", 23, 14, 51);
        Heroe heroe3=new Heroe(2, "Wuntarbundr", 23, 14, 51);
        Enemigo enemigo1=new Enemigo(1, "Tumadre", 512, 11, 3, 1, "La Ogro Termotanque de Ravioles");
        Enemigo enemigo2=new Enemigo(2, "Perro", 1, 1, 1, 1, "Zanxe, El Devorador de Dineros y Longanizas");
        Enemigo enemigo3=new Enemigo(3, "Er Xurumber", 10, 1, 1, 1, "El Señor del Cobre y lo' Clane' (y del 'Tomado prestado indefinidamente' tb conocido coloquialmente como robar)");
        Pelea pelea = new Pelea();

        pelea.batalla(heroe1, enemigo1);
        System.out.println();
        pelea.batalla(heroe2, enemigo2);
        System.out.println();
        pelea.batalla(heroe3, enemigo3);

    }
}