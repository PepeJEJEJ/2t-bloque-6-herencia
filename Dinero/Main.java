package Dinero;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Ana", "12345678A", "Calle Luna 5", "ES123", 500);
        CuentaBancaria c2 = new CuentaBancaria("Luis", "87654321B", "Av. Sol 10", "ES456", 1000);

        c1.ingresar(200);
        c2.sacar(300);
        c1.sacar(100);

        c1.mostrarSaldo();
        c2.mostrarSaldo();

        System.out.println("Dinero total en el banco: " + Banco.dineroTotal + "€");
    }
}