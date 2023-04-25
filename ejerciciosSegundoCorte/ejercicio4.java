package ejerciciosSegundoCorte;

/*
 * 4. Programa que reciba un numero en una cadena y lo convierta de entre los sistemas numericos: decimal, octal, hexadecimal y binario.
 */

import java.util.Arrays;
import java.util.HashMap; // Diccionario - Objetos {clave: valor} {key: value}
import java.util.Map; // Diccionario - Objetos {clave: valor} {key: value}
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos el numero a convertir
        System.out.println("Type any number: ");
        // guardamos el numero en una variable de tipo String llamada number
        String number = input.nextLine();
        // imprimimos el numero original y sus conversiones
        System.out.println("Original number: " + number + ", type: " + number.getClass().getSimpleName());
        System.out.println("String to integer: " + stringToInteger(number) + ", type: Decimal");
        System.out.println("Decimal to octal: " + decimalToOctal(stringToInteger(number)) + ", type: Octal");
        System.out.println("Decimal to hexadecimal: " + decimalToHexa(stringToInteger(number)) + ", type: Hexadecimal");
        System.out.println("Decimal to binary: " + decimalToBinary(stringToInteger(number)) + ", type: Binary");
    }

    public static int stringToInteger(String number) {
        // Integer.parseInt() convierte un String a un numero entero
        return Integer.parseInt(number);
    }

    public static long decimalToOctal(int number) {
        // creamos una variable de tipo long para almacenar el numero octal
        long octal = 0;
        // iteramos mientras el numero sea diferente de 0
        for (int i = 1; number != 0; i *= 10) {
            // el numero octal es igual al residuo de la division del numero entre 8
            // multiplicado por el valor de i el cual aumenta por 10 en cada iteracion
            octal += (number % 8) * i;
            // el numero es igual a la division entera del numero entre 8
            number /= 8;
        }
        // retornamos el numero octal
        return octal;
    }

    public static String decimalToHexa(int number) {
        // creamos un arreglo de tipo int de 20 posiciones
        int[] hex = new int[20];
        // llenamos el arreglo con el numero 16
        for (int i = 0; i < hex.length; i++) {
            hex[i] = 16;
        }
        // creamos una variable de tipo int llamada residue y la igualamos al numero
        int residue = number;
        // creamos una variable de tipo int llamada i y la igualamos a 0
        int i = 0;
        // iteramos mientras el residuo sea mayor o igual a 16
        while (residue >= 16) {
            // creamos una variable de tipo double llamada res y la igualamos al resultado
            // de residue dividido entre 16
            double res = (double) residue / 16;
            // creamos una variable de tipo int llamada resInteger y la igualamos al valor
            // entero de res
            int resInteger = (int) res;
            // el valor de la posicion i del arreglo hex será igual a la resta de res y
            // resInteger multiplicado por 16
            hex[i] = ((int) ((res - resInteger) * 16));
            // el valor de residue será igual a resInteger
            residue = resInteger;
            // aumentamos el valor de i en 1
            i++;
        }
        // el valor de la posicion i del arreglo hex será igual a residue
        hex[i] = residue;
        // filtramos el arreglo hex para eliminar los 16 que no se modificaron
        hex = Arrays.stream(hex).filter(element -> element != 16).toArray();
        // invertimos el arreglo hex
        hex = reverseArray(hex);
        // retornamos el arreglo hex convertido a String
        return createRes(hex);
    }

    public static int[] reverseArray(int array[]) {
        // creamos un arreglo de tipo int llamado reversedArray de la misma longitud del
        // arreglo array
        int[] reversedArray = new int[array.length];
        // creamos una variable de tipo int llamada j y la igualamos a la longitud del
        // arreglo array
        int j = array.length;
        // iteramos mientras i sea menor a la longitud del arreglo array
        for (int i = 0; i < array.length; i++) {
            // el valor de la posicion j - 1 del arreglo reversedArray será igual al valor
            // de la posicion i del arreglo array
            // es decir que la ultima posicion del arreglo reversedArray será igual a la
            // primera posicion del arreglo array
            reversedArray[j - 1] = array[i];
            // disminuimos el valor de j en 1
            j -= 1;
        }
        // retornamos el arreglo reversedArray
        return reversedArray;
    }

    public static String createRes(int[] array) {
        // creamos un diccionario de tipo Map llamado hexMap
        Map<Integer, String> hexMap = new HashMap<Integer, String>();
        // agregamos los valores del 10 al 15 al diccionario
        hexMap.put(10, "A");
        hexMap.put(11, "B");
        hexMap.put(12, "C");
        hexMap.put(13, "D");
        hexMap.put(14, "E");
        hexMap.put(15, "F");
        // creamos una variable de tipo String llamada res y la igualamos a un String
        // vacio
        String res = "";
        // iteramos mientras i sea menor a la longitud del arreglo array
        for (int i = 0; i < array.length; i++) {
            // si el valor de la posicion i del arreglo array es mayor o igual a 10
            if (array[i] >= 10) {
                // extraemos el valor de la posicion i del arreglo array y lo usamos como llave
                // para acceder al equivalente en hexadecimal en el diccionario hexMap y lo
                // agregamos a la variable res
                res += hexMap.get(array[i]);
            } else {
                // si el valor de la posicion i del arreglo array es menor a 10 lo agregamos a
                // la variable res tal cual
                res += array[i];
            }
        }
        // retornamos la variable res
        return res;
    }

    public static String decimalToBinary(int number) {
        // creamos una variable de tipo String llamada binary y la igualamos a un String
        // vacio
        String binary = "";
        // iteramos mientras el numero sea diferente de 0
        while (number != 0) {
            // el valor de la variable binary será igual al residuo de la division del
            // numero entre 2
            binary += number % 2;
            // el numero es igual a la division entera del numero entre 2
            number /= 2;
        }
        // retornamos el valor de la variable binary pero invertido usando el metodo
        // reverse creado abajo ya que la conversion esta al reves
        return reverse(binary);
    }

    public static String reverse(String text) {
        // creamos una variable de tipo String llamada reversed y la igualamos a un
        // String vacio
        String reversed = "";
        // iteramos desde la ultima posicion del String text hasta la primera
        for (int i = text.length() - 1; i >= 0; i--) {
            // el valor de la variable reversed será igual al valor de la posicion i del
            // String text
            reversed += text.charAt(i);
        }
        // retornamos el valor de la variable reversed
        return reversed;
    }
}
