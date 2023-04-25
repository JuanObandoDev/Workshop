package ejerciciosSegundoCorte;

import java.util.Scanner;

/*
 * 10. programa que genere un menu de 4 opciones usando funciones
 */

public class ejercicio10 {
    public static void main(String[] args) {
        // creamos una variable para almacenar la opcion seleccionada por el usuario
        int op = 0;
        // creamos un ciclo que se repita mientras la opcion seleccionada sea diferente
        // a 4
        while (op != 4) {
            // mostramos el menu
            menu();
            // leemos la opcion seleccionada por el usuario
            op = selectOption();
            // validamos la opcion seleccionada por el usuario
            validateOption(op);
        }
    }

    public static void menu() {
        // mostramos el menu
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
    }

    public static int selectOption() {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos la opcion seleccionada por el usuario
        System.out.println("Select an option: ");
        // retornamos la opcion seleccionada por el usuario
        return input.nextInt();
    }

    public static void validateOption(int op) {
        // validamos la opcion seleccionada por el usuario
        switch (op) {
            // si la opcion es 1 mostramos un mensaje
            case 1:
                System.out.println("You selected option 1");
                break;
            // si la opcion es 2 mostramos un mensaje
            case 2:
                System.out.println("You selected option 2");
                break;
            // si la opcion es 3 mostramos un mensaje
            case 3:
                System.out.println("You selected option 3");
                break;
            // si la opcion es 4 mostramos un mensaje y terminamos el programa
            case 4:
                System.out.println("You selected option 4");
                System.out.println("Bye");
                break;
            // si la opcion no es ninguna de las anteriores mostramos un mensaje de error
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
