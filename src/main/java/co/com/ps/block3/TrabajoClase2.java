package co.com.ps.block3;

import java.util.Scanner;

public class TrabajoClase2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("------Calculadora basica------");
        System.out.println("Ingresa 2 numeros para poder realizar sus operaciones matematicas");
        System.out.println("Numero 1");
        int num1 = teclado.nextInt();
        System.out.println("Numero 2");
        int num2 = teclado.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicar = num1 * num2;
        double dividir =  num1 / num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " es: " + multiplicar);
        System.out.println("La división de " + num1 + " / " + num2 + " es: " + dividir);
    }
}
