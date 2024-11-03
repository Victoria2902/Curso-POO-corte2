package EjerciciosPOOCorte2.Ejercicio10;
//N° 8.a.12
import java.util.ArrayList;

public abstract class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected ArrayList<Avion> aviones;

    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public abstract String obtenerInformacion();

    public Avion buscarAvionPorPasajero(String nombrePasajero) {
        for (Avion avion : aviones) {
            if (avion.tienePasajero(nombrePasajero)) {
                return avion;
            }
        }
        return null;
    }
}
