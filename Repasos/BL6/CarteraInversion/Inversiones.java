package CarteraInversion;
import java.util.Scanner;

public class Inversiones {
    Scanner sc=new Scanner(System.in);
    private String Nombre;
    protected int CI;
    public Inversiones(String Nombre,int CI){
        this.Nombre=Nombre;
        this.CI=CI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCI() {
        return CI;
    }
    public void setCI(int cI) {
        CI = cI;
    }
    public int Calc() {
        System.out.println("Dame el precio de INVERSIÓN");
        int Precio = sc.nextInt();
        return Precio * CI;
    }

}
