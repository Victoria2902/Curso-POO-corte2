package EjerciciosPOOCorte2.Ejercicio10;
import java.util.ArrayList;

public class Biberia {
        private ArrayList<Aeropuerto> aeropuertos;
    
        public Biberia() {
            this.aeropuertos = new ArrayList<>();
        }
    
        public void agregarAeropuerto(Aeropuerto aeropuerto) {
            aeropuertos.add(aeropuerto);
        }
    
        public String buscarPasajero(String nombrePasajero) {
            for (Aeropuerto aeropuerto : aeropuertos) {
                Avion avion = aeropuerto.buscarAvionPorPasajero(nombrePasajero);
                if (avion != null) {
                    return "Pasajero " + nombrePasajero + " se encuentra en el avión " + avion.getNombre() +
                            " en el aeropuerto " + aeropuerto.getNombre() + " ubicado en " + aeropuerto.getCiudad();
                }
            }
            return "Pasajero " + nombrePasajero + " no encontrado.";
        }
    }    
