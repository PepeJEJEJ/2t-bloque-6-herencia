public class Acciones extends Activos {
    private String Pais;

    public Acciones(String Nombre, Double Cantidad, String Pais) {
        super(Nombre, Cantidad);
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return Nombre + " (" + Cantidad + ") en " + Pais;
    }
}
