package org.example.Ejercicio1;

public class Ejercicio1 {
    static final double N = 2;
    static final double PREC = 1e-6;

    public static double bisecIterativo (double min, double max, double prec){
        double med = (min + max)/2;
        while (max - min >= prec){
            if( f(min) * f(med)<0){
                max = med;
            } else {
                min = med;
            }
            med = (min +  max)/2;
        }

        return med;
    }

    static double f (double x)
    {
        return x*x-N;
    }

    public static void Ejercicio1metodo(){
        double min = 0;
        double max = N;
        double root = bisecIterativo(min, max, PREC);
        System.out.println("La raíz de la función f(x) = x^2 - " + N + " en el intervalo [0, " + N + "] es: " + root);

    }
}
