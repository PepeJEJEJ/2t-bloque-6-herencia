package Gestion;

import java.util.ArrayList;

public abstract class Empresa {

    protected String nombre;
    protected String cif;
    protected ArrayList<Gestor> gestoresAsignados = new ArrayList<>();

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    public void asignarGestor(Gestor g) {
        gestoresAsignados.add(g);
    }

    public void mostrarInfo() {
        System.out.println("\nEmpresa: " + nombre + " | CIF: " + cif);
        System.out.println("Gestores asignados:");
        for (Gestor g : gestoresAsignados) {
            System.out.println(" - " + g);
        }
    }
}
