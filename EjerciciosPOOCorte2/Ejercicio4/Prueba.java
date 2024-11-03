package EjerciciosPOOCorte2.Ejercicio4;

public class Prueba {
public static void main(String[] args) {
    Producto[] productos = {
        
        new ProductoFresco("2024-12-01", 1001, "2024-01-01", "España"),
        new ProductoFresco("2024-11-30", 1002, "2024-01-02", "México"),

        
        new ProductoRefrigerado("2025-01-15", 2001, "FDA1234", "2024-03-05", "Argentina", 4.0),
        new ProductoRefrigerado("2025-01-20", 2002, "FDA1235", "2024-03-06", "Brasil", 5.0),
        new ProductoRefrigerado("2025-01-25", 2003, "FDA1236", "2024-03-07", "Chile", 3.5),

        
        new ProductoCongeladoAire("2025-05-10", 3001, "2024-04-10", "Francia", -18.0, 78.0, 21.0, 0.03, 0.97),
        new ProductoCongeladoAire("2025-05-15", 3002, "2024-04-12", "Italia", -18.0, 75.0, 20.0, 0.04, 0.96),

        
        new ProductoCongeladoAgua("2025-06-01", 3003, "2024-04-20", "Japón", -20.0, 3.5),
        new ProductoCongeladoAgua("2025-06-05", 3004, "2024-04-22", "Corea del Sur", -20.0, 3.8),

        
        new ProductoCongeladoNitrogeno("2025-07-01", 3005, "2024-05-01", "EE.UU.", -22.0, "Inmersión rápida", 120)
    };
    for (Producto producto : productos) {
        producto.mostrarInfo();
        System.out.println("--------------------------------");
    }  
}
}
