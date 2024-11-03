package EjerciciosPOOCorte2.Ejercicio15;
/* Sistema de Gestión de Biblioteca
Descripción del problema:

Una biblioteca necesita un sistema para gestionar sus libros, miembros, y préstamos. Los requisitos son los siguientes:

Libros:

Cada libro debe tener un título, autor, año de publicación, y un identificador único.
Los libros pueden estar disponibles, prestados o en mantenimiento.
Miembros de la biblioteca:

Hay dos tipos de miembros: regulares y premium.
Ambos tipos de miembros tienen nombre, dirección, número de contacto y una identificación única.
Los miembros regulares pueden tomar prestados hasta 3 libros al mismo tiempo, mientras que los miembros premium pueden tomar hasta 5.
Préstamos:

Un préstamo debe registrar la fecha en la que se realiza el préstamo y una fecha de devolución.
Cada préstamo se asocia a un libro y a un miembro.
Los libros prestados deben cambiar su estado a "prestado" y volver a estar "disponibles" al ser devueltos.
Requerimientos del sistema:

Registro de Libros: Agregar nuevos libros al sistema y actualizar el estado de cada libro.
Registro de Miembros: Añadir nuevos miembros, diferenciando entre regulares y premium.
Realizar Préstamo: Un miembro puede tomar prestado un libro si cumple con el límite máximo de libros prestados. Al prestarse, el libro cambia su estado a "prestado".
Devolver Libro: Cuando un libro es devuelto, su estado debe cambiar a "disponible" y el préstamo debe ser registrado como finalizado.
Reportes:
Mostrar la lista de libros con sus estados.
Mostrar la lista de miembros con la cantidad de libros prestados.*/
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Miembro> miembros = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarMiembro(Miembro miembro) {
        miembros.add(miembro);
    }

    public boolean prestarLibro(Libro libro, Miembro miembro, String fechaPrestamo) {
        long prestamosActivos = prestamos.stream().filter(p -> p.getMiembro().equals(miembro) && p.getFechaDevolucion() == null).count();
        if (miembro.puedePedirPrestamo((int) prestamosActivos) && libro.getEstado().equals("disponible")) {
            prestamos.add(new Prestamo(libro, miembro, fechaPrestamo));
            return true;
        }
        return false;
    }

    public boolean devolverLibro(Libro libro, String fechaDevolucion) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.getFechaDevolucion() == null) {
                prestamo.finalizarPrestamo(fechaDevolucion);
                return true;
            }
        }
        return false;
    }

    public void mostrarLibros() {
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInfo());
        }
    }

    public void mostrarMiembros() {
        System.out.println("Lista de miembros:");
        for (Miembro miembro : miembros) {
            long prestamosActivos = prestamos.stream().filter(p -> p.getMiembro().equals(miembro) && p.getFechaDevolucion() == null).count();
            System.out.println(miembro.mostrarInfo() + ", Libros prestados actualmente: " + prestamosActivos);
        }
    }
}

