package Pizzeria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza1 = new Pizza(null, null, null, null);
        
        String tamano = sc.nextLine();
        if (tamano.equals("pequenia")) {
            pizza1.setTamanio(Tamanio.pequenia);
        } else if (tamano.equals("mediana")) {
            pizza1.setTamanio(Tamanio.mediana);
        } else if (tamano.equals("grande")) {
            pizza1.setTamanio(Tamanio.grande);
        } else {
            System.out.println("NO SIRVE ESE TAMAÑO");
        }
        String ingredi = sc.nextLine();
        if (ingredi.equals("queso")) {
            pizza1.setIngredientes1(Ingredientes.queso);
        } else if (ingredi.equals("champiñones")) {
            pizza1.setIngredientes1(Ingredientes.champiñones);
        } else if (ingredi.equals("bacon")) {
            pizza1.setIngredientes1(Ingredientes.bacon);
        } else if (ingredi.equals("aceitunas")) {
            pizza1.setIngredientes1(Ingredientes.aceitunas);
        } else if (ingredi.equals("atún")) {
            pizza1.setIngredientes1(Ingredientes.atún);
        } else if (ingredi.equals("verduras")) {
            pizza1.setIngredientes1(Ingredientes.verduras);
        } else if (ingredi.equals("pollo")) {
            pizza1.setIngredientes1(Ingredientes.pollo);
        } else if (ingredi.equals("huevo")) {
            pizza1.setIngredientes1(Ingredientes.huevo);
        } else if (ingredi.equals("cebolla")) {
            pizza1.setIngredientes1(Ingredientes.cebolla);
        } else {
            System.out.println("No lo sabemos");
        }

        ingredi = sc.nextLine();
        if (ingredi.equals("queso")) {
            pizza1.setIngredientes2(Ingredientes.queso);
        } else if (ingredi.equals("champiñones")) {
            pizza1.setIngredientes2(Ingredientes.champiñones);
        } else if (ingredi.equals("bacon")) {
            pizza1.setIngredientes2(Ingredientes.bacon);
        } else if (ingredi.equals("aceitunas")) {
            pizza1.setIngredientes2(Ingredientes.aceitunas);
        } else if (ingredi.equals("atún")) {
            pizza1.setIngredientes2(Ingredientes.atún);
        } else if (ingredi.equals("verduras")) {
            pizza1.setIngredientes2(Ingredientes.verduras);
        } else if (ingredi.equals("pollo")) {
            pizza1.setIngredientes2(Ingredientes.pollo);
        } else if (ingredi.equals("huevo")) {
            pizza1.setIngredientes2(Ingredientes.huevo);
        } else if (ingredi.equals("cebolla")) {
            pizza1.setIngredientes2(Ingredientes.cebolla);
        } else {
            System.out.println("No lo sabemos");
        }

        ingredi = sc.nextLine();
        if (ingredi.equals("queso")) {
            pizza1.setIngredientes3(Ingredientes.queso);
        } else if (ingredi.equals("champiñones")) {
            pizza1.setIngredientes3(Ingredientes.champiñones);
        } else if (ingredi.equals("bacon")) {
            pizza1.setIngredientes3(Ingredientes.bacon);
        } else if (ingredi.equals("aceitunas")) {
            pizza1.setIngredientes3(Ingredientes.aceitunas);
        } else if (ingredi.equals("atún")) {
            pizza1.setIngredientes3(Ingredientes.atún);
        } else if (ingredi.equals("verduras")) {
            pizza1.setIngredientes3(Ingredientes.verduras);
        } else if (ingredi.equals("pollo")) {
            pizza1.setIngredientes3(Ingredientes.pollo);
        } else if (ingredi.equals("huevo")) {
            pizza1.setIngredientes3(Ingredientes.huevo);
        } else if (ingredi.equals("cebolla")) {
            pizza1.setIngredientes3(Ingredientes.cebolla);
        } else {
            System.out.println("No lo sabemos");
        }
        System.out.println(pizza1.calcularPrecio());
    }
}
