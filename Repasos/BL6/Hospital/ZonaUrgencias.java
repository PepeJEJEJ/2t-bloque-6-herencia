package Hospital;

public class ZonaUrgencias extends Zona {
    Paciente[] array;

    public ZonaUrgencias(String nombreZona, Paciente paciente) {
        super(nombreZona);
        array = new Paciente[10];
    }
    public int reservar(Paciente paciente) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null) {
                array[i]=paciente;
                return i+1;
            }
        }
        return -1;
    }
    public String consultarEstado(){
        String resultado="";
        int valor=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null) {
                resultado+=(i+1)+" libre, ";
                valor+=1;
            } else {
                resultado+=(i+1)+" ocupado, ";
            }
        }
        resultado+="huecos libres"+valor;
        return resultado;
    }
}