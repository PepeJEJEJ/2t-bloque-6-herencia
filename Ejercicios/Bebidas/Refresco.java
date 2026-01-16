package Ejercicios.Bebidas;


public class Refresco {
    private String Nombre;
    private String Marca;
    private int precioPlitro;

    public Refresco(String Nombre, String Marca, int precioPlitro) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.precioPlitro = precioPlitro;
    }
    public String getNombre() {
        return Marca;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public int getPrecioPlitro() {
        return precioPlitro;
    }
    public void setPrecioPlitro(int precioPlitro) {
        this.precioPlitro = precioPlitro;
    }
    @Override
    public String toString() {
        return "Hay de la marca " + Marca + " algo LLamado " + Nombre + " Que vale " + precioPlitro + " Por litro";
    }
}