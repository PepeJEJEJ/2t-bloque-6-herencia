public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mediamarkt Jaén", "Juan");

        tienda.agregarPC(new PC("HP", 16, "i7", 899));
        tienda.agregarPC(new PC("Lenovo", 8, "i5", 599));
        tienda.agregarPC(new PC("Asus", 32, "Ryzen 7", 1299));

        tienda.buscarPorMarca("HP");
        tienda.buscarPorRam(32);
        tienda.buscarPorProcesador("i5");
        tienda.obtenerListadoCompleto();
    }
}
