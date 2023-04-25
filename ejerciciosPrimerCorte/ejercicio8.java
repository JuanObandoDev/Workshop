package ejerciciosPrimerCorte;

/*
 * 8. Programa que dado un número entero, calcule su factorial.
 */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero ingresado por el usuario
        System.out.println("Type any number: ");
        // guardamos el numero ingresado por el usuario en la variable num
        int num = input.nextInt();
        // imprimimos el factorial del numero ingresado por el usuario llamando a la
        // funcion factorial
        System.out.println("the factorial is: " + factorial(num));
    }

    public static long factorial(int num) {
        // si el numero es menor a cero o igual a cero retornamos 1
        if (num <= 0) {
            return 1;
        }
        // si el numero es mayor a cero retornamos el numero multiplicado por el
        // factorial del numero menos 1
        return num * factorial(num - 1); // llamada recursiva
    }
}
