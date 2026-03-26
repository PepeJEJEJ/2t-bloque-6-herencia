package Botanica;

public class Hortaliza extends Planta {
    private String mesCosecha;

    public Hortaliza(String nombre, String mesCosecha) {
        super(nombre);
        this.mesCosecha = mesCosecha;
    }

    @Override
    public int necesidadRiego(int temperatura) {
        return temperatura > 25 ? 3 : 2;
    }
}