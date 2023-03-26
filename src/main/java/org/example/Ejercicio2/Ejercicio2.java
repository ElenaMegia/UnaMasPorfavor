package org.example.Ejercicio2;

import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    static IntConsumer encontrarFactoresPrimosLambda;

    static {
        encontrarFactoresPrimosLambda = (int num) -> {
            IntStream.rangeClosed(2, num)
                    .filter(x -> num % x == 0)
                    .findFirst()
                    .ifPresent(x -> {
                        System.out.println(x);
                        encontrarFactoresPrimosLambda.accept(num / x);
                    });
        };
    }

    public static void Ejercicio2metodo() {
        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();

        // Ejecutar el método iterativo
        System.out.println("Factores primos (iterativo):");
        imprimirFactoresPrimosIterativo(num);

        // Ejecutar el método lambda
        System.out.println("Factores primos (lambda):");
        encontrarFactoresPrimosLambda.accept(num);
    }

    // Métodos implementados
    static void imprimirFactoresPrimosIterativo(int num) {
        int div = 2;
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num = num / div;
            } else {
                div++;
            }
        }
    }
}