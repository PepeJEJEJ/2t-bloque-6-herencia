
public class Habitacion {
    private String nombre;
    private int lado1;
    private int lado2;
    public Habitacion(String nombre, int lado1, int lado2){
        this.nombre=nombre;
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }//METODO
    public int superficie(){
        return lado1*lado2;
    }

    @Override
    public String toString() {
        return"Nose";
    }
}
