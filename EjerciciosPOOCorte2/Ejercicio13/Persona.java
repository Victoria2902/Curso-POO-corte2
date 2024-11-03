package EjerciciosPOOCorte2.Ejercicio13;
//N° 7.b.15
public class Persona {
    char estadocivil; 
    int sueldo;
    boolean mujer;

    public Persona(char estadocivil, int sueldo, boolean mujer) {
        this.estadocivil = estadocivil;
        this.sueldo = sueldo;
        this.mujer = mujer;
    }

    public char getEstadoCivil() {
        return estadocivil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean isMujer() {
        return mujer;
    }

    @Override
    public String toString() {
        return "Persona [Estado Civil=" + estadocivil + ", Sueldo=" + sueldo + ", Mujer=" + mujer + "]";
    }
}
