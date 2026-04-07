import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int dni;
    private Activo[] inversiones;
    private int contador;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.inversiones = new Activo[100];
        this.contador = 0;
    }

    public void agregarInversion(Activo a) {
        inversiones[contador] = a;
        contador++;
    }

    // MÉTODO QUE PREGUNTA PRECIOS Y CALCULA EL TOTAL
    public void calcularValorTotal() {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i < contador; i++) {
            Activo a = inversiones[i];
            System.out.print("¿A cuánto está " + a.getNombre() + " actualmente? ");
            while (!sc.hasNextDouble()) {
                System.out.print("Introduce un número válido: ");
                sc.next();
            }
            double precio = sc.nextDouble();
            total += precio * a.getCantidad();
        }

        System.out.println("Tus acciones valen un total de " + total);
    }
}
