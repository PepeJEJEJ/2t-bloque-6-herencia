package Botanica;

public class MainHuerto {
    public static void main(String[] args) {

        Planta p1 = new Hortaliza("Tomate", "Julio");
        Planta p2 = new Aromatica("Romero", true);

        Planta[] lista = { p1, p2 };

        Parcela parcela = new Parcela(lista);

        System.out.println("Riego Tomate: " + p1.necesidadRiego(30));
        System.out.println("Riego Romero: " + p2.necesidadRiego(30));
    }
}
