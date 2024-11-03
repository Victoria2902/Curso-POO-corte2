package EjerciciosPOOCorte2.Ejercicio2;

public class Prueba {
public static void main(String[] args) {
 
 Vehiculo vehiculo = new Vehiculo("Toyota", "Rojo", 50000, 140, 1980);
 vehiculo.setNumeroSerie("123ABC");
 vehiculo.setIdPropietario("ID001");

 
 VehiculoElectrico vehiculoElectrico = new VehiculoElectrico("321ASF","ID002","Nissan","Negro",60000,129,1929,2000,8);

 
 System.out.println(vehiculo);
 System.out.println(vehiculoElectrico);

 
 vehiculo.registrarKilometraje(100);
 vehiculoElectrico.registrarKilometraje(150);

 
 System.out.println("\nDespués de registrar kilometraje:");
 System.out.println(vehiculo);
 System.out.println(vehiculoElectrico);

 
 vehiculo.transferirPropiedad(vehiculoElectrico);
 System.out.println("\nDespués de transferir propiedad:");
 System.out.println(vehiculo);

 
 System.out.println("\nImpuesto Ambiental del Vehículo Eléctrico: " + vehiculoElectrico.getImpuestoAmbiental());    
}
}
