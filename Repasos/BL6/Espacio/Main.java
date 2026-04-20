package Espacio;

public class Main {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Euras I", 3, 9.6, 20, 1, true);
        Planeta planeta2 = new Planeta("Agartha II", 5, 5.6, 12, 2, false);
        Planeta planeta3 = new Planeta("Uridia III", 1, 7.2, 30, 9, true);

        if (planeta1.getDistanciaSolar() > planeta2.getDistanciaSolar()
                && planeta2.getDistanciaSolar() > planeta3.getDistanciaSolar()) {
            System.out.println(planeta1);
            System.out.println(planeta2);
            System.out.println(planeta3);
        } else if (planeta1.getDistanciaSolar() < planeta2.getDistanciaSolar()
                && planeta1.getDistanciaSolar() < planeta2.getDistanciaSolar()) {
            System.out.println(planeta3);
            System.out.println(planeta2);
            System.out.println(planeta1);
        } else if (planeta1.getDistanciaSolar() > planeta2.getDistanciaSolar()
                && planeta1.getDistanciaSolar() < planeta2.getDistanciaSolar()) {
            System.out.println(planeta3);
            System.out.println(planeta1);
            System.out.println(planeta2);
        } else if (planeta1.getDistanciaSolar() < planeta2.getDistanciaSolar()
                && planeta1.getDistanciaSolar() > planeta2.getDistanciaSolar()) {
            System.out.println(planeta2);
            System.out.println(planeta1);
            System.out.println(planeta3);
        } else {
            System.out.println(planeta1);
            System.out.println(planeta3);
            System.out.println(planeta2);
        }
    }
}