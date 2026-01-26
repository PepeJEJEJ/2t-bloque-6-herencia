package Balatreate;

public abstract class Carta {

    protected String palo;
    protected int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public abstract void mostrarCarta();
}
