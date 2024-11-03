package EjerciciosPOOCorte2.Ejercicio4;

class ProductoRefrigerado extends Producto {
    private String codigoSupervision;
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaRecomendada;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoSupervision, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public void mostrarInfo() {
        System.out.println("Producto Refrigerado:");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Número de lote: " + getNumeroLote());
        System.out.println("Código de supervisión: " + codigoSupervision);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada + "°C");
    }
}
