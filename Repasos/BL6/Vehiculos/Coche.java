package Vehiculos;

public class Coche {
    private int nRuedas;
    private boolean electrico;
    private String marca;
    private String modelo;
    public Coche(int nRuedas,boolean electrico,String marca,String modelo){
        this.nRuedas=nRuedas;
        this.electrico=electrico;
        this.marca=marca;
        this.modelo=modelo;
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
    public int getnRuedas() {
        return nRuedas;
    }
    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    @Override
    public String toString() {
        return "Coche de marca: "+marca+" modelo "+modelo+" con "+nRuedas+" ruedas y electrico:"+electrico;
    }
}