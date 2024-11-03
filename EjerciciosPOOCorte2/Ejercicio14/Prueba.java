package EjerciciosPOOCorte2.Ejercicio14;

public class Prueba {
    public static void main(String[] args) {
        ComparadorNumerico a = new ComparadorNumerico(5);
        ComparadorNumerico b = new ComparadorNumerico(3);

        System.out.println("a es mayor que b: " + a.esMayor(b));
        System.out.println("a es menor que b: " + a.esMenor(b));
        System.out.println("a es igual a b: " + a.esIgual(b));
    }
}
