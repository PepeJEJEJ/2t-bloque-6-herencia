public class EmpleadoHoras extends Empleado {

    private int horas;
    private double precioHora;

    public EmpleadoHoras(String nombre, int horas, double precioHora) {
        super(nombre);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSueldo() {
        return horas * precioHora;
    }
}