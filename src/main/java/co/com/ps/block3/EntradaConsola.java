package co.com.ps.block3;

import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre:  ");
        String nombre = scanner.next();
        System.out.println("Su nombre es: " + nombre);

        System.out.println("Digite su edad:  ");
        int edad = scanner.nextInt();
        System.out.println("Su edad es: " + edad);

    }
}
