package Vehiculos;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche(4, false, "Land Rover", "Santana");
        Coche coche2 = new Coche(4, false, "Seat", "600");
        Coche coche3 = new Coche(4, true, "Tesla", "Cybertruck");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
    }
}
