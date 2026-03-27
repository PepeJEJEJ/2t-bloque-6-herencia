public class Criptos extends Activos {
    private boolean Blockchain;

    public Criptos(String Nombre, Double Cantidad, boolean Blockchain) {
        super(Nombre, Cantidad);
        this.Blockchain = Blockchain;
    }

    @Override
    public String toString() {
        return Nombre + " (" + Cantidad + ") Blockchain: " + Blockchain;
    }
}

}
