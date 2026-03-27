public class Criptos extends Activos{
    private boolean Blockchain;
    public Criptos(boolean Blockchain) {
        super(Nombre, Cantidad);
        this.Blockchain=Blockchain;
    }
    public boolean getBlockchain() {
        return Blockchain;
    }
    public void setBlockchain(boolean Blockchain) {
        this.Blockchain = Blockchain;
    }
    @Override
    public String tostring(){
        return "Nombre "+Nombre+" Cantidad: "+Cantidad+" Es blockchain "+Blockchain;
    }
}