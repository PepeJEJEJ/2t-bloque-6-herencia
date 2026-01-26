package Gestion;

public class GranEmpresa extends Empresa {

    private String sedePrincipal;
    private double patrimonio;

    public GranEmpresa(String nombre, String cif, String sedePrincipal, double patrimonio) {
        super(nombre, cif);
        this.sedePrincipal = sedePrincipal;
        this.patrimonio = patrimonio;
    }
}
