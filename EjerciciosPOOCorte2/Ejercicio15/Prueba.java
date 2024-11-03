package EjerciciosPOOCorte2.Ejercicio15;

public class Prueba {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", 1605, "001");
        Libro libro2 = new Libro("1984", "George Orwell", 1949, "002");

        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

    
        Miembro miembro1 = new MiembroRegular("Juan Pérez", "Calle Falsa 123", "555-1234", "M001");
        Miembro miembro2 = new MiembroPremium("Ana López", "Avenida Siempreviva 456", "555-5678", "M002");

        
        biblioteca.agregarMiembro(miembro1);
        biblioteca.agregarMiembro(miembro2);

        
        biblioteca.prestarLibro(libro1, miembro1, "2023-10-10");

        
        biblioteca.mostrarLibros();
        biblioteca.mostrarMiembros();

        
        biblioteca.devolverLibro(libro1, "2023-10-15");

        
        biblioteca.mostrarLibros();
        biblioteca.mostrarMiembros();
    }
}
