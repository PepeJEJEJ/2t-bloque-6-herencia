public class Main {
    public static void main(String[] args) {

        Cliente marcos = new Cliente("Marcos", 12345678);

        Criptos bitcoin = new Criptos("Bitcoin", 0.1, true);
        Acciones apple = new Acciones("Apple", 10, "USA");

        marcos.agregarInversion(bitcoin);
        marcos.agregarInversion(apple);

        marcos.calcularValorTotal();
    }
}
