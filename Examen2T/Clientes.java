public class Clientes {
    private String Nombre;
    private int DNI;
    private Acciones accion;
    public Clientes(String Nombre,int DNI) {
        this.Nombre=Nombre;
        this.DNI=DNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    // SE ME HABIA ATASCADO EL VERICODE
    //OTRA VEZ ATASCAO
    //ATASCO
    //DEMASIADOS ATASCOS
    //SE ME ATASCO
        public int Calculo() {//MIRA ESTO COMO PSEUDOCODIGO
        return Criptos * Acciones + Acciones*Cantidad;
    }
    }
    public String tostring(){
        return "Nombre "+Nombre+" DNI: "+DNI+" En "+accion;
    }
}