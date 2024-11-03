package EjerciciosPOOCorte2.Ejercicio10;

public class AvionCarga extends Avion {
    private int cargaMaxima;

    public AvionCarga(String nombre, String matricula, int autonomiaVuelo, int cargaMaxima) {
        super(nombre, matricula, autonomiaVuelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String obtenerInformacion() {
        return "Avión de Carga - " + nombre + ", Matrícula: " + matricula + ", Autonomía: " + autonomiaVuelo +
                " km, Carga Máxima: " + cargaMaxima + " kg";
    }

    @Override
    public boolean tienePasajero(String nombrePasajero) {
        return false; 
    }
}
