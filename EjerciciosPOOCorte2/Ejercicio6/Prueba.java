package EjerciciosPOOCorte2.Ejercicio6;

public class Prueba {
public static void main(String[] args) {
    Math2 math2 = new Math2();

       
        int[] intArray = {6, 3, 9, 2, 7};
        System.out.println("Mínimo (int): " + math2.min(intArray));
        System.out.println("Máximo (int): " + math2.max(intArray));

        
        double[] doubleArray = {3.3, 5.5, 7.7, 6.6, 1.1};
        System.out.println("Mínimo (double): " + math2.min(doubleArray));
        System.out.println("Máximo (double): " + math2.max(doubleArray));
}
}
