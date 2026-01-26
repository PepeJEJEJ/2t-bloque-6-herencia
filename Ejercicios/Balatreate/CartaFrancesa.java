package Balatreate;

public class CartaFrancesa extends Carta {

    private String color;

    public CartaFrancesa(String palo, int numero, String color) {
        super(palo, numero);
        this.color = color;
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta Francesa → Palo: " + palo +
                           ", Número: " + numero +
                           ", Color: " + color);
    }
}