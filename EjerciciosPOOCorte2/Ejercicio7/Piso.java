package EjerciciosPOOCorte2.Ejercicio7;

public class Piso extends Vivienda {
    private int planta;
    private int puerta;

    
    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }
    public int getPlanta() {
        return planta;
    }

    public int getPuerta() {
        return puerta;
    }

    @Override
    public void calcularPrecio() {
        this.precio = this.superficieEnMetros * 1000; 
    }
}
