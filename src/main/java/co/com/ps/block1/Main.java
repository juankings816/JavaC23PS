package co.com.ps.block1;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        int edad = 36;
        double fracciones = 1.2;
        boolean esVerdad = false;
        short min = 60;
        char letra = 'a';
        Date fecha = new Date();
        LocalDate fechaLocal = LocalDate.now();

        System.out.println(edad);
        System.out.println(fracciones);
        System.out.println(esVerdad);
        System.out.println(fecha);
        System.out.println(fechaLocal);
    }
}
