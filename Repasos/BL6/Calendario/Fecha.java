package Calendario;

public class Fecha {
    private int dia;
    private int mes;
    private int anno;

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int DarDia() {
        return dia;
    }

    public int DarMes() {
        return mes;
    }

    public int DarAnno() {
        return anno;
    }

    public String DarFecha() {
        return dia + "/" + mes + "/" + anno;
    }

    public Estaciones DarEstacion() {
        Estaciones resultado = Estaciones.Invierno;
        switch (mes) {
            case 1:
                resultado = Estaciones.Invierno;
                break;
            case 2:
                resultado = Estaciones.Invierno;
                break;
            case 3:
                if (dia < 21) {
                    resultado = Estaciones.Invierno;
                } else {
                    resultado = Estaciones.Primavera;
                }
                break;
            case 4:
                resultado = Estaciones.Primavera;
                break;
            case 5:
                resultado = Estaciones.Primavera;
                break;
            case 6:
                if (dia < 21) {
                    resultado = Estaciones.Primavera;
                } else {
                    resultado = Estaciones.Verano;
                }
                break;
            case 7:
                resultado = Estaciones.Verano;
                break;
            case 8:
                resultado = Estaciones.Verano;
                break;
            case 9:
                if (dia < 21) {
                    resultado = Estaciones.Verano;
                } else {
                    resultado = Estaciones.Otonio;
                }
                break;
            case 10:
                resultado = Estaciones.Otonio;
                break;
            case 11:
                resultado = Estaciones.Otonio;
                break;
            case 12:
                if (dia < 21) {
                    resultado = Estaciones.Otonio;
                } else {
                    resultado = Estaciones.Invierno;
                }
                break;
        }
        return resultado;
    }

    public int centuria() {
        return (anno / 100) + 1;
    }
}