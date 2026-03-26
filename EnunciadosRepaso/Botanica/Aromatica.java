package Botanica;

public class Aromatica extends Planta {
    private boolean perenne;

    public Aromatica(String nombre, boolean perenne) {
        super(nombre);
        this.perenne = perenne;
    }

    @Override
    public int necesidadRiego(int temperatura) {
        return perenne ? 1 : 2;
    }
}