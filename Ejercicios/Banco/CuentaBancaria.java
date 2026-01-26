package Banco;

public class CuentaBancaria {

    private String nombre;
    private String dni;
    private String direccion;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String nombre, String dni, String direccion, String numeroCuenta, double saldoInicial) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;

        Banco.dineroTotal += saldoInicial;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
        Banco.dineroTotal += cantidad;
    }

    public void sacar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= cantidad;
        Banco.dineroTotal -= cantidad;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + nombre + ": " + saldo + "€");
    }
}
