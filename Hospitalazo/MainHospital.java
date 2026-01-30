// Main solo para pruebas (no se corrige en el examen)
public class MainHospital {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Ana López", "SS123", "Dolor de cabeza");
        Paciente p2 = new Paciente("Juan Pérez", "SS456", "Dolor de pecho");

        ZonaConsultas consultasCardio = new ZonaConsultas("Consultas cardiología");
        ZonaUrgencias urgenciasTrauma = new ZonaUrgencias("Urgencias traumatología");

        // Pruebas consultas
        consultasCardio.reservar(9, p1);
        consultasCardio.reservar(11, p2);
        System.out.println(consultasCardio.consultarEstado());

        // Pruebas urgencias
        int pos1 = urgenciasTrauma.reservar(p1);
        int pos2 = urgenciasTrauma.reservar(p2);
        System.out.println("Posición de " + p1.getNombreCompleto() + ": " + pos1);
        System.out.println("Posición de " + p2.getNombreCompleto() + ": " + pos2);
        System.out.println(urgenciasTrauma.consultarEstado());
    }
}
