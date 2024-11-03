package EjerciciosPOOCorte2.Ejercicio3;

public class Camion extends Vehiculo {
    private double tamanoRemolque; 
    private int numeroEjes;

    public Camion(double precioCompra, String marca, double tamanoRemolque, int numeroEjes) {
        super(precioCompra, marca);
        this.tamanoRemolque = tamanoRemolque;
        this.numeroEjes = numeroEjes;
    }
    
    public double getTamanoRemolque() {
        return tamanoRemolque;
    }

    @Override
    public double precioVenta() {
        return (precioCompra * 1.6) * numeroEjes; 
    }
}
