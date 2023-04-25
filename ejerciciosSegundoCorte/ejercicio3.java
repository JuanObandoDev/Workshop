package ejerciciosSegundoCorte;

/*
* 3. Programa que reciba una cadena de texto, y determine si es un palíndromo.
*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el texto a convertir
        System.out.println("Type any text: ");
        // guardamos el texto en una variable de tipo String llamada text
        String text = input.nextLine();
        // imprimimos el texto original, el texto invertido y si es palindromo o no
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + reverse(text));
        System.out.println("Is palindrome? " + isPalindrome(text));
    }

    public static String reverse(String text) {
        // creamos una variable de tipo String llamada reversed
        String reversed = "";
        // recorremos la cadena de texto de atras hacia adelante
        for (int i = text.length() - 1; i >= 0; i--) {
            // agregamos el caracter a la variable reversed
            reversed += text.charAt(i);
        }
        // retornamos la variable reversed
        return reversed;
    }

    public static boolean isPalindrome(String text) {
        // eliminamos los espacios y signos de puntuacion de la cadena de texto y la
        // pasamos a minusculas
        text = text.replaceAll("\\p{IsPunctuation}|\\p{Space}", "").toLowerCase();
        // recorremos la cadena de texto hasta la mitad
        for (int i = 0; i < text.length() / 2; i++) {
            // si el caracter en la posicion i (primera posicion en la primera iteracion,
            // segunda en la segunda, etc) es diferente al caracter en la posicion
            // text.length() - i - 1 (ultima posicion en la primera iteracion, penultima en
            // la segunda, etc) retornamos false
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        // si el ciclo termina sin retornar false retornamos true
        return true;
    }
}
