package EjerciciosPOOCorte2.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Sara Uribe ", "5678912354", 20, false, 500000);
        System.out.println(empleado);
        
        
        empleado.subirSalario(15);
        System.out.println("Después de aumentar el salario en un 15%:");
        System.out.println(empleado);

        
        Programador programador = new Programador("Sebastian Santos", "7523694182", 35, true, 600000, 40, "C++");
        System.out.println(programador);

        
        double salarioProgramador = programador.calcularSalario();
        System.out.println("Salario calculado del programador: " + salarioProgramador);

    
        programador.subirSalario(30);
        System.out.println("Después de aumentar el salario en un 30%:");
        System.out.println(programador);
    }
}