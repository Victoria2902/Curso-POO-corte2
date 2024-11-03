package EjerciciosPOOCorte2.Ejercicio7;

public class Principal {
public static void main(String[] args) {
    Piso piso1 = new Piso("Calle A", 70, 5, 7);
    Adosado adosado1 = new Adosado("Calle B", 140, 4);
    Chalet chalet1 = new Chalet("Calle C", 210, 8, true);

    
    piso1.calcularPrecio();
    adosado1.calcularPrecio();
    chalet1.calcularPrecio();

    
    System.out.println("Piso: " + piso1.getCalle() + ", Superficie: " + piso1.getSuperficieEnMetros() + " m², Precio: " + piso1.getPrecio());
    System.out.println("Adosado: " + adosado1.getCalle() + ", Superficie: " + adosado1.getSuperficieEnMetros() + " m², Precio: " + adosado1.getPrecio());
    System.out.println("Chalet: " + chalet1.getCalle() + ", Superficie: " + chalet1.getSuperficieEnMetros() + " m², Precio: " + chalet1.getPrecio());    
}
}
