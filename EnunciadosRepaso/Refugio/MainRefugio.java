package Refugio;

public class MainRefugio {
    public static void main(String[] args) {

        Habitante h1 = new Humano("Carlos", 80, 5);
        Habitante h2 = new Bot("XR-22", "v3.1");

        Habitante[] lista = { h1, h2 };

        ModuloHabitacional modulo = new ModuloHabitacional(lista);

        System.out.println("Consumo Humano: " + h1.consumoOxigeno());
        System.out.println("Consumo Androide: " + h2.consumoOxigeno());
    }
}
