/**
 * Clase principal que contiene el método main para ejecutar y probar la aplicación.
 * Aquí se realiza la instanciación de objetos y la ejecución de métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE PRODUCTOS ===\n");

        // Instanciación de Objetos usando el Constructor de la clase Producto
        Producto producto1 = new Producto("Laptop ASUS", 699.90, 10);
        Producto producto2 = new Producto("Mouse Óptico", 24.50, 50);

        // Prueba de métodos: Mostrar estado inicial
        producto1.mostrarDetalles();
        producto2.mostrarDetalles();

        // Ejecución de lógica de negocio (Ventas y Reabastecimiento)
        producto1.vender(3);       // Venta válida
        producto1.mostrarDetalles(); // Verificación de cambios en el stock

        producto2.vender(60);      // Intento de venta inválida (excede el stock)

        producto2.reabastecer(20);  // Reabastecimiento de mercancía
        producto2.mostrarDetalles(); // Verificación del nuevo stock
    }
}

