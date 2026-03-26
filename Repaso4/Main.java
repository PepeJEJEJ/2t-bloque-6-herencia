public class Main {
    public static void main(String[] args) {
        Direccion direccion1=new Direccion("A",33);
        Persona persona1=new Persona("Que", 20, direccion1);
        Direccion direccion2=new Direccion("E",13);
        Persona persona2=new Persona("So", 18, direccion2);
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona1.esMayorEdad());
        System.out.println(persona2.esMayorEdad());
    }
}
