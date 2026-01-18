package Calendario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Los dias:");
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
        System.out.println("Selecciona un dia: ");
        String diaInput = scanner.nextLine().toUpperCase();
        DiaSemana diaSeleccionado = DiaSemana.valueOf(diaInput);
        System.out.println("Dia seleccionado: " + diaSeleccionado);
        
        System.out.println("\nLos Meses");
        for (Meses mes : Meses.values()) {
            System.out.println(mes);
        }
        System.out.println("Selecciona un mes: ");
        String mesInput = scanner.nextLine().toUpperCase();
        Meses mesSeleccionado = Meses.valueOf(mesInput);
        System.out.println("Mes seleccionado: " + mesSeleccionado);
        
        scanner.close();
    }
}
