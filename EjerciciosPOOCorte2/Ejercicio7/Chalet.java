package EjerciciosPOOCorte2.Ejercicio7;

public class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    
    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }
    public int getNumParcela() {
        return numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    @Override
    public void calcularPrecio() {
        this.precio = this.superficieEnMetros * 1300;
    }
}        
