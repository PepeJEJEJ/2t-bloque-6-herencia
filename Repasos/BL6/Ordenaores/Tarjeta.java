package Ordenaores;

public class Tarjeta {
    private String marca;
    private int memoria;
    public Tarjeta(String marca, int memoria){
        this.marca=marca;
        this.memoria=memoria;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    @Override
    public String toString() {
        return "Tarjeta de marca "+marca+" de "+memoria+" memoria";
    }
}