package EjerciciosPOOCorte2.Ejercicio10;

public class AeropuertoComercial extends Aeropuerto {
    private int numeroTerminales;

    public AeropuertoComercial(String nombre, String ciudad, int numeroTerminales) {
        super(nombre, ciudad);
        this.numeroTerminales = numeroTerminales;
    }

    @Override
    public String obtenerInformacion() {
        return "Aeropuerto Comercial: " + nombre + " en " + ciudad + ", Número de Terminales: " + numeroTerminales;
    }
}
