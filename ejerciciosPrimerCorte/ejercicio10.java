package ejerciciosPrimerCorte;

/*
 * 10. Programa que dado el lado izquierdo, derecho y la base de un triángulo calcule su perímetro y área.
 */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        // creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // leemos los lados del triangulo
        System.out.println("Type the left side: ");
        double leftSide = input.nextDouble();
        System.out.println("Type the right side: ");
        double rightSide = input.nextDouble();
        System.out.println("Type the base side: ");
        double base = input.nextDouble();
        // calculamos el perimetro con la formula: perimetro = ladoIzquierdo +
        // ladoDerecho + base
        double perimeter = Math.round(leftSide + rightSide + base); // redondeamos el resultado hacia arriba
        // calculamos la altura con la formula: altura = raiz(ladoIzquierdo^2 -
        // (base^2)/4)
        // math.pow(base, 2) es equivalente a base^2
        double height = Math.round(Math.sqrt(Math.pow(leftSide, 2) - (Math.pow(base, 2)) / 4));
        // calculamos el area con la formula: area = (base * altura) / 2
        double area = (base * height) / 2;
        // imprimimos el perimetro y el area del triangulo
        System.out.println("The perimeter is: " + perimeter + "cm");
        System.out.println("The area is: " + area + "cm²");
    }
}
