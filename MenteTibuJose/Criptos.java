public class Criptos extends Activo {
    private boolean blockchain;

    public Criptos(String nombre, double cantidad, boolean blockchain) {
        super(nombre, cantidad);
        this.blockchain = blockchain;
    }

    public boolean isBlockchain() {
        return blockchain;
    }

    public String toString() {
        return super.toString() + " Blockchain: " + blockchain;
    }
}
