package Repaso2;

public class Profesor{
    private String Nombre;
    private int Edad;
    private String Asignatura;
    public Profesor (String Nombre, int Edad, String Asignatura){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Asignatura=Asignatura;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getAsignatura() {
        return Asignatura;
    }
    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }
    @Override
    public String toString() {
        System.out.println(Nombre+""+Edad+""+Asignatura);
    return super.toString();
    }
}
