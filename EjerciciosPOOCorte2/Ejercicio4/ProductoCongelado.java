package EjerciciosPOOCorte2.Ejercicio4;

abstract class ProductoCongelado  extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaRecomendada;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public abstract void mostrarInfo();
}
