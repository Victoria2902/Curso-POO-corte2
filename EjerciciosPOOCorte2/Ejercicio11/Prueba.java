package EjerciciosPOOCorte2.Ejercicio11;

public class Prueba {
    public static void main(String[] args) {
       
        Vestido v1 = new Vestido("Marca1", "ModeloA", 100.0);
        Vestido v2 = new Vestido("Marca2", "ModeloB", 150.0);
        Vestido v3 = new Vestido("Marca3", "ModeloC", 200.0);
        Vestido v4 = new Vestido("Marca4", "ModeloD", 250.0);
        Vestido v5 = new Vestido("Marca5", "ModeloE", 300.0);

        
        Tienda tienda = new Tienda();
        tienda.agregarVestido(v1);
        tienda.agregarVestido(v2);
        tienda.agregarVestido(v3);
        tienda.agregarVestido(v4);
        tienda.agregarVestido(v5);

        
        tienda.mostrarVestidos();


        
        double importeSinRebaja = tienda.calcularImporteTotal();
        System.out.println("Importe total sin rebaja: $" + importeSinRebaja);

        
        double porcentajeRebaja = 20.0;
        tienda.aplicarRebaja(porcentajeRebaja);
        

        
        double importeConRebaja = tienda.calcularImporteTotal();
        System.out.println("Importe total con rebaja del " + porcentajeRebaja + "%: $" + importeConRebaja);

        
        double diferencia = importeSinRebaja - importeConRebaja;
        System.out.println("Diferencia de vender con rebaja o sin rebaja: $" + diferencia);
    }    
}
