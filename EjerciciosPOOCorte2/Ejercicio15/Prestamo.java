package EjerciciosPOOCorte2.Ejercicio15;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(Libro libro, Miembro miembro, String fechaPrestamo) {
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
        libro.setEstado("prestado");
    }

    
    public Libro getLibro() { return libro; }
    public Miembro getMiembro() { return miembro; }
    public String getFechaPrestamo() { return fechaPrestamo; }
    public String getFechaDevolucion() { return fechaDevolucion; }

    public void finalizarPrestamo(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        libro.setEstado("disponible");
    }
}
