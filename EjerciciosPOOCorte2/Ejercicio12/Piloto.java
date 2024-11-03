package EjerciciosPOOCorte2.Ejercicio12;
//N° 7.b.16
public class Piloto {
    String nombre;
    Double salario;

    public Piloto(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Piloto [Nombre=" + nombre + ", Salario=" + salario + "]";
    }
}
