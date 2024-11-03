package EjerciciosPOOCorte2.Ejercicio12;

public class Prueba {
    public static void main(String[] args) {
        
        Piloto piloto1 = new Piloto("Lewis Hamilton", 5000000.0);
        Piloto piloto2 = new Piloto("Max Verstappen", 7500000.0);
        Piloto piloto3 = new Piloto("Charles Leclerc", 6000000.0);

        
        CocheFormula1 coche1 = new CocheFormula1("Mercedes", 1000, piloto1);
        CocheFormula1 coche2 = new CocheFormula1("Red Bull", 1100, piloto2);
        CocheFormula1 coche3 = new CocheFormula1("Ferrari", 1050, piloto3);

        
        CocheFormula1[] coches = {coche1, coche2, coche3};

        
        System.out.println("Escudería de cada coche:");
        for (CocheFormula1 coche : coches) {
            System.out.println(coche.getEscuderia());
        }

        
        System.out.println("\nEscudería y piloto de cada coche:");
        for (CocheFormula1 coche : coches) {
            System.out.println("Escudería: " + coche.getEscuderia() + ", Piloto: " + coche.getPiloto().getNombre());
        }

        
        CocheFormula1 cocheMasPotente = coches[0];
        for (CocheFormula1 coche : coches) {
            if (coche.getPotencia() > cocheMasPotente.getPotencia()) {
                cocheMasPotente = coche;
            }
        }
        System.out.println("\nCoche con mayor potencia:");
        System.out.println(cocheMasPotente);

        
        Piloto pilotoMejorPagado = coches[0].getPiloto();
        for (CocheFormula1 coche : coches) {
            if (coche.getPiloto().getSalario() > pilotoMejorPagado.getSalario()) {
                pilotoMejorPagado = coche.getPiloto();
            }
        }
        System.out.println("\nPiloto que más cobra:");
        System.out.println(pilotoMejorPagado);

        
        System.out.println("\nEscudería del piloto que más cobra:");
        for (CocheFormula1 coche : coches) {
            if (coche.getPiloto().equals(pilotoMejorPagado)) {
                System.out.println(coche.getEscuderia());
                break;
            }
        }
        Constructor constructor1 = new Constructor("Constructor A", coche1);
        Constructor constructor2 = new Constructor("Constructor B", coche2);
        Constructor constructor3 = new Constructor("Constructor C", coche3);

        
        Constructor[] constructores = {constructor1, constructor2, constructor3};

        
        System.out.println("\nConstructor del coche con el piloto que más cobra:");
        for (Constructor constructor : constructores) {
            if (constructor.getCocheFormula1().getPiloto().equals(pilotoMejorPagado)) {
                System.out.println(constructor.getNombre());
                break;
            }
        }
    }
}
