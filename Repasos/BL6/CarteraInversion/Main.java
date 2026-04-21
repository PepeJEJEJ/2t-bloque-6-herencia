package CarteraInversion;

public class Main {
    public static void main(String[] args) {
        Acciones acciones1 = new Acciones("Petroleo", 20, "Venezuela");
        Criptos criptos1 = new Criptos("Memecoin", 10,true);
        Clientes cliente1 = new Clientes("Aguilar", 3414241, 11);
        int total = 0;
        if (acciones1 != null) {
            total += acciones1.Calc();
        }
        if (criptos1 != null) {
            total += criptos1.Calc();
        }
        System.out.println(cliente1.getNombre()+", Tus acciones valen un total de: "+total);
    }
}
