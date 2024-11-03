package EjerciciosPOOCorte2.Ejercicio13;

public class Prueba {
    public static void main(String[] args) {
        GrupoPersonas grupo = new GrupoPersonas();

        
        grupo.agregarPersona(new Persona('c', 3000, true));
        grupo.agregarPersona(new Persona('s', 4000, true));
        grupo.agregarPersona(new Persona('c', 3500, false));
        grupo.agregarPersona(new Persona('s', 2500, false));
        grupo.agregarPersona(new Persona('c', 2000, false));
        grupo.agregarPersona(new Persona('v', 2800, true));

        
        System.out.println("Número de mujeres: " + grupo.contarMujeres());

        
        System.out.println("Número de hombres casados: " + grupo.contarHombresCasados());

        
        boolean solterosMayor = grupo.sueldoMedioHombresSolterosMayorQueCasados();
        System.out.println("¿El sueldo medio de los hombres solteros es mayor que el de los casados? " + solterosMayor);
    }
}
