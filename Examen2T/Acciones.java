public class Acciones extends Activos{
    private String Pais;
    public Acciones(String Pais) {
        super(Nombre, Cantidad);
        this.Pais=Pais;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    @Override
    public String tostring(){
        return "Nombre "+Nombre+" Cantidad: "+Cantidad+" En "+Pais;
    }
}