package ejerciciosSegundoCorte;

/*
 * 7. Programa que genere un arreglo de 100 elementos con valores aleatorios entre 0 y 1, y que cuente cuantos 0's y 1's hay
 */

import java.util.Arrays;

public class ejercicio7 {
    public static void main(String[] args) {
        final int MAX_NUMS = 100;
        // creamos un arreglo de 100 elementos
        int[] zerOne = new int[MAX_NUMS];
        // creamos dos variables para contar los 0's y los 1's
        int zeroCount = 0;
        int oneCount = 0;
        // recorremos el arreglo
        for (int i = 0; i < zerOne.length; i++) {
            // generamos un numero aleatorio entre 0 y 1 y lo guardamos en la posicion i del
            // arreglo
            zerOne[i] = (int) Math.floor(Math.random() * 2);
            // si el numero es 0 aumentamos el contador de 0's
            if (zerOne[i] == 0) {
                zeroCount++;
            } else if (zerOne[i] == 1) { // si el numero es 1 aumentamos el contador de 1's
                oneCount++;
            }
        }
        // imprimimos el arreglo y los contadores
        System.out.println(Arrays.toString(zerOne));
        System.out.println("There are " + zeroCount + " zeros and " + oneCount + " ones");
    }
}
