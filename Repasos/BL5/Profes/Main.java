package Profes;
public class Main {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento("Ida", 214421, "Metanfetamina");
        Departamento departamento2 = new Departamento("Gordo", 421, "Fuentealbilla");
        Profesor profesor1 = new Profesor("Skully", "Porrofilosofia", 23, departamento1);
        Profesor profesor2 = new Profesor("Kull", "Drogas", 20, departamento2);
        System.out.println(profesor1);
        System.out.println(profesor2);
    }
}
