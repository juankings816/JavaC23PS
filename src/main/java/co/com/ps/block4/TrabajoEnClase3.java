package co.com.ps.block4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Por favor ingresa 8 palabras:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = teclado.next();
            list.add(palabra);
        }
        System.out.println("Palabras con menos de 5 letras:");
        for (String palabra : list) {
            if (palabra.length() < 5) {
                System.out.println(palabra);
            }
        }
    }
}