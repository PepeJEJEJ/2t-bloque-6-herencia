package Codigos_Y_Mazmorras;

public class Heroe {
    private int id;
    private String nombre;
    private int vida;
    private int danio;
    private int fuerza;

    public Heroe(int id, String nombre, int vida, int danio, int fuerza){
        this.id=id;
        this.nombre=nombre;
        this.vida=vida;
        this.danio=danio;
        this.fuerza=fuerza;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDanio() {
        return danio;
    }
    public void setDanio(int danio) {
        this.danio = danio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
        public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int Fuerza) {
        this.fuerza = Fuerza;
    }
    @Override
    public String toString() {
        System.out.println(id + nombre + vida + danio + fuerza);
        return nombre;
    }
}