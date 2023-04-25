package ejerciciosPrimerCorte;

/*
 * 4. Programa que dado un número entero, determine si es primo o no.
 */

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero ingresado por el usuario
        System.out.println("Type any number: ");
        // guardamos el numero ingresado por el usuario en la variable num
        int num = input.nextInt();
        // imprimimos si el numero es primo o no usando el operador ternario:
        // (condicion) ? (si es verdadero) : (si es falso)
        // llamamos a la funcion primeNumber para saber si el numero es primo o no
        System.out.println((primeNumber(num) ? "Is Prime number" : "Isn't Prime number"));
    }

    public static boolean primeNumber(int num) {
        // si el numero es 0, 1 o 4 no es primo
        if (num == 0 || num == 1 || num == 4)
            return false;

        // recorremos el numero desde 2 hasta la mitad del numero
        for (int x = 2; x < (num / 2); x++) {
            // si el numero es divisible por algun numero entre 2 y la mitad del numero no
            // es primo
            if (num % x == 0)
                return false;
        }

        // si el numero no es divisible por ningun numero entre 2 y la mitad del numero
        // es primo
        return true;
    }
}
