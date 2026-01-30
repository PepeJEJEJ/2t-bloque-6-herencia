// Zona de Consultas
public class ZonaConsultas extends Zona {

    // 7 citas: 8, 9, 10, 11, 12, 13, 14
    private Paciente[] agenda; // índice 0 -> 8:00, índice 6 -> 14:00

    public ZonaConsultas(String nombreZona) {
        super(nombreZona);
        this.agenda = new Paciente[7];
    }

    // Convierte una hora a índice de array (8-14)
    private int horaAIndice(int hora) {
        if (hora < 8 || hora > 14) {
            return -1;
        }
        return hora - 8;
    }

    // reservar: recibe hora y paciente, devuelve true si se reserva, false si no
    public boolean reservar(int hora, Paciente paciente) {
        int indice = horaAIndice(hora);
        if (indice == -1) {
            return false; // hora fuera de rango
        }
        if (agenda[indice] == null) {
            agenda[indice] = paciente;
            return true;
        }
        return false; // ya ocupada
    }

    // consultarEstado: devuelve qué horas están ocupadas y por quién
    @Override
    public String consultarEstado() {
        String resultado = "Estado de " + nombreZona + ":\n";
        int hora = 8;
        for (int i = 0; i < agenda.length; i++) {
            resultado += hora + ":00 - ";
            if (agenda[i] == null) {
                resultado += "LIBRE\n";
            } else {
                resultado += agenda[i].getNombreCompleto() + "\n";
            }
            hora++;
        }
        return resultado;
    }
}
