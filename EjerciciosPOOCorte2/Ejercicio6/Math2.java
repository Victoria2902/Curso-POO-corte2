package EjerciciosPOOCorte2.Ejercicio6;
//N° 8.a.8
public class Math2 {
public int min(int[] a) {
    int min = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}

public int max(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    return max;
}

public double min(double[] a) {
    double min = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}

public double max(double[] a) {
    double max = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    return max;
    
}
}
