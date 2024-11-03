package EjerciciosPOOCorte2.Ejercicio9;
//N° 8.a.11
public class Profesor {
    protected String nombre;
    protected int edad;
    protected int añosConsolidados;

    
    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosConsolidados() {
        return añosConsolidados;
    }

    public void setAñosConsolidados(int añosConsolidados) {
        this.añosConsolidados = añosConsolidados;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Años Consolidados: " + añosConsolidados);
    }
    
}
