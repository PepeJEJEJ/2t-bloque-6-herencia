public class EmpleadoFijo extends Empleado {

    private double sueldoBase;

    public EmpleadoFijo(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}