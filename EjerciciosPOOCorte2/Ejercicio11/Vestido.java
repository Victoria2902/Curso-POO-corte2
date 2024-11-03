package EjerciciosPOOCorte2.Ejercicio11;
//N° 7.b.14
public class Vestido {
    private String marca;
    private String modelo;
    private double precio;

    public Vestido(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void rebajar(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= this.precio * (porcentaje / 100);
        } else {
            System.out.println("Porcentaje de rebaja inválido.");
        }
    }

    @Override
    public String toString() {
        return "Vestido [Marca=" + marca + ", Modelo=" + modelo + ", Precio=" + precio + "]";
    }    
}
