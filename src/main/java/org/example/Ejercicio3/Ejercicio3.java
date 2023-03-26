package org.example.Ejercicio3;

import java.util.Scanner;
import java.util.function.Function;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    //Funcion que convierte numero decimal en cadana hexadecimal
    Function<Integer, String> decimalToHex = ( num) -> {return Integer.toHexString(num);
    };

    public static void Ejercicio3metodo() {
        int decimal = 123;
        int base = 16;
        Integer hexadecimal = decimalToBase.apply(base).apply(decimal);
        System.out.println("Decimal " + decimal + " en base " + base + " es: " + hexadecimal);

    }
    static Function<Integer, Function<Integer, Integer>> decimalToBase = base -> num -> {
        int result = 0;
        int factor = 1;
        while (num > 0) {
            int rem = num % base;
            result += rem * factor;
            factor *= 10;
            num /= base;
        }
        return result;
    };
}
