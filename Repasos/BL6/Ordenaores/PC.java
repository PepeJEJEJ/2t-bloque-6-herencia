package Ordenaores;

public class PC {
    private String marca;
    private Tarjeta tarjeta;

    public PC(String marca, Tarjeta memoria) {
        this.marca = marca;
        this.tarjeta = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Tarjeta getMemoria() {
        return tarjeta;
    }

    public void setMemoria(Tarjeta memoria) {
        this.tarjeta = memoria;
    }
    
    public boolean MasMemo(PC p){
        return this.tarjeta.getMemoria()>=p.tarjeta.getMemoria();
    }

    @Override
    public String toString() {
        return "PC de Marca " + marca + " con " + tarjeta;
    }
}
