public class Main {
    public static void main(String[] args) {

        Criptos btc = new Criptos("Bitcoin", 0.5, true);
        Acciones acc = new Acciones("Tesla", 10.0, "USA");

        Clientes cliente = new Clientes("Pepe", 12345678, btc, acc);

        System.out.println(cliente);

        double total = cliente.calcularValor();

        System.out.println("Valor total del cliente: " + total + " €");
    }
}
