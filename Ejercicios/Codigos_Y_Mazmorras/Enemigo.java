package Codigos_Y_Mazmorras;

public class Enemigo extends Heroe{
    private int poderMagico;
    private String tipoEnemigo;
    public Enemigo(int id, String nombre, int vida, int danio, int fuerza, int poderMagico, String tipoEnemigo) {
        super(id, nombre, vida, danio, fuerza);
        this.poderMagico=poderMagico;
        this.tipoEnemigo=tipoEnemigo;
    }
    public int getpoderMagico() {
        return poderMagico;
    }
    public String getTipoEnemigo() {
        return tipoEnemigo;
    }

}