// Zona de Urgencias
public class ZonaUrgencias extends Zona {

    private Paciente[] listaEspera; // máximo 10 pacientes

    public ZonaUrgencias(String nombreZona) {
        super(nombreZona);
        this.listaEspera = new Paciente[10];
    }

    // reservar: recibe paciente, lo añade a la lista si hay hueco
    // devuelve la posición (1..10) o -1 si está llena
    public int reservar(Paciente paciente) {
        for (int i = 0; i < listaEspera.length; i++) {
            if (listaEspera[i] == null) {
                listaEspera[i] = paciente;
                return i + 1; // posición humana
            }
        }
        return -1; // no hay huecos
    }

    // consultarEstado: devuelve nombres en espera y huecos libres
    @Override
    public String consultarEstado() {
        String resultado = "Lista de espera de " + nombreZona + ":\n";
        int huecosLibres = 0;

        for (int i = 0; i < listaEspera.length; i++) {
            resultado += "Posición " + (i + 1) + ": ";
            if (listaEspera[i] == null) {
                resultado += "LIBRE\n";
                huecosLibres++;
            } else {
                resultado += listaEspera[i].getNombreCompleto() + "\n";
            }
        }

        resultado += "Huecos libres: " + huecosLibres + "\n";
        return resultado;
    }
}
