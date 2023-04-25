package ejerciciosPrimerCorte;

/*
 * 6. Programa que genere un número aleatorio entre 1 y 10, y que le pida al usuario que lo adivine. Si el usuario falla, se le debe mostrar una pista que indique si el número que debe adivinar es mayor o menor que el que ingresó el usuario. El programa debe permitir al usuario intentar adivinar el número hasta 5 intentos.
 */

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // creamos una variable para guardar el numero ingresado por el usuario
        int userNum;
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // creamos un objeto de la clase Random para generar un numero aleatorio
        Random aleatorio = new Random();
        // generamos un numero aleatorio entre 1 y 10
        int num = aleatorio.nextInt((10 - 1) + 1) + 1;
        // recorremos el numero de intentos (5) que tiene el usuario para adivinar el
        // numero aleatorio
        for (int i = 0; i <= 5; i++) {
            // si el usuario ya ha intentado 5 veces, el usuario pierde
            if (i == 5) {
                System.out.println("you lose");
                break;
            }
            // le pedimos al usuario que ingrese un numero entre 1 y 10
            System.out.println("Type a number (1-10)");
            // guardamos el numero ingresado por el usuario en la variable userNum
            userNum = input.nextInt();
            // si el numero ingresado por el usuario es igual al numero aleatorio, el
            // usuario gana
            if (num == userNum) {
                System.out.println("You guess the number: " + num);
                break;
            } else {
                // si el numero ingresado por el usuario es mayor o menor que el numero
                // aleatorio, le damos una pista usando el operador ternario:
                // (condicion) ? (si es verdadero) : (si es falso)
                System.out.println((num > userNum) ? "Type More" : "Type Less");
            }
        }
    }
}
