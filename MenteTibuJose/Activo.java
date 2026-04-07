public class Activo {
    private String nombre;
    private double cantidad;

    public Activo(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String toString() {
        return "Nombre: " + nombre + " Cantidad: " + cantidad;
    }
}
