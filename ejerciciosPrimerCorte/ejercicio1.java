package ejerciciosPrimerCorte;

/*
 * 1. Programa que dado un arreglo de enteros, calcule el promedio de los mismos.
 */

public class ejercicio1 {
    public static void main(String[] args) {
        // imprimimos el promedio de los elementos del arreglo de enteros llamando a la
        // funcion calcProm
        System.out.println("The prom is: " + calcProm(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    }

    public static float calcProm(int[] args) {
        float prom = 0;
        // recorremos el arreglo y sumamos todos los elementos
        for (int i = 0; i < args.length; i++) {
            prom += args[i];
        }
        // dividimos la suma de todos los elementos entre la cantidad total de elementos
        prom /= args.length;
        // retornamos el promedio
        return prom;
    }
}
