package co.com.ps.block6;

import java.util.Scanner;

public class TrabajoEnClase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operacion;

        System.out.println("----Bienvenido a tu calculadora----");
        try {
            System.out.print("Ingresa el primer número: ");
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingresa el segundo número: ");
            num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Selecciona la operación:");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            operacion = scanner.nextLine().charAt(0);

            switch (operacion) {
                case '1':
                    System.out.println("El resultado de la suma es: " + suma(num1, num2));
                    break;
                case '2':
                    System.out.println("El resultado de la resta es: " + resta(num1, num2));
                    break;
                case '3':
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion(num1, num2));
                    break;
                case '4':
                    System.out.println("El resultado de la división es: " + division(num1, num2));
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}
