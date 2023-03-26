package org.example;

public class Ejercicio4 {

    public static boolean isPalindromoRecursivo(String str) {
        boolean isPalindromo = false;
        if (str.length() <= 1) {
            isPalindromo= true;
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            String mid = str.substring(1, str.length() - 1);
            isPalindromo = (firstChar == lastChar) && isPalindromoRecursivo(mid);
        }
        return isPalindromo;
    }

    public static boolean isPalindromoIterativo(String str) {
        boolean isPalindromo = false;
        int length = str.length();
        int n = length / 2;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str.charAt(length - i - 1)) {
                isPalindromo = true;
            }
        }
        return isPalindromo;
    }


    public static void Ejercicio4metodo () {
        String str = "DABALEARROZALAZORRAELABAD";
        boolean isPalindromo = isPalindromoRecursivo(str);
        System.out.println(isPalindromo ? "Es palíndromo" : "No es palíndromo");
        boolean isPalindromoIterativo = isPalindromoIterativo(str);
        System.out.println(isPalindromoIterativo ? "Es palíndromo" : "No es palíndromo");
    }

}
