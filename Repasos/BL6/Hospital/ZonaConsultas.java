package Hospital;

public class ZonaConsultas extends Zona {
    Paciente[] array;

    public ZonaConsultas(String nombreZona) {
        super(nombreZona);
        array = new Paciente[7];
    }

    public boolean reservar(int hora, Paciente paciente) {
        int indice = 0;
        if (hora == 8) {
            indice = 0;
        } else if (hora == 9) {
            indice = 1;
        } else if (hora == 10) {
            indice = 2;
        } else if (hora == 11) {
            indice = 3;
        } else if (hora == 12) {
            indice = 4;
        } else if (hora == 13) {
            indice = 5;
        } else if (hora == 14) {
            indice = 6;
        } else {
            System.out.println("nel");
            return false;
        }
        if (array[indice] == null) {
            array[indice] = paciente;
            return true;
        } else {
            return false;
        }

    }

    public String consultarEstado(){
        String resultado="";
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null) {
                resultado+=(i+8)+" Libre ";
            } else {
                resultado+=(i+8)+" Ocupado por "+array[i].getNombre();
            }
        }
        return resultado;
    }
}