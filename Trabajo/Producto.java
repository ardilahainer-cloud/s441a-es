package Trabajo;

public class Producto {
    int id;
    String nombre;
    double precio;
    int cantidaStock;
    public Producto(int id, String nombre, double precio, int cantidaStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidaStock = cantidaStock;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidaStock() {
        return cantidaStock;
    }
    public void setCantidaStock(int cantidaStock) {
        this.cantidaStock = cantidaStock;
    }
    
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidaStock=" + cantidaStock
                + "]";
    }
}
