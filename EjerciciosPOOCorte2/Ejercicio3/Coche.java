package EjerciciosPOOCorte2.Ejercicio3;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(double precioCompra, String marca, int numeroPuertas) {
        super(precioCompra, marca);
        this.numeroPuertas = numeroPuertas;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    @Override
    public double precioVenta() {
        return precioCompra * 1.6; 
    }

    
}
