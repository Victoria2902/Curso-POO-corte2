package EjerciciosPOOCorte2.Ejercicio14;
//N° 8.b.7
public class ComparadorNumerico implements IRelaciones {
    private int valor;

    public ComparadorNumerico(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean esMayor(Object b) {
        if (b instanceof ComparadorNumerico) {
            ComparadorNumerico otro = (ComparadorNumerico) b;
            return this.valor > otro.valor;
        }
        return false;
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof ComparadorNumerico) {
            ComparadorNumerico otro = (ComparadorNumerico) b;
            return this.valor < otro.valor;
        }
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof ComparadorNumerico) {
            ComparadorNumerico otro = (ComparadorNumerico) b;
            return this.valor == otro.valor;
        }
        return false;
    }
}
