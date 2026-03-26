public class Carrito {
    private String cliente;
    private Producto producto;
    public Carrito(String cliente,Producto producto){
        this.cliente=cliente;
        this.producto=producto;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    @Override
    public String toString() {
        return producto+" cliente: "+cliente;
    }
}
