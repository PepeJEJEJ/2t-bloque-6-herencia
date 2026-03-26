public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando...");
    }

    public abstract double calcularSueldo();
}