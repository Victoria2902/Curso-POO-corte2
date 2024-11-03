package EjerciciosPOOCorte2.Ejercicio10;

import java.util.ArrayList;

public class AvionPasajeros extends Avion {
private int numeroPasajeros;
    private ArrayList<Pasajero> pasajeros;

    public AvionPasajeros(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numeroPasajeros = numeroPasajeros;
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero pasajero) {
        if (pasajeros.size() < numeroPasajeros) {
            pasajeros.add(pasajero);
        }
    }

    @Override
    public String obtenerInformacion() {
        StringBuilder info = new StringBuilder("Avión Pasajeros - " + nombre + ", Matrícula: " + matricula +
                ", Autonomía: " + autonomiaVuelo + " km, Capacidad de Pasajeros: " + numeroPasajeros + "\nPasajeros:\n");
        for (Pasajero p : pasajeros) {
            info.append(p.obtenerInformacion()).append("\n");
        }
        return info.toString();
    }

    @Override
    public boolean tienePasajero(String nombrePasajero) {
        return pasajeros.stream().anyMatch(p -> p.getNombre().equalsIgnoreCase(nombrePasajero));
    }
}
