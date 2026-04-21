package CarteraInversion;

import java.util.Scanner;

public class Acciones extends Inversiones{
    Scanner sc = new Scanner(System.in);
    private String Pais;
    public Acciones(String Nombre, int CI, String Pais) {
        super(Nombre, CI);
        this.Pais=Pais;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }
}
