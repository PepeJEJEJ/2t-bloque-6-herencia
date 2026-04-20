public class PC {
    private String marca;
    private int ram;
    private String procesador;
    private double precio;

    public PC(String marca, int ram, String procesador, double precio) {
        this.marca = marca;
        this.ram = ram;
        this.procesador = procesador;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getRam() {
        return ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return marca + " - " + ram + "GB - " + procesador + " - " + precio + "€";
    }
}
