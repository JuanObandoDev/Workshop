package ejerciciosSegundoCorte;

import java.util.Scanner;

/*
 * 6. Programa que solicite 2 cadenas de texto y verifique si la segunda cadena esta contenida en la primera
 */

public class ejercicio6 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos las cadenas de texto
        System.out.println("Write a sentence: ");
        String str1 = input.nextLine();
        System.out.println("Write another sentence: ");
        String str2 = input.nextLine();
        // imprimimos si la segunda cadena esta contenida en la primera o no lo esta
        // usando el operador ternario:
        // (condicion) ? (si la condicion es verdadera) : (si la condicion es falsa)
        // .contains() retorna true si la cadena de texto contiene la subcadena dada o
        // false si no
        System.out.println(str1.contains(str2) ? "The second sentence is contained in the first one"
                : "The second sentence isn't contained in the first one");
    }
}
