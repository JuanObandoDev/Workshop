package ejerciciosSegundoCorte;

/*
 * 2. Programa que genere la secuencia de Fibonacci hasta el término n brindado por el usuario.
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero a convertir
        System.out.println("Type any number: ");
        // guardamos el numero en una variable de tipo int llamada num
        int num = input.nextInt();
        // imprimimos la secuencia de fibonacci hasta el numero ingresado por el usuario
        for (int i = 0; i <= num; i++) {
            // si el numero de la secuencia es menor o igual al numero ingresado por el
            // usuario lo imprimimos
            if (fibonacciSequence(i) <= num) {
                System.out.print(fibonacciSequence(i) + ", ");
            } else { // si el numero de la secuencia es mayor al numero ingresado por el usuario
                     // terminamos el ciclo
                break;
            }
        }
    }

    public static long fibonacciSequence(int number) {
        // si el numero es menor o igual a 0 retornamos 0
        if (number <= 0) {
            return 0;
        } else if (number == 1) { // si el numero es igual a 1 retornamos 1
            return 1;
        } else { // si el numero es mayor a 1 retornamos la suma de los dos numeros anteriores de
                 // la secuencia de fibonacci
            return fibonacciSequence(number - 1) + fibonacciSequence(number - 2); // llamada recursiva
        }
    }
}
