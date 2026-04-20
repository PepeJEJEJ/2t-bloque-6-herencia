package Hospital;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1=new Paciente("Pedro", 23330, "Mental");
        Paciente paciente2=new Paciente("Kull", 12440, "Emocional");
        Paciente paciente3=new Paciente("Alberto", 31310, "Fisica");
        ZonaConsultas zonaConsultas1=new ZonaConsultas("Consultoria 1");
        ZonaUrgencias zonaUrgencias1=new ZonaUrgencias("UCI", paciente3);
        zonaConsultas1.reservar(8,paciente1);
        zonaConsultas1.reservar(9,paciente2);
        zonaConsultas1.reservar(10,paciente3);
        zonaUrgencias1.reservar(paciente3);
        System.out.println(zonaConsultas1.consultarEstado());
        System.out.println(zonaUrgencias1.consultarEstado());
    }
}
