package EjerciciosPOOCorte2.Ejercicio4;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public void mostrarInfo() {
        System.out.println("Producto Fresco:");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Número de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }
}
