package Gestion;

public abstract class Empresa {

    protected String nombre;
    protected String cif;

    // Array normal de tamaño fijo
    protected Gestor[] gestoresAsignados = new Gestor[20];
    protected int numGestores = 0;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    public void asignarGestor(Gestor g) {
        if (numGestores < gestoresAsignados.length) {
            gestoresAsignados[numGestores] = g;
            numGestores++;
        } else {
            System.out.println("No se pueden asignar más gestores.");
        }
    }

    public void mostrarInfo() {
        System.out.println("\nEmpresa: " + nombre + " | CIF: " + cif);
        System.out.println("Gestores asignados:");
        for (int i = 0; i < numGestores; i++) {
            System.out.println(" - " + gestoresAsignados[i]);
        }
    }
}
