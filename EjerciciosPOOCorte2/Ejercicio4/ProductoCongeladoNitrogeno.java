package EjerciciosPOOCorte2.Ejercicio4;

class ProductoCongeladoNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public ProductoCongeladoNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public void mostrarInfo() {
        System.out.println("Producto Congelado por Nitrógeno:");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Número de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("País de origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + "°C");
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición: " + tiempoExposicion + " segundos");
    }
}
