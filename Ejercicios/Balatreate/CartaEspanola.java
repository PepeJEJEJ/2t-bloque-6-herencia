package Balatreate;

public class CartaEspanola extends Carta {

    private boolean esEspecial;

    public CartaEspanola(String palo, int numero, boolean esEspecial) {
        super(palo, numero);
        this.esEspecial = esEspecial;
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta Española → Palo: " + palo +
                           ", Número: " + numero +
                           ", Especial: " + (esEspecial ? "Sí" : "No"));
    }
}
