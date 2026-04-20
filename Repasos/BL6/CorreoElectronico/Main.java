package CorreoElectronico;

public class Main {
    public static void main(String[] args) {
        Email email1=new Email("PedroAlmadenas@gmail.com", "AAA124");
        if (email1.EsSegura()==true) {
            System.out.println("Es segura");
        } else {
            System.out.println("No lo es");
        }
    }
}
