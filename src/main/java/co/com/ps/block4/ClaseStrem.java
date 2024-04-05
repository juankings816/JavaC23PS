package co.com.ps.block4;

import java.util.Arrays;
import java.util.List;

public class ClaseStrem {
    public static void main(String[] args) {

        // Ejemplo de Stream
        List<String> palabras = Arrays.asList("Hola", "Mundo", "Stream", "Ejemplo");
       var miLista = palabras.stream().filter(palabra->palabra.length()>4).toList();

       List<String> palabra2 = Arrays.asList("Java", "es", "genial");

       var palabrasEnMayuscula = palabra2.stream().map(String::toUpperCase).toList();

       palabrasEnMayuscula.stream().forEach(System.out::println);
    }
}
