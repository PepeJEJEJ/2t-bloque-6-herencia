package Repaso1;

class Tarjeta{
    private String marca;
    private int gb;
    public Tarjeta(String marca, int gb) {
        this.marca = marca;
        this.gb = gb;
    }
    public String getMarca() {
        return marca;
    }
    public int getGB() {
        return gb;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setGB(int gb) {
        this.gb = gb;
    }
    @Override
    public String toString() {
        return "Marca: " + marca + ", GB: " + gb;
    }
}