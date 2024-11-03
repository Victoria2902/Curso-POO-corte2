package EjerciciosPOOCorte2.Ejercicio8;

public class Principal {
public static void main(String[] args) {

AlfombraRedonda alfombraRedonda = new AlfombraRedonda("Rojo", 50, 3);
AlfombraCuadrada alfombraCuadrada = new AlfombraCuadrada("Azul", 40, 4);


System.out.println("Alfombra Redonda - Color: " + alfombraRedonda.getColor() +
        ", Superficie: " + alfombraRedonda.calcularSuperficie() +
        ", Precio: " + alfombraRedonda.calcularPrecio());

System.out.println("Alfombra Cuadrada - Color: " + alfombraCuadrada.getColor() +
        ", Superficie: " + alfombraCuadrada.calcularSuperficie() +
        ", Precio: " + alfombraCuadrada.calcularPrecio());    
}
}
