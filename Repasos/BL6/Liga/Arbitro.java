package Liga;

public class Arbitro {
    private String nombre;
    private int edad;
    private String categoria;
    public Arbitro(String nombre, int edad, String categoria){
        this.nombre=nombre;
        this.edad=edad;
        this.categoria=categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" edad "+edad+" categoria "+categoria;
    }
}
