package ejerciciosSegundoCorte;

/*
 * 1. Programa que convierta un número entero entre 1 y 3999 a número romano.
 */

import java.util.Scanner;

class ejercicio1 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero a convertir
        System.out.println("Type any number between 1 and 3999: ");
        // guardamos el numero en una variable de tipo int llamada num
        int num = input.nextInt();
        // verificamos que el numero este entre 1 y 3999
        if (num < 1 || num > 3999) {
            // si no esta entre 1 y 3999 imprimimos un mensaje de error y terminamos el
            // programa
            System.out.println("The number is not between 1 and 3999");
            return;
        } else {
            // si esta entre 1 y 3999 imprimimos el numero en romano usando la funcion
            // romanNumber
            System.out.println("The number in roman is: " + romanNumber(num));
        }
    }

    public static String romanNumber(int number) {
        // creamos una variable de tipo String llamada roman para guardar el numero en
        // romano
        String roman = "";
        // creamos dos arreglos, uno con las letras romanas y otro con los numeros
        // equivalentes a las letras
        String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        // recorremos cualquiera de los arreglos (numeros o letras)
        for (int i = 0; i < numbers.length; i++) {
            // mientras el numero sea mayor o igual al numero en la posicion i del arreglo
            // numbers
            while (number >= numbers[i]) {
                // concatenamos la letra en la posicion i del arreglo letters a la variable
                // roman
                roman += letters[i];
                // restamos el numero en la posicion i del arreglo numbers a la variable number
                number -= numbers[i]; // restamos el numero equivalente a la letra concatenada
            }
        }
        // retornamos la variable roman
        return roman;
    }
}
