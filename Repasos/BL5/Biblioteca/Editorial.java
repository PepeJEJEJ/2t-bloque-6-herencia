
public class Editorial {
    private String nombre;
    private String pais;
    private int cantidad;
    public Editorial(String nombre, String pais, int cantidad){
        this.nombre=nombre;
        this.pais=pais;
        this.cantidad=cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Pais: "+pais+" Cantidad: "+cantidad;
    }
}
