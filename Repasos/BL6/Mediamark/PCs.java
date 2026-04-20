package Mediamark;

public class PCs {
    private String marca;
    private int ram;
    private String procesador;
    private int precio;
    public PCs(String marca, int ram, String procesador, int precio){
        this.marca=marca;
        this.ram=ram;
        this.procesador=procesador;
        this.precio=precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
}
