public class Vehiculo {
    private String marca;
    private String modelo;
    private int km;
    private int puertas;
    private int cv;
    private boolean electrico;

    public Vehiculo(String ma, String mo, int k, int p, int c, boolean e) {
        this.marca = ma;
        this.modelo = mo;
        this.km = k;
        this.puertas = p;
        this.cv = c;
        this.electrico = e;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return "Coche {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                ", puertas=" + puertas +
                ", cv=" + cv +
                ", electrico=" + electrico +
                '}';
    }
}
