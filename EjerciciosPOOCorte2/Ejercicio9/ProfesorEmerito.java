package EjerciciosPOOCorte2.Ejercicio9;

public class ProfesorEmerito extends Profesor {
    private int añosEmerito;

    
    public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }

    
    public int getAñosEmerito() {
        return añosEmerito;
    }

    public void setAñosEmerito(int añosEmerito) {
        this.añosEmerito = añosEmerito;
    }

    
    public double obtenerSalarioBase() {
        
        return 925 + añosConsolidados * 12.25 + 23.40 * añosEmerito;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Años Emérito: " + añosEmerito);
        System.out.println("Salario Base: " + obtenerSalarioBase());
    }
}
