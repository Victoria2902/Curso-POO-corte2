package EjerciciosPOOCorte2.Ejercicio12;

public class CocheFormula1 {
    String escuderia;
    int potencia;
    Piloto piloto;

    public CocheFormula1(String escuderia, int potencia, Piloto piloto) {
        this.escuderia = escuderia;
        this.potencia = potencia;
        this.piloto = piloto;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public int getPotencia() {
        return potencia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    @Override
    public String toString() {
        return "CocheFormula1 [Escuderia=" + escuderia + ", Potencia=" + potencia + ", Piloto=" + piloto + "]";
    }
}
