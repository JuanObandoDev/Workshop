package ejerciciosPrimerCorte;

/*
 * 2. Dado un arreglo de enteros, ordenarlos de menor a mayor.
 */

import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 6, 7, 8, 5, 1, 3, 8, 4, 3, 8, 6, 1, 6 };
        // imprimimos el arreglo antes de ordenarlo
        System.out.println("nums: " + Arrays.toString(nums));
        // ordenamos el arreglo
        Arrays.sort(nums); // sort es una funcion de la clase Arrays que ordena un arreglo de menor a mayor
        // imprimimos el arreglo despues de ordenarlo
        System.out.println("sorted: " + Arrays.toString(nums));
    }
}
