package EjerciciosPOOCorte2.Ejercicio15;

public class Miembro {
    private String nombre;
    private String direccion;
    private String telefono;
    private String id;
    protected int limitePrestamos;

    public Miembro(String nombre, String direccion, String telefono, String id, int limitePrestamos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.limitePrestamos = limitePrestamos;
    }

    
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getId() { return id; }
    public int getLimitePrestamos() { return limitePrestamos; }

    public boolean puedePedirPrestamo(int prestamosActuales) {
        return prestamosActuales < limitePrestamos;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", ID: " + id;
    }
}
