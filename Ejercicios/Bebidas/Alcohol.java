package Ejercicios.Bebidas;

public class Alcohol {
    private String Nombre;
    private String Marca;
    private int precioPlitro;
    private boolean elisir; /* Blue label de Jonnhy Walker */

    public Alcohol(String Nombre, String Marca, int precioPlitro, boolean elisir) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.precioPlitro = precioPlitro;
        this.elisir=elisir;
    if (elisir) {
        mostrarElisir();
    }
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

    public boolean getelisir() {
        return elisir;
    }

    public void setElisir(boolean elisir) {
        this.elisir = elisir;
        if (elisir) {
            mostrarElisir();
        }
    }

    private void mostrarElisir() {
        System.out.println("El mejor del mundo es el Blue Label de Johnnie Walker.\n"
                + "Nah, tampoco lo tomo porque un Johnnie Walker etiqueta negra lo tomo.\n"
                + "Pero cuando es algo especial, tomo un Blue Label: es un elixir.\n"
                + "Los otros son whisky: uno se toma, el otro se saborea.\n"
                + "El etiqueta negra es para después de las cenas.\n"
                + "El Blue Label es para cualquier hora: jamás te dará acidez ni gastritis.\n"
                + "Así vale la botella. Es un elisir.");
    }
    @Override
    public String toString() {
        return "Hay de la marca " + Marca + " algo LLamado " + Nombre + " Que vale " + precioPlitro + " Por litro";
    }
}