package Repaso2;

public class Main {
    public static void main(String[] args) {
        Profesor p1=new Profesor("Toca Melpito", 23, "Programacion");
        System.out.println(p1.toString());
        p1.setAsignatura("Base de Datos");
        System.out.println(p1.toString());
    }
}
