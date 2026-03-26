package EscapeCuarto;

public class MainEscapeRoom {
    public static void main(String[] args) {

        Sala s1 = new Terror("La Casa del Miedo", 4);
        Sala s2 = new Misterio("El Enigma del Faraón", 3);

        Cliente c1 = new Cliente("Juan");

        Reserva r1 = new Reserva(c1, s1);
        Reserva r2 = new Reserva(c1, s2);

        System.out.println("Tiempo ajustado Terror: " + s1.calcularDificultad(5));
        System.out.println("Tiempo ajustado Misterio: " + s2.calcularDificultad(5));
    }
}
