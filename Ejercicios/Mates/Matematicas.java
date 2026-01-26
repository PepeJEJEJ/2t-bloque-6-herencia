package Mates;

public class Matematicas {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: división entre cero");
            return 0;
        }
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
