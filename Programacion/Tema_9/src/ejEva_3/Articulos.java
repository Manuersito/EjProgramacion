package ejEva_3;

public class Articulos {
    private int Proximocodigo;
    int codigo;
    String descripcion;
    double precio_compra;
    double precio_venta;
    int stock;

    
    public Articulos(String descripcion, double precio_compra, double precio_venta, int stock) {
        this.codigo = Proximocodigo++;
        this.descripcion = descripcion;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.stock = stock;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio_compra() {
        return precio_compra;
    }
    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }
    public double getPrecio_venta() {
        return precio_venta;
    }
    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Articulos [codigo=" + codigo + ", descripcion=" + descripcion + ", precio_compra=" + precio_compra
                + ", precio_venta=" + precio_venta + ", stock=" + stock + "]";
    }

    
}
