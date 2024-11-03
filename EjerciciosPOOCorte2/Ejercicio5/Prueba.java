package EjerciciosPOOCorte2.Ejercicio5;

import java.util.Scanner;

public class Prueba {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Empleado[] empleados = new Empleado[4]; 

    
    for (int i = 0; i < empleados.length; i++) {
        System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el teléfono del empleado " + (i + 1) + ":");
        String telefono = scanner.nextLine();

      
        empleados[i] = new Empleado(nombre, telefono);
    }

    
    System.out.println("\n--- Información de los Empleados ---");
    for (int i = 0; i < empleados.length; i++) {
        System.out.println("Empleado " + (i + 1) + ":");
        System.out.println("Nombre: " + empleados[i].getNombre());
        System.out.println("Teléfono: " + empleados[i].getTelefono());
        System.out.println();
    }

    
    System.out.println("Número total de empleados instanciados: " + Empleado.getNumeroEmpleados());

    scanner.close();
}
}
