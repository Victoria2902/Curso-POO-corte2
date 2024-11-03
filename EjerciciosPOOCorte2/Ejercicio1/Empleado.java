package EjerciciosPOOCorte2.Ejercicio1;
// N° 8.a.2
public class Empleado {
String nombre;
String dni;
int edad;
boolean casado;
double salario;
public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
    this.nombre = nombre;
    this.dni = dni;
    setEdad(edad);
    this.casado = casado;
    this.salario = salario;
}

public Empleado() {
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDni() {
    return dni;
}

public void setDni(String dni) {
    this.dni = dni;
}

public int getEdad() {
    return edad;
}
public void setEdad(int edad){
    if (edad>=18 && edad <=45){
        this.edad=edad;
    }else{
       throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años");
    }
} 

public boolean isCasado() {
    return casado;
}

public void setCasado(boolean casado) {
    this.casado = casado;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}
public String clasifica(){
    if (edad<=21){
        return "Principiante";
    }else if (edad<=35){
        return "Intermedio";
    }else{
        return "Senior";
    }
}

public void subirSalario(int porcentaje){
    if (porcentaje>0){
        salario += salario*porcentaje/100.0;
    }else{
        System.out.println("El porcentaje debe ser positivo ");
    }
}
        
@Override
public String toString() {
    return "Empleado [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", casado=" + casado + ", salario="
            + salario + ", clasifica()=" + clasifica() + "]";
}

}
