package EjerciciosPOOCorte2.Ejercicio3;

public class Prueba {
public static void main(String[] args) {
    
    Camion[] camiones = new Camion[3];
    camiones[0] = new Camion(20000, "Volvo", 15, 2);
    camiones[1] = new Camion(30000, "Scania", 20, 3);
    camiones[2] = new Camion(25000, "Mercedes", 18, 4);

    
    System.out.println("Precios de venta de los camiones:");
    for (Camion camion : camiones) {
        System.out.printf("Camion %s: %.2f €\n", camion.marca, camion.precioVenta());
    }

    
    Furgoneta[] furgonetas = new Furgoneta[2];
    furgonetas[0] = new Furgoneta(15000, "Renault", 12);
    furgonetas[1] = new Furgoneta(18000, "Ford", 8);

    
    System.out.println("\nPrecios de venta de las furgonetas:");
    for (Furgoneta furgoneta : furgonetas) {
        System.out.printf("Furgoneta %s: %.2f €\n", furgoneta.marca, furgoneta.precioVenta());
}
}
}
