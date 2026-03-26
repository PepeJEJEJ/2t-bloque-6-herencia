public class Persona {
    private String nombre;
    private int edad;
    private Direccion domicilio;
    public Persona(String nombre, int edad,Direccion domicilio){
        this.nombre=nombre;
        this.edad=edad;
        this.domicilio=domicilio;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Direccion getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }
    public boolean esMayorEdad() {
        if (edad>17) {
            System.out.println("Es mayor:");
            return true;
        } else {
            System.out.println("Es mayor:");
            return false;
        }
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" edad "+edad+" que vive en "+domicilio;
    }
}
