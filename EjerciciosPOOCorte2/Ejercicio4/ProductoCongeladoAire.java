package EjerciciosPOOCorte2.Ejercicio4;

class ProductoCongeladoAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    

    public ProductoCongeladoAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaRecomendada, double porcentajeNitrogeno, double porcentajeOxigeno,
            double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }



    public void mostrarInfo() {
        System.out.println("Producto Congelado por Aire:");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Número de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("País de origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + "°C");
        System.out.println("Composición de aire - N2: " + porcentajeNitrogeno + "%, O2: " + porcentajeOxigeno + "%, CO2: " + porcentajeDioxidoCarbono + "%, Vapor de agua: " + porcentajeVaporAgua + "%");
    }
}
