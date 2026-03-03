// Indica el paquete al que pertenece la clase.
// Sirve para organizar las clases dentro del proyecto.
package Trabajo;

// Definición de la clase pública llamada Producto.
// Representa un producto dentro de un sistema (por ejemplo, una tienda).
public class Producto {

    // ====== ATRIBUTOS (variables de la clase) ======

    // Identificador único del producto
    private int id;

    // Nombre del producto
    private String nombre;

    // Precio del producto
    private double precio;

    // Cantidad disponible en el inventario
    private int cantidadStock;


    // ====== CONSTRUCTOR ======

    // Constructor: se ejecuta cuando se crea un objeto Producto.
    // Sirve para inicializar los atributos con valores.
    public Producto(int id, String nombre, double precio, int cantidadStock) {

        // "this" se usa para diferenciar los atributos de la clase
        // de los parámetros que llegan al constructor.
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }


    // ====== MÉTODOS GETTERS Y SETTERS ======

    // Getter: devuelve el valor del id
    public int getId() {
        return id;
    }

    // Setter: permite modificar el id
    public void setId(int id) {
        this.id = id;
    }

    // Getter: devuelve el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Setter: permite modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter: devuelve el precio
    public double getPrecio() {
        return precio;
    }

    // Setter: permite modificar el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter: devuelve la cantidad en stock
    public int getCantidadStock() {
        return cantidadStock;
    }

    // Setter: permite modificar la cantidad en stock
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }


    // ====== MÉTODO toString ======

    // Este método devuelve el objeto en formato texto.
    // Es útil cuando se imprime el objeto con System.out.println()
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidadStock=" + cantidadStock
                + "]";
    }
}
