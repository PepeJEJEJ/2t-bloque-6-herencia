package Espacio;

public class Planeta {
    private String nombre;
    private int nSatelites;
    private double diametro;
    private double distanciaSolar;
    private int tipo;
    private boolean observable;

    public Planeta(String nombre, int nSatelites, double diametro, double distanciaSolar, int tipo,
            boolean observable) {
        this.nombre = nombre;
        this.nSatelites = nSatelites;
        this.diametro = diametro;
        this.distanciaSolar = distanciaSolar;
        this.tipo = tipo;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnSatelites() {
        return nSatelites;
    }

    public void setnSatelites(int nSatelites) {
        this.nSatelites = nSatelites;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaSolar() {
        return distanciaSolar;
    }

    public void setDistanciaSolar(double distanciaSolar) {
        this.distanciaSolar = distanciaSolar;
    }

    public int getint() {
        return tipo;
    }

    public void setint(int tipo) {
        this.tipo = tipo;
    }

    public String Ver() {
        if (observable == true) {
            return "es visible";
        } else {
            return "no es visible";
        }
    }

    public Tipo Queso() {
        if (tipo == 1) {
            return Tipo.Terrestre;
        } else if (tipo == 2) {
            return Tipo.Gaseoso;
        } else if (tipo == 3) {
            return Tipo.Enano;
        } else {
            return null;

        }
    }

    @Override
    public String toString() {
        return "Planeta llamado " + nombre + " Con " + nSatelites + " Satelites, que Mide " + diametro
                + " de diametro y esta a " + distanciaSolar + " UAs del sol, es de tipo " + Queso() + " y " + Ver();
    }

}