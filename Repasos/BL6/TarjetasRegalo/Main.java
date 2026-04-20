package TarjetasRegalo;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjetaRegalo = new Tarjeta("nullo", 110, 11);
        System.out.println(tarjetaRegalo.getSaldo());
        tarjetaRegalo.gastar(110);
        System.out.println(tarjetaRegalo.getSaldo());
        tarjetaRegalo.recargar(21);
        System.out.println(tarjetaRegalo.getSaldo());

    }
}
