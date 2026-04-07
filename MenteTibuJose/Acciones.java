public class Acciones extends Activo {
    private String pais;

    public Acciones(String nombre, double cantidad, String pais) {
        super(nombre, cantidad);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public String toString() {
        return super.toString() + " País: " + pais;
    }
}
