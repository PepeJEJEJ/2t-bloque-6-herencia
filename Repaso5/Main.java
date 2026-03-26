public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoFijo("Ana", 1500);
        empleados[1] = new EmpleadoHoras("Luis", 40, 12.5);
        empleados[2] = new EmpleadoHoras("Marta", 30, 10);
        for (Empleado e : empleados) {
            e.trabajar();
            System.out.println("Sueldo: " + e.calcularSueldo());
        }
        Producto p1 = new Producto("Pan", 1.2);
        Producto p2 = new Producto("Leche", 0.95);
        ProductoDescuento p3 = new ProductoDescuento("Café", 3.5, 10);
        System.out.println("Productos creados: " + Producto.getContadorProductos());
    }
}