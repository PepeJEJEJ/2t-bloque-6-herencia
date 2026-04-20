package Profes;
public class Profesor {
    private String nombre;
    private String asignatura;
    private int edad;
    private Departamento departamento;
    public Profesor (String nombre,String asignatura,int edad,Departamento departamento){
        this.nombre=nombre;
        this.asignatura=asignatura;
        this.edad=edad;
        this.departamento=departamento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Asignatura: "+asignatura+" Departamento "+departamento+" Edad "+edad;
    }
}