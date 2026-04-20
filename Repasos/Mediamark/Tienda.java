import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String propietario;
    private ArrayList<PC> ordenadores;

    public Tienda(String nombre, String propietario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.ordenadores = new ArrayList<>();
    }

    public void agregarPC(PC pc) {
        ordenadores.add(pc);
    }

    public void buscarPorMarca(String marca) {
        for (PC pc : ordenadores) {
            if (pc.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(pc);
            }
        }
    }

    public void buscarPorRam(int ram) {
        for (PC pc : ordenadores) {
            if (pc.getRam() == ram) {
                System.out.println(pc);
            }
        }
    }

    public void buscarPorProcesador(String procesador) {
        for (PC pc : ordenadores) {
            if (pc.getProcesador().equalsIgnoreCase(procesador)) {
                System.out.println(pc);
            }
        }
    }

    public void obtenerListadoCompleto() {
        for (PC pc : ordenadores) {
            System.out.println(pc);
        }
    }
}
