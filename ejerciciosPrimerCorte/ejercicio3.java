package ejerciciosPrimerCorte;

/*
 * 3. Programa que dado un número entero, determine si es par o impar.
 */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero ingresado por el usuario
        System.out.println("Please type any number: ");
        // guardamos el numero ingresado por el usuario en la variable num
        int num = input.nextInt();
        // imprimimos si el numero es par o impar usando el operador ternario:
        // (condicion) ? (si es verdadero) : (si es falso)
        System.out.println((num % 2 == 0) ? "The number is even" : "The number is odd");
    }
}
