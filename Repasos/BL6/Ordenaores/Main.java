package Ordenaores;

public class Main {
    public static void main(String[] args) {
        Tarjeta memoria1 = new Tarjeta("Kull", 10);
        Tarjeta memoria2 = new Tarjeta("Skral", 20);
        PC pc1 = new PC("Uiei", memoria1);
        PC pc2 = new PC("Eler", memoria2);
        pc1.setMemoria(memoria1);
        pc2.setMemoria(memoria2);
        if (pc1.MasMemo(pc2)) {
            System.out.println(pc1+" Mayor o Igual a "+pc2);
        } else {
            System.out.println(pc2+" Menor Que "+pc1);
        }
    }
}
