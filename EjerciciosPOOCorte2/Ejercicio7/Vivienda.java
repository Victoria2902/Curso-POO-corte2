package EjerciciosPOOCorte2.Ejercicio7;
//N° 8.a.9
public class Vivienda {
protected String calle;
protected double precio;
protected int superficieEnMetros;
public Vivienda(String calle, int superficieEnMetros) {
    this.calle = calle;
    this.superficieEnMetros = superficieEnMetros;
}
public String getCalle() {
    return calle;
}
public double getPrecio() {
    return precio;
}
public int getSuperficieEnMetros() {
    return superficieEnMetros;
}

public void calcularPrecio() {
    this.precio = this.superficieEnMetros * 1000; 
}

}
