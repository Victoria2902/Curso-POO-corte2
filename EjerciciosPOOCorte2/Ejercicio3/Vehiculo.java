package EjerciciosPOOCorte2.Ejercicio3;
// N° 8.a.5
abstract class Vehiculo {
    protected double precioCompra;
    protected String marca;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
    }

    public abstract double precioVenta(); 
}

