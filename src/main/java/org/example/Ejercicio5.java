package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio5 {


    public static int Recursivo(int m, int n) {
        int total = 0;
        if (n == 0) {
            total= m;
        } else {
            total= Recursivo(n, m % n);
        }
        return total;
    }

    public static int Iterativo(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void Ejercicio5metodo() {
        int m = 24;
        int n = 16;

        System.out.println("Recursivo:  " + Recursivo(m, n));

        System.out.println("Iterativo:  " + Iterativo(m, n));

        BiFunction<Integer, Integer, Integer> Lambda = (x, y) -> {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        };
        System.out.println("Lambda: " + Lambda.apply(m, n));
    }
}
