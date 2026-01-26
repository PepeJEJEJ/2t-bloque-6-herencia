package Gestion;

public class Pyme extends Empresa {

    private int numeroSedes;
    private int numeroSocios;

    public Pyme(String nombre, String cif, int numeroSedes, int numeroSocios) {
        super(nombre, cif);
        this.numeroSedes = numeroSedes;
        this.numeroSocios = numeroSocios;
    }
}