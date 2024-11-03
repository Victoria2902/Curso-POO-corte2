package EjerciciosPOOCorte2.Ejercicio1;

public class Programador extends Empleado {
private int lineasDeCodigoPorHora;
private String lenguajeDominate;
public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora,
        String lenguajeDominate) {
    super(nombre, dni, edad, casado, salario);
    this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    this.lenguajeDominate = lenguajeDominate;
}
public Programador() {
    super();
}
public int getLineasDeCodigoPorHora() {
    return lineasDeCodigoPorHora;
}
public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
    this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
}
public String getLenguajeDominate() {
    return lenguajeDominate;
}
public void setLenguajeDominate(String lenguajeDominate) {
    this.lenguajeDominate = lenguajeDominate;
}
public double calcularSalario(){
    return 10*lineasDeCodigoPorHora;
}
@Override
public String toString() {
    return "Programador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominate=" + lenguajeDominate
            + ", calcularSalario()=" + calcularSalario() + "]";
}


}


