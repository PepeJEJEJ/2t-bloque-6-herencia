package Repaso1;

class PC {
    private String marcaPC;
    public PC(String marcaPC) {
        this.marcaPC = marcaPC;
    }
    public String getmarcaPC() {
        return marcaPC;
    }
    public void setMarca(String marcaPC) {
        this.marcaPC = marcaPC;
    }
    @Override
    public String toString() {
        return "Marca: " + marcaPC;
    }
}