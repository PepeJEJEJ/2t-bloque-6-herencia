import java.util.Scanner;

public class Clientes {
    private String Nombre;
    private int DNI;
    private Criptos cripto;
    private Acciones accion;

    public Clientes(String Nombre, int DNI, Criptos cripto, Acciones accion) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.cripto = cripto;
        this.accion = accion;
    }

    public double calcularValor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del Bitcoin: ");
        double precioBitcoin = sc.nextDouble();

        System.out.print("Introduce el precio de la Acción: ");
        double precioAccion = sc.nextDouble();

        double valorCripto = cripto.getCantidad() * precioBitcoin;
        double valorAccion = accion.getCantidad() * precioAccion;

        return valorCripto + valorAccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + Nombre + " DNI: " + DNI +
               "\nCriptos: " + cripto +
               "\nAcciones: " + accion;
    }
}
