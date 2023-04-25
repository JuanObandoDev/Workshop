package ejerciciosPrimerCorte;

/*
 * 9. Programa que imprima los números primos menores a un número entero dado.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero ingresado por el usuario
        System.out.println("Type the max number");
        // guardamos el numero ingresado por el usuario en la variable max
        int max = input.nextInt();
        // creamos un arreglo de numeros primos con el tamaño del numero ingresado por
        // el usuario
        int[] primeNumbers = new int[max];
        // recorremos el arreglo de numeros primos y llamamos a la funcion primeNumber
        for (int i = 1; i <= max; i++) {
            // guardamos el numero primo en la posicion i - 1 del arreglo
            primeNumbers[i - 1] = primeNumber(i);
        }
        // limpiamos el arreglo de numeros primos de los ceros
        primeNumbers = Arrays.stream(primeNumbers).filter(element -> element != 0).toArray();
        // imprimimos el arreglo de numeros primos
        System.out.println(Arrays.toString(primeNumbers));
    }

    public static int primeNumber(int num) {
        // si el numero es 0, 1 o 4 no es primo
        if (num == 0 || num == 1 || num == 4)
            return 0;
        // recorremos el numero desde 2 hasta la mitad del numero
        for (int x = 2; x < num / 2; x++) {
            // si el numero es divisible por algun numero entre 2 y la mitad del numero no
            // es primo
            if (num % x == 0)
                return 0;
        }
        // si el numero no es divisible por ningun numero entre 2 y la mitad del numero
        // es primo
        return num;
    }
}
