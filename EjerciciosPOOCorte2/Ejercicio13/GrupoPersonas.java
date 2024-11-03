package EjerciciosPOOCorte2.Ejercicio13;

public class GrupoPersonas {
    private Persona[] personas;
    private int contador;

    public GrupoPersonas() {
        this.personas = new Persona[100];
        this.contador = 0;
    }

    public boolean agregarPersona(Persona persona) {
        if (contador < personas.length) {
            personas[contador] = persona;
            contador++;
            return true;
        } else {
            System.out.println("No se pueden agregar más personas, el grupo está lleno.");
            return false;
        }
    }

    
    public int contarMujeres() {
        int contadorMujeres = 0;
        for (int i = 0; i < contador; i++) {
            if (personas[i].isMujer()) {
                contadorMujeres++;
            }
        }
        return contadorMujeres;
    }

    
    public int contarHombresCasados() {
        int contadorHombresCasados = 0;
        for (int i = 0; i < contador; i++) {
            if (!personas[i].isMujer() && personas[i].getEstadoCivil() == 'c') {
                contadorHombresCasados++;
            }
        }
        return contadorHombresCasados;
    }

    
    public boolean sueldoMedioHombresSolterosMayorQueCasados() {
        int sumaSueldoSolteros = 0;
        int sumaSueldoCasados = 0;
        int contadorSolteros = 0;
        int contadorCasados = 0;

        for (int i = 0; i < contador; i++) {
            if (!personas[i].isMujer()) { // Es hombre
                if (personas[i].getEstadoCivil() == 's') {
                    sumaSueldoSolteros += personas[i].getSueldo();
                    contadorSolteros++;
                } else if (personas[i].getEstadoCivil() == 'c') {
                    sumaSueldoCasados += personas[i].getSueldo();
                    contadorCasados++;
                }
            }
        }

        double sueldoMedioSolteros = (contadorSolteros > 0) ? (double) sumaSueldoSolteros / contadorSolteros : 0;
        double sueldoMedioCasados = (contadorCasados > 0) ? (double) sumaSueldoCasados / contadorCasados : 0;

        return sueldoMedioSolteros > sueldoMedioCasados;
    }    
}
