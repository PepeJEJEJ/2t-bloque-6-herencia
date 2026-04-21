package CarteraInversion;

import java.util.Scanner;

public class Criptos extends Inversiones {
    Scanner sc = new Scanner(System.in);
    private Boolean Blockchain;
    public Criptos(String Nombre, int CI,Boolean Blockchain) {
        super(Nombre, CI);
        this.Blockchain=Blockchain;
    }
    public Boolean getBlockchain() {
        return Blockchain;
    }
    public void setBlockchain(Boolean blockchain) {
        Blockchain = blockchain;
    }
}
