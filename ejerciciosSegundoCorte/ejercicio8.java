package ejerciciosSegundoCorte;

/*
 * 8. Programa que solicite 2 numeros y muestre la suma, resta, multiplicacion y division de ambos
 */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos los numeros
        System.out.println("Write the first number: ");
        double a = input.nextDouble();
        System.out.println("Write the second number: ");
        double b = input.nextDouble();
        // imprimimos la suma, resta, resta positiva, multiplicacion y division de ambos
        // numeros
        System.out.println(a + " + " + b + " = " + addition(a, b));
        System.out.println(a + " - " + b + " = " + subtraction(a, b));
        // usamos el operador ternario:
        // (condicion) ? (si la condicion es verdadera) : (si la condicion es falsa)
        // para imprimir la resta positiva
        System.out.println(
                (a > b) ? (a + " - " + b + " = " + subtraction(a, b)) : (b + " - " + a + " = " + subtraction(b, a)));
        System.out.println(a + " * " + b + " = " + multiplication(a, b));
        // usamos el operador ternario:
        // (condicion) ? (si la condicion es verdadera) : (si la condicion es falsa)
        // para validar que el segundo numero no sea 0
        System.out.println((b == 0) ? ("Division by zero is not allowed") : (a + " / " + b + " = " + division(a, b)));
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}
