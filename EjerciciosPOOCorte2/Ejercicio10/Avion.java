package EjerciciosPOOCorte2.Ejercicio10;


public abstract class Avion {
    protected String nombre;
    protected String matricula;
    protected int autonomiaVuelo;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAutonomiaVuelo() {
        return autonomiaVuelo;
    }

    public abstract String obtenerInformacion();
    public abstract boolean tienePasajero(String nombrePasajero);
}
