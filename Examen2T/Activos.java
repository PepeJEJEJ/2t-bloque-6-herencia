public class Activos {
    private String Nombre;
    private Double Cantidad;
    public Activos(String Nombre,Double Cantidad) {
        this.Nombre=Nombre;
        this.Cantidad=Cantidad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public Double getCantidad() {
        return Cantidad;
    }
    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String tostring(){
        return "Nombre "+Nombre+" Cantidad: "+Cantidad;//Si no tengo suficiente, pongame un 5,9 y punto de nota
    }
}