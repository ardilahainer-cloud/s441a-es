package Trabajo;

public class Principal {

    public static void main(String[] args) {

        // Crear inventario con capacidad 5
        Inventario inventario = new Inventario(5);

        // Crear productos
        Producto p1 = new Producto(1, "Laptop", 2500.0, 10);
        Producto p2 = new Producto(2, "Mouse", 50.0, 3);
        Producto p3 = new Producto(3, "Teclado", 120.0, 2);
        Producto p4 = new Producto(4, "Monitor", 800.0, 7);

        // Agregar productos
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        System.out.println("=== INVENTARIO ORIGINAL ===");
        inventario.mostrarInventario();

        // Buscar producto
        System.out.println("\n=== BUSCAR PRODUCTO ID 2 ===");
        Producto buscado = inventario.buscarPorId(2);
        System.out.println(buscado);

        // Actualizar stock
        System.out.println("\n=== ACTUALIZAR STOCK ID 2 ===");
        inventario.actualizarStock(2, 15);
        inventario.mostrarInventario();

        // Valor total
        System.out.println("\n=== VALOR TOTAL INVENTARIO ===");
        double total = inventario.generarInformeValorTotal();
        System.out.println("Total: " + total);

        // Productos agotados
        System.out.println("\n=== PRODUCTOS CON STOCK < 5 ===");
        Producto[] agotados = inventario.obtenerProductosAgotados();
        for (Producto p : agotados) {
            System.out.println(p);
        }

        // Ordenar por precio descendente
        System.out.println("\n=== ORDENADO POR PRECIO DESCENDENTE ===");
        inventario.ordenarPorPrecioDescendente();
        inventario.mostrarInventario();
    }
}