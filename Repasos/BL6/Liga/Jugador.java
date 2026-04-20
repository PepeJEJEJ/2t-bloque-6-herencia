package Liga;

public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private Equipo equipo;
    public Jugador(String nombre, int edad, String posicion, Equipo equipo){
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
        this.equipo=equipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Edad "+edad+" Posicion "+posicion;
    }
}
