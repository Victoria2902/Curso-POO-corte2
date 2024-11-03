package EjerciciosPOOCorte2.Ejercicio11;

public class Tienda {
    private Vestido[] vestidos;
    private int contador;

    public Tienda() {
        this.vestidos = new Vestido[10];
        this.contador = 0;
    }

    public boolean agregarVestido(Vestido vestido) {
        if (contador < vestidos.length) {
            vestidos[contador] = vestido;
            contador++;
            return true;
        } else {
            System.out.println("No se pueden agregar más vestidos, la tienda está llena.");
            return false;
        }
    }

    public void mostrarVestidos() {
        System.out.println("Vestidos en la tienda:");
        for (int i = 0; i < contador; i++) {
            System.out.println(vestidos[i]);
        }
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += vestidos[i].getPrecio();
        }
        return total;
    }
    public void aplicarRebaja(double porcentaje) {
        for (int i = 0; i < contador; i++) {
            vestidos[i].rebajar(porcentaje);
        }
    }    
}
