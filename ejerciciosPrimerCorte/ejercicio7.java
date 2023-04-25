package ejerciciosPrimerCorte;

/*
 * 7. Programa que convierta de grados Celsius a Fahrenheit y viceversa.
 */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        // creamos una variable res para guardar el resultado de la conversion
        double res;
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos los grados ingresados por el usuario
        System.out.println("Type the degrees");
        // guardamos los grados ingresados por el usuario en la variable degrees
        int degrees = input.nextInt();
        // leemos el tipo de grados ingresados por el usuario
        System.out.println("Type Celsius or Fahrenheit C/F");
        input.nextLine(); // limpiamos el buffer del teclado para poder leer el tipo de grados ya que el
                          // metodo nextInt no lee el salto de linea que se genera al presionar enter
        // guardamos el tipo de grados ingresados por el usuario en la variable
        // typeDegrees y lo convertimos a minusculas
        String typeDegrees = input.nextLine().toLowerCase();
        // si el tipo de grados es igual a C
        if (typeDegrees.equals("C")) {
            // convertimos los grados a F
            res = (degrees * 1.8) + 32; // formula para convertir de C a F
            // imprimimos el resultado de la conversion
            System.out.println(degrees + "C° are equivalent to " + res + "F°");
        } else if (typeDegrees.equals("F")) { // si el tipo de grados es igual a F
            // convertimos los grados a C
            res = (degrees - 32) / 1.8; // formula para convertir de F a C
            // imprimimos el resultado de la conversion
            System.out.println(degrees + "F° are equivalent to " + res + "C°");
        }
    }
}