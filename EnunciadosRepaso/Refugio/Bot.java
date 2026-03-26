package Refugio;

public class Bot extends Habitante {
    private String firmware;

    public Bot(String nombre, String firmware) {
        super(nombre);
        this.firmware = firmware;
    }

    @Override
    public double consumoOxigeno() {
        return 1.0;
    }
}
