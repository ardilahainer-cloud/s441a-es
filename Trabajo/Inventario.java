package Trabajo;

public class Inventario {

    private Producto[] productos;
    private int contador;

    // Constructor
    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }

    // 1️ Agregar producto
    public boolean agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
            return true;
        } else {
            System.out.println("Inventario lleno. No se puede agregar más productos.");
            return false;
        }
    }

    // 2️ Buscar por ID
    public Producto buscarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) {
                return productos[i];
            }
        }
        return null;
    }

    // 3️ Actualizar stock
    public boolean actualizarStock(int id, int nuevaCantidad) {
        Producto p = buscarPorId(id);

        if (p != null) {
            p.setCantidadStock(nuevaCantidad);
            return true;
        } else {
            System.out.println("Producto no encontrado.");
            return false;
        }
    }

    // 4️⃣ Generar informe valor total
    public double generarInformeValorTotal() {
        double total = 0;

        for (int i = 0; i < contador; i++) {
            total += productos[i].getPrecio() *
                     productos[i].getCantidadStock();
        }

        return total;
    }

    // 5️⃣ Obtener productos agotados (stock < 5)
    public Producto[] obtenerProductosAgotados() {

        // Primero contar cuántos hay
        int cantidad = 0;
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                cantidad++;
            }
        }

        // Crear nuevo arreglo con tamaño exacto
        Producto[] agotados = new Producto[cantidad];
        int index = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                agotados[index] = productos[i];
                index++;
            }
        }

        return agotados;
    }

    // 6️⃣ Ordenar por precio descendente (Burbuja)
    public void ordenarPorPrecioDescendente() {

        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {

                if (productos[j].getPrecio() < productos[j + 1].getPrecio()) {

                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
    }

    // Método opcional para mostrar inventario
    public void mostrarInventario() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}                                                                                                 
