package EjerciciosPOOCorte2.Ejercicio7;

public class Adosado extends Vivienda {
    private int numPlantas;

    
    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }
    public int getNumPlantas() {
        return numPlantas;
    }

    @Override
    public void calcularPrecio() {
        this.precio = this.superficieEnMetros * 1000; 
    }
}    

