package ejerciciosSegundoCorte;

/*
 * 5. Programa que reciba una cadena de texto, y muestre la misma cadena en mayúsculas, minúsculas y con la primera letra en mayúscula.
 */

import java.util.Scanner;

class ejercicio5 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el texto a convertir
        System.out.println("Write your full name: ");
        // guardamos el texto en una variable de tipo String llamada name
        String name = input.nextLine();
        // imprimimos el texto original, el texto en minusculas, el texto en mayusculas
        // y el texto con la primera letra en mayusculas
        System.out.println("Your name in lower case: " + name.toLowerCase());
        System.out.println("Your name in upper case: " + name.toUpperCase());
        System.out.println("Your name with first letter in upper case: " + firstLetterToUpperCase(name));
    }

    public static String firstLetterToUpperCase(String text) {
        // pasamos el texto a minusculas
        text = text.toLowerCase();
        // creamos una variable de tipo String llamada res
        String res = "";
        // recorremos la cadena de texto
        for (int i = 0; i < text.length(); i++) {
            // agregamos el caracter a la variable res en mayusculas si es el primer
            // caracter, en minusculas si no
            res += (i == 0) ? Character.toUpperCase(text.charAt(i)) : text.charAt(i);
        }
        // retornamos la variable res
        return res;
    }
}