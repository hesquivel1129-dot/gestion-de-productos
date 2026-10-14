/**
 * Clase que representa un Producto dentro del sistema de inventario.
 * Aplica los conceptos de atributos, constructores y métodos.
 */
public class Producto {
    // Atributos de la clase (Propiedades del objeto)
    private String nombre;
    private double precio;
    private int cantidadStock;

    /**
     * Constructor de la clase Producto.
     * Se encarga de inicializar los atributos al crear un nuevo objeto.
     *
     * @param nombre Nombre inicial del producto.
     * @param precio Precio inicial del producto.
     * @param cantidadStock Cantidad inicial disponible en almacén.
     */
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    /**
     * Método para mostrar la información detallada del producto.
     */
    public void mostrarDetalles() {
        System.out.println("--- Detalle del Producto ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock disponible: " + this.cantidadStock + " unidades");
    }

    /**
     * Método que simula la venta de un producto, reduciendo el stock actual.
     *
     * @param cantidad Cantidad de unidades que se desean vender.
     */
    public void vender(int cantidad) {
        if (cantidad <= this.cantidadStock) {
            this.cantidadStock -= cantidad; // Reducción del stock
            System.out.println("\nVenta exitosa: Se vendieron " + cantidad + " unidades de " + this.nombre);
        } else {
            System.out.println("\nError: No hay suficiente stock de " + this.nombre + " para realizar la venta.");
        }
    }

    /**
     * Método para reabastecer el inventario sumando nuevas unidades al stock.
     *
     * @param cantidad Cantidad de unidades que ingresan al almacén.
     */
    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            this.cantidadStock += cantidad;
            System.out.println("\nInventario actualizado: Se agregaron " + cantidad + " unidades a " + this.nombre);
        }
    }
}

