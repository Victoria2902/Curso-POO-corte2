package EjerciciosPOOCorte2.Ejercicio2;
/*La empresa de movilidad “EcoMovil” necesita llevar un registro de sus vehículos eléctricos e híbridos. Para esto, ha diseñado una estructura de clases con las siguientes especificaciones:

1) Clase Vehiculo
Atributos:

String marca: se inicializa en el constructor y no se puede modificar.
String color: se inicializa en el constructor y se puede modificar.
int kilometraje: inicializado a 0, se puede incrementar al registrar recorridos.
double precio: se inicializa en el constructor y se puede modificar.
double factorEmisiones: se inicializa en el constructor y no se puede modificar.
int añoFabricacion: se inicializa en el constructor y no se puede modificar.
String numeroSerie: no se inicializa en el constructor y, una vez asignado, no se puede cambiar.
String idPropietario: no se inicializa en el constructor, pero se puede cambiar posteriormente.Métodos:

transferirPropiedad(Vehiculo otroVehiculo): cambia el atributo idPropietario por el idPropietario del parámetro otroVehiculo. Solo puede realizarse la transferencia si ambos vehículos tienen el atributo idPropietario asignado.
registrarKilometraje(int km): permite incrementar el kilometraje en la cantidad pasada como parámetro.
toString(): imprime los datos del vehículo, incluyendo la marca, color, precio, factor de emisiones, año de fabricación, y el kilometraje.Clase VehiculoElectrico
Clase que hereda de Vehiculo y añade las siguientes características:

Atributos:

int añoRegistro: año en que el vehículo fue registrado.
int mesRegistro: mes en que el vehículo fue registrado.
double tasaVerde: no se inicializa con el vehículo, pero puede modificarse después.
Métodos:

calcularTasaVerde(): calcula y asigna el valor de tasaVerde (el 1% del precio del vehículo), y aplica un descuento del 50% si el vehículo tiene más de 8 años de antigüedad desde el año de registro.
Constructor que recibe valores para los atributos numeroSerie y idPropietario, y calcula el valor de tasaVerde usando el método calcularTasaVerde.
Métodos getter y setter. El setter de tasaVerde utiliza el método calcularTasaVerde para calcular el valor correspondiente, por lo que no requiere parámetros adicionales.Clase PruebaEcoMovil
Clase de prueba para crear y probar objetos y métodos de las clases Vehiculo y VehiculoElectrico.

En el método main, realiza lo siguiente:

Crea un objeto de tipo Vehiculo y otro de tipo VehiculoElectrico con valores iniciales.
Imprime los detalles de ambos objetos utilizando el método toString().
Prueba el método registrarKilometraje() y transferirPropiedad() en ambos objetos.
Calcula la tasa verde del vehículo eléctrico usando el método calcularTasaVerde().
Imprime el valor de la tasaVerde del vehículo eléctrico y comprueba el descuento en caso de antigüedad.*/

public class Vehiculo {
private final String marca;
private String color;
private int kilometraje;
private double precio;
private final double factorEmisiones;
private final int añoFabricacion;
private String numeroSerie;
private String idPropietario;


public Vehiculo(String marca, String color, double precio, double factorEmisiones, int añoFabricacion) {
    this.marca = marca;
    this.color = color;
    this.kilometraje=0;
    this.precio = precio;
    this.factorEmisiones = factorEmisiones;
    this.añoFabricacion = añoFabricacion;
}
public String getMarca() {
    return marca;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public int getKilometraje() {
    return kilometraje;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public double getFactorEmisiones() {
    return factorEmisiones;
}
public int getAñoFabricacion() {
    return añoFabricacion;
}
public String getNumeroSerie() {
    return numeroSerie;
}
public void setNumeroSerie(String numeroSerie) {
    if (this.numeroSerie == null) { 
        this.numeroSerie = numeroSerie;
    } else {
        System.out.println("El número de serie no se puede modificar una vez asignado.");
    }
}
public String getIdPropietario() {
    return idPropietario;
}

public void setIdPropietario(String idPropietario) {
    this.idPropietario = idPropietario;
}

public void registrarKilometraje(int km){
    if (km > 0){
        this.kilometraje += km;
    }else{
        System.out.println("El kilometraje debe ser positivo");
    }
}

public void transferirPropiedad(Vehiculo otroVehiculo){
    if (this.idPropietario != null && otroVehiculo.idPropietario != null){
        this.idPropietario = otroVehiculo.idPropietario;
    }else{
        System.out.println("Los dos vehiculos tienen que tener un propietario asignado para la transferencia");
    }
}
@Override
public String toString() {
    return "Vehiculo [marca=" + marca + ", color=" + color + ", kilometraje=" + kilometraje + ", precio=" + precio
            + ", factorEmisiones=" + factorEmisiones + ", añoFabricacion=" + añoFabricacion + ", numeroSerie="
            + numeroSerie + ", idPropietario=" + idPropietario + "]";
}

    
}
