package ejerciciosPrimerCorte;

/*
 * 5. Programa que dado un número entero, lo convierta a binario.
 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero ingresado por el usuario
        System.out.println("Type any number: ");
        // guardamos el numero ingresado por el usuario en la variable num
        int num = input.nextInt();
        // imprimimos el resultado de la conversion a binario llamando a la funcion
        // intToBinary
        System.out.println("The conversion result is: " + intToBinary(num));
    }

    public static String intToBinary(int a) {
        // creamos una variable de tipo String para guardar el resultado de la
        // conversion
        String res = "";
        // mientras el numero sea diferente de 0
        while (a != 0) {
            // concatenamos el residuo de la division entre 2 del numero a la variable res
            res += a % 2;
            // dividimos el numero entre 2 y guardamos el resultado en la variable que
            // contiene el numero (a)
            a /= 2;
        }
        // retornamos el resultado de la conversion llamando a la funcion reverse porque
        // el resultado de la conversion esta al reves
        return reverse(res);
    }

    public static String reverse(String text) {
        // creamos una variable de tipo String para guardar el resultado de la funcion
        String reversed = "";
        // recorremos el texto desde el ultimo caracter hasta el primero
        for (int i = text.length() - 1; i >= 0; i--) {
            // concatenamos el caracter en la posicion i a la variable reversed
            reversed += text.charAt(i);
        }
        // retornamos el resultado de la funcion
        return reversed;
    }
}
