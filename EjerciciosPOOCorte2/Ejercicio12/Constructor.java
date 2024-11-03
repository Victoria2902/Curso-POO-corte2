package EjerciciosPOOCorte2.Ejercicio12;

public class Constructor {
    String nombre;
    CocheFormula1 cf1;

    public Constructor(String nombre, CocheFormula1 cf1) {
        this.nombre = nombre;
        this.cf1 = cf1;
    }

    public String getNombre() {
        return nombre;
    }

    public CocheFormula1 getCocheFormula1() {
        return cf1;
    }

    @Override
    public String toString() {
        return "Constructor [Nombre=" + nombre + ", CocheFormula1=" + cf1 + "]";
    }
}
