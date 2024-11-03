package EjerciciosPOOCorte2.Ejercicio10;

public class Principal {
public static void main(String[] args) {
    Biberia biberia = new Biberia();

    
    AeropuertoMilitar aeropuertoMilitar = new AeropuertoMilitar("MilitarBase", "CiudadX", "ClaveX");
    AeropuertoComercial aeropuertoComercial1 = new AeropuertoComercial("Comercial1", "CiudadY", 2);
    AeropuertoComercial aeropuertoComercial2 = new AeropuertoComercial("Comercial2", "CiudadZ", 3);

    
    biberia.agregarAeropuerto(aeropuertoMilitar);
    biberia.agregarAeropuerto(aeropuertoComercial1);
    biberia.agregarAeropuerto(aeropuertoComercial2);

    
    AvionPasajeros avionPasajeros = new AvionPasajeros("Boeing 747", "ABC123", 12000, 300);
    avionPasajeros.agregarPasajero(new Pasajero("Juan Pérez", "12345678A", 30));

    
    aeropuertoComercial1.agregarAvion(avionPasajeros);

    
    System.out.println(biberia.buscarPasajero("Juan Pérez"));    
}
}
