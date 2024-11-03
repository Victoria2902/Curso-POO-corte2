package EjerciciosPOOCorte2.Ejercicio10;

public class AeropuertoMilitar extends Aeropuerto {
    private String nombreClave;

    public AeropuertoMilitar(String nombre, String ciudad, String nombreClave) {
        super(nombre, ciudad);
        this.nombreClave = nombreClave;
    }

    @Override
    public String obtenerInformacion() {
        return "Aeropuerto Militar: " + nombre + " en " + ciudad + ", Nombre en Clave: " + nombreClave;
    }
}
