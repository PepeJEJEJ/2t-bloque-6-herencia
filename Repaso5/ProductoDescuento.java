public class ProductoDescuento extends Producto {
    private double descuento;
    public ProductoDescuento(String nombre, double precio, double descuento) {
        super(nombre, precio);
        this.descuento=descuento;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public String toString() {
        return super.toString()+" Tiene descuento del: "+descuento;
    }
}
