package EjerciciosPOOCorte2.Ejercicio4;

class ProductoCongeladoAgua extends ProductoCongelado {
    private double salinidadAgua;

    public ProductoCongeladoAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public void mostrarInfo() {
        System.out.println("Producto Congelado por Agua:");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Número de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("País de origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + "°C");
        System.out.println("Salinidad del agua: " + salinidadAgua + "g/L");
    }
}
