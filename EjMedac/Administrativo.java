public class Administrativo extends Persona { // Esto es que Admin hereda de Persona
    private String departamento;
    private int horasExtras;

    public Administrativo(String nombre, String apellidos, String dni, String email,
                          String departamento, int horasExtras) {// Declaramos las propiedades
        super(nombre, apellidos, dni, email);// Propiedades de la superclase
        this.departamento = departamento;
        this.horasExtras = horasExtras;
    }

    public double pagaHorasExtras(double precioHora) {// Metodo
        return horasExtras * precioHora;
    }

    @Override
    public String toString() {// Tostring
        return super.toString() +
               ", Departamento: " + departamento +
               ", Horas extras/mes: " + horasExtras;
    }

    @Override
    public String mostrarDetalles() { //Sobrescribir metodo
        return nombre + " " + apellidos +
               " trabaja en " + departamento +
               " y realiza " + horasExtras + " horas extras al mes.";
    }
}
