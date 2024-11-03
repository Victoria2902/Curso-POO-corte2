package EjerciciosPOOCorte2.Ejercicio10;

public class Avioneta extends AvionPasajeros {
    public Avioneta(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo, numeroPasajeros);
    }

    @Override
    public String obtenerInformacion() {
        return "Avioneta - " + super.obtenerInformacion();
    }
}
