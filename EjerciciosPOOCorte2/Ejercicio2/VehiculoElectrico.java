package EjerciciosPOOCorte2.Ejercicio2;

public class VehiculoElectrico extends Vehiculo {
    
    private int añoRegistro; 
    private int mesRegistro; 
    private double impuestoAmbiental; 


    public VehiculoElectrico(String numeroSerie,String idPropietario,String marca, String color, double precio, double factorEmisiones, int añoFabricacion,
            int añoRegistro, int mesRegistro) {
        super(marca, color, precio, factorEmisiones, añoFabricacion);
        setNumeroSerie(numeroSerie);
        setIdPropietario(idPropietario);
        this.añoRegistro = añoRegistro;
        this.mesRegistro = mesRegistro;
        calcularImpuestoAmbiental();
    }

    
    public void calcularImpuestoAmbiental() {
        double baseImpuesto = getPrecio() * 0.01; 
        int añosAntiguedad = obtenerAñosAntiguedad(); 

        if (añosAntiguedad > 8) {
            baseImpuesto *= 0.5; 
        }
        this.impuestoAmbiental = baseImpuesto;
    }

    
    private int obtenerAñosAntiguedad() {
        int añoActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return añoActual - añoRegistro;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "VehiculoElectrico{" +
               "añoRegistro=" + añoRegistro +
               ", mesRegistro=" + mesRegistro +
               ", impuestoAmbiental=" + impuestoAmbiental +
               '}';
    }

    
    public double getImpuestoAmbiental() {
        return impuestoAmbiental;
    }

    public void setImpuestoAmbiental(double impuestoAmbiental) {
        this.impuestoAmbiental = impuestoAmbiental; 
        calcularImpuestoAmbiental(); 
    }
}

